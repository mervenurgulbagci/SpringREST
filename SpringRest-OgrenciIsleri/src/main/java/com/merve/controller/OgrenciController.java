package com.merve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;
import com.merve.service.OgrenciService;

@Controller
@RequestMapping("/")
public class OgrenciController {
	
	@Autowired
	private OgrenciService ogrenciService;
	String status;
	
	@GetMapping("/")
	public String home() {
		status = null;
		return "home";
	}
	
	@GetMapping("/ogrenciler")
	public String ogrenciList(Model model) {
		List<Ogrenci> ogrenci_listesi = ogrenciService.getOgrenciler();
		model.addAttribute("ogrenciler", ogrenci_listesi);
		model.addAttribute("status", status);
		return "home";
	}

	@GetMapping("/ogrenci-mezun-et")
	public String mezunEt(@RequestParam("ogrenciId") int ogrId, Model model) {
		Ogrenci ogrenci = ogrenciService.getOgrenci(ogrId);
		List<Kitap> kitap = ogrenciService.getKitaplar();
		int sayac = 0;
		for (Kitap kitapList : kitap) {
			if (kitapList.getOgrenci_id() != null) {
				if (kitapList.getOgrenci_id() == ogrenci.getId()) {
					sayac++;
				}
			}
		}
		if (sayac == 0) {
			if (ogrenci.getMezuniyet() == null) {
				ogrenci.setMezuniyet("mezun");
				ogrenciService.saveOgrenci(ogrenci);
				status = "SUCCESS : Öğrenci mezun edildi...";
				return "redirect:/ogrenciler";
			} else {
				status = "UYARI : Kişi zaten mezundur!";
				return "redirect:/ogrenci-status";
			}
		} else {
			status = "HATA : Kütüphane ile ilişiği bulunmaktadır! Mezun edilemedi...";
			return "redirect:/ogrenciler";
		}
	}

	@GetMapping("/ogrenci-status")
	public String statusOgrenci(Model model) {
		model.addAttribute("status", status);
		return "redirect:/ogrenciler";
	}
}
