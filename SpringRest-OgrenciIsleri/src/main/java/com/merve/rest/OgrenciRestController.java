package com.merve.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.merve.domain.Ogrenci;
import com.merve.service.OgrenciService;

@RestController
@RequestMapping("/api")
public class OgrenciRestController {
	
	@Autowired
	private OgrenciService ogrenciService;
	
	@GetMapping("/rest-ogrenciler")
	public List<Ogrenci> ogrenciler(Model model){
		List<Ogrenci> ogrenciList = ogrenciService.getOgrenciler();
		model.addAttribute("restOgrenciler", ogrenciList);
		return ogrenciList;
	}
		
	@GetMapping("/rest-ogrenciler/{ogrId}")
	public Ogrenci getogrenci(@PathVariable int ogrId){
		return ogrenciService.getOgrenci(ogrId);
	}
	
	@PutMapping("/")
	public Ogrenci updateOgrenci(@RequestBody Ogrenci ogrenci) {
		ogrenciService.updateOgrenci(ogrenci);
		return ogrenci;
	}

}
