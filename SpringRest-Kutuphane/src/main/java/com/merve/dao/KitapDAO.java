package com.merve.dao;

import java.util.List;

import com.merve.domain.Kitap;
import com.merve.domain.Ogrenci;

public interface KitapDAO {
	public List<Kitap> getKitaplar();

	public Ogrenci getOgrenci(int ogrId);

	public List<Ogrenci> getOgrenciler();

	public Kitap getKitap(int kitapId);

	public void saveKitap(Kitap kitap);

}
