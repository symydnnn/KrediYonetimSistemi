package Main;

import krediVarlik.AracKredisi;
import krediVarlik.EvKredisi;
import krediVarlik.IhtiyacKredisi;
import loglama.DatabaseLogger;
import loglama.FileLogger;
import loglama.SmsLogger;
import musteriVarlik.BireyselMusteri;
import musteriVarlik.KurumsalMusteri;
import musteriVarlik.Musteri;
import musteriYönetim.MusteriYonetim;;

public class Main {

	public static void main(String[] args) {
		Musteri musteriler[] = new Musteri [3];
		MusteriYonetim kredi[] = {new MusteriYonetim(new AracKredisi()), new MusteriYonetim(new EvKredisi()),new MusteriYonetim(new IhtiyacKredisi())};
		KurumsalMusteri kmusteri[]= {new KurumsalMusteri(12345, "Seyma Aydin", 123456, "M0000"),new KurumsalMusteri(12347, "Turkan Kurt", 123456, "M0002")};
		BireyselMusteri bmusteri[]= {new BireyselMusteri(12342, "Busra Can", 123456, "A0001"),new BireyselMusteri(12345, "Huseyin Cag", 123456, "A0003")};
		MusteriYonetim yonetici[]= {new MusteriYonetim(new DatabaseLogger()),new MusteriYonetim(new FileLogger()),new MusteriYonetim(new SmsLogger())};
		
		musteriler[0]=kmusteri[0];
		musteriler[1] = bmusteri[0];
		musteriler[2] = kmusteri[1];
		
		yonetici[0].ekle(kmusteri[0]);
		kredi[0].krediCesidi(kmusteri[0]);
		
		yonetici[1].ekle(bmusteri[0]);
		kredi[2].krediCesidi(bmusteri[0]);
		
		yonetici[2].ekle(kmusteri[1]);
		kredi[1].krediCesidi(kmusteri[1]);
		
		System.out.println("\n");
		yonetici[1].cokluEkleme(musteriler);

	}

}
