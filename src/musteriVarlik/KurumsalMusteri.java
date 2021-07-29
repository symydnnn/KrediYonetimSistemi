package musteriVarlik;

public class KurumsalMusteri extends Musteri{
	String vergiNo;

	public String getVergiNo() {
		return vergiNo;
	}

	public void setVergiNo(String vergiNo) {
		this.vergiNo = vergiNo;
	}


	public KurumsalMusteri(int id, String adSoyad, int musteriNo, String vergiNo) {
		super(id, adSoyad, musteriNo);
		
	}
	

}
