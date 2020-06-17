package com.merve.dao;

import java.util.List;

import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;

public interface OgrenciDAO {
	List<Ogrenci> getOgrenciler();

	Ogrenci getOgrenci(int ogrId);

	void saveOgrenci(Ogrenci ogrenci);

	List<Kitap> getKitaplar();

}
