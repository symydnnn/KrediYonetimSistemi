package musteriVarlik;

import krediVarlik.Kredi;

public class Musteri extends Kredi{
	private int id;
	private String adSoyad;
	private int musteriNo;
	
	public Musteri() {

	}
	
	public Musteri(int id, String adSoyad, int musteriNo) {
		this.id = id;
		this.adSoyad = adSoyad;
		this.musteriNo = musteriNo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public int getMusteriNo() {
		return musteriNo;
	}
	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}
	
}
