package musteriVarlik;

public class BireyselMusteri extends Musteri{
String tcNo;


public String getTcNo() {
	return tcNo;
}

public void setTcNo(String tcNo) {
	this.tcNo = tcNo;
}

public BireyselMusteri(int id, String adSoyad, int musteriNo, String tcNo) {
	super(id, adSoyad, musteriNo);
}


}
