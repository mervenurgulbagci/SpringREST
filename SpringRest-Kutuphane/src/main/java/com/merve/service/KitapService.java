package com.merve.service;

import java.util.List;

import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;

public interface KitapService {

	public List<Kitap> getKitaplar();

	public Ogrenci getOgrenci(int ogrId);

	public List<Ogrenci> getOgrenciler();

	public Kitap getKitap(int kitapId);

	public void saveKitap(Kitap kitap);

}
