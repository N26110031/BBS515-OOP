package AracKiralama;

public class Main {

	public static void main(String[] args) {
		
		Arac arac1 = new Arac ("Toyota" , "Corolla" , 1500 , false);
		Arac arac2 = new Arac ("Renault", "Clio" , 1200 , false);
		Arac arac3 = new Arac ("BMW" , "320i", 3000, true);
		
		arac1.bilgileriGoster();
		arac2.bilgileriGoster();
		arac3.bilgileriGoster();
		
		arac1.kirala();
		arac1.kirala();

		arac2.kiraBedeliHesapla(5);
		System.out.println("5 günlük araç bedeli: " + arac2.kiraBedeliHesapla(5) + "TL");
		arac3.teslimEt();
		
		arac1.bilgileriGoster();
		arac2.bilgileriGoster();
		arac3.bilgileriGoster();
		

	}

}
