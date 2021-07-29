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
		MusteriYonetim kredi[] = {new MusteriYonetim(null,new AracKredisi()), new MusteriYonetim(null,new EvKredisi()),new MusteriYonetim(null,new IhtiyacKredisi())};
		KurumsalMusteri kmusteri[]= {new KurumsalMusteri(12345, "Seyma Aydin", 123456, "M0000"),new KurumsalMusteri(12347, "Turkan Kurt", 123456, "M0002")};
		BireyselMusteri bmusteri[]= {new BireyselMusteri(12342, "Busra Can", 123456, "A0001"),new BireyselMusteri(12345, "Huseyin Cag", 123456, "A0003")};
		MusteriYonetim yonetici[]= {new MusteriYonetim(new DatabaseLogger(),null),new MusteriYonetim(new FileLogger(),null),new MusteriYonetim(new SmsLogger(),null)};
		Musteri musteriler[] = new Musteri []{kmusteri[0], bmusteri[0],kmusteri[1]};
		
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
