package com.merve.service;

import com.merve.service.OgrenciService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.merve.dao.OgrenciDAO;
import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;
@Component
public class OgrenciServiceImpl implements OgrenciService {
	
	@Autowired
	private OgrenciDAO ogrDao;

	@Transactional
	@Override
	public List<Ogrenci> getOgrenciler() {
		return ogrDao.getOgrenciler();
	}

	@Transactional
	@Override
	public Ogrenci getOgrenci(int ogrId) {
		return ogrDao.getOgrenci(ogrId);
	}

	@Transactional
	@Override
	public void updateOgrenci(Ogrenci ogrenci) {
		 ogrDao.saveOgrenci(ogrenci);
	}

	@Override
	public List<Kitap> getKitaplar() {
		return ogrDao.getKitaplar();
	}

	@Transactional
	@Override
	public void saveOgrenci(Ogrenci ogr) {
		ogrDao.saveOgrenci(ogr);		
	}
}
