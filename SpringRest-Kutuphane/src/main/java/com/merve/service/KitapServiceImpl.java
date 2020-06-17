package com.merve.service;

import com.merve.dao.KitapDAO;
import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;
import com.merve.service.KitapService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
public class KitapServiceImpl implements KitapService {


	@Autowired
	private KitapDAO kitapDao;

	@Transactional
	@Override
	public List<Kitap> getKitaplar() {

		return kitapDao.getKitaplar();
	}

	@Transactional
	@Override
	public Kitap getKitap(int kitapId) {

		return kitapDao.getKitap(kitapId);
	}

	@Override
	public Ogrenci getOgrenci(int ogrId) {

		return kitapDao.getOgrenci(ogrId);
	}

	
	@Override
	public List<Ogrenci> getOgrenciler() {

		System.out.println("Kitap servisindesin");
		return kitapDao.getOgrenciler();
	}

	@Transactional
	@Override
	public void saveKitap(Kitap kitap) {
		kitapDao.saveKitap(kitap);

	}
}
