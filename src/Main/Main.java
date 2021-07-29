package Main;

import krediVarlik.AracKredisi;
import krediVarlik.EvKredisi;
import krediVarlik.IhtiyacKredisi;
import loglama.DatabaseLogger;
import musteriVarlik.BireyselMusteri;
import musteriVarlik.KurumsalMusteri;
import musteriVarlik.Musteri;
import musteriYönetim.MusteriYonetim;;

public class Main {

	public static void main(String[] args) {
		Musteri musteriler[] = new Musteri [3];
		MusteriYonetim kredi[] = {new MusteriYonetim(new AracKredisi()), new MusteriYonetim(new EvKredisi()),new MusteriYonetim(new IhtiyacKredisi())};

		
		KurumsalMusteri kmusteri1 = new KurumsalMusteri(12345, "Seyma Aydin", 123456, "00000");
		musteriler[0]=kmusteri1;

		
		BireyselMusteri bmusteri1 = new BireyselMusteri(12342, "Busra Aydin", 123456, "00001");
		musteriler[1] = bmusteri1;
		
		KurumsalMusteri kmusteri2 = new KurumsalMusteri(12347, "Turkan Aydin", 123456, "00002");
		musteriler[2] = kmusteri2;
		
		
		MusteriYonetim yonetici=new MusteriYonetim(new DatabaseLogger());
		yonetici.ekle(kmusteri1);
		kredi[0].krediCesidi(kmusteri1);
		
		yonetici.ekle(bmusteri1);
		kredi[2].krediCesidi(bmusteri1);
		
		yonetici.ekle(kmusteri2);
		kredi[1].krediCesidi(kmusteri2);
		
		
		System.out.println("\n");
		yonetici.cokluEkleme(musteriler);

	}

}
