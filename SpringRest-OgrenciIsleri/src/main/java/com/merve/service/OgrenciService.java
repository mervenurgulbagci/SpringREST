package com.merve.service;

import java.util.List;

import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;

public interface OgrenciService {
	public List<Ogrenci> getOgrenciler();

	public Ogrenci getOgrenci(int ogrId);

	public void updateOgrenci(Ogrenci ogrenci);

	public List<Kitap> getKitaplar();

	public void saveOgrenci(Ogrenci ogrenci);

}
