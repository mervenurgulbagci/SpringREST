package com.merve.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="OGRENCIM")
public class Ogrenci {
	@Id
	@Column(name="OGRENCI_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ogr-seq")
	@SequenceGenerator(name="ogr-seq",sequenceName = "OGRENCIM_SEQ",allocationSize = 1)
	private int id;
	
	@Column(name="ISIM")
	private String isim;
	
	@Column(name="SOYISIM")
	private String soyisim;
	
	@Column(name = "MEZUNIYET")
	private String mezuniyet;
	
	@Column(name = "OGRENCI_NO")
	private String ogrenci_no;

	public String getOgrenci_no() {
		return ogrenci_no;
	}

	public void setOgrenci_no(String ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMezuniyet() {
		return mezuniyet;
	}

	public void setMezuniyet(String mezuniyet) {
		this.mezuniyet = mezuniyet;
	}

	public Ogrenci() {
		super();
	}

	public Ogrenci(String isim, String soyisim, String mezuniyet, String ogrenci_no) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.mezuniyet = mezuniyet;
		this.ogrenci_no = ogrenci_no;
	}

	
}
