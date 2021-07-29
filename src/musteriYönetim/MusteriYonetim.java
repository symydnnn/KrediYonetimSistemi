package musteriYönetim;

import musteriVarlik.Musteri;
import krediVarlik.Kredi;
import loglama.Logger;

public class MusteriYonetim extends Musteri{
	
	private Logger logger;
	
	public MusteriYonetim(Logger logger) {
		this.logger = logger;
	}
	
	
	private Kredi kredi;
	
	public MusteriYonetim(Kredi kredisi){
		this.kredi= kredisi;
	}
	
	public void krediCesidi(Kredi kredisi) {
			kredi.krediTuru();
	}
	

	public void sil(Musteri musteri) {
		System.out.println("Müsteri " +musteri.getAdSoyad()+" Silindi.");
		logger.log();
		
	}
	
	public void listele(Musteri musteri) {
		System.out.println("Müsteri listelendi:\n" +musteri.getAdSoyad());
		logger.log();
	}
	
	
	public void ekle(Musteri musteri) {
		System.out.println("Müsteri " +musteri.getAdSoyad()+" Eklendi.");
		logger.log();
	}
	
	
	public void cokluEkleme(Musteri[] musteriler) {
		System.out.println("Müsteriler coklu ekleniyor...\n ");
		for(Musteri musteri:musteriler) {
			System.out.println(musteri.getAdSoyad()+" Eklendi.");
			ekle(musteri);
		}
	}
	
}
