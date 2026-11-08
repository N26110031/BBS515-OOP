package AracKiralama;

public class Arac {


String marka;
String model;
double gunlukUcret;
boolean kiradaMi;

public Arac (String marka, String model, double gunlukUcret, boolean kiradaMi) {
	this.marka = marka;
	this.model = model;
	this.gunlukUcret = gunlukUcret;
	this.kiradaMi = kiradaMi;
}

void bilgileriGoster() {
	System.out.println ("Marka: " + marka);
	System.out.println ("Model: " + model);
	System.out.println ("Günlük Ücret: " + gunlukUcret);
	System.out.println ("Müsaitlik Durumu: " + kiradaMi);
	
}

void kirala () {
	if (kiradaMi == false) {
		kiradaMi =true ;
		System.out.println (marka + " " + model + "başarıyla kiralandı");
	} else {
		System.out.println ("Araç daha önce kiralanmış");
	}
}
	
void teslimEt () {
	if (kiradaMi == true) {
		kiradaMi = false;
		System.out.println ("Araç teslim edildi");
	} else {
		System.out.println ("Araç zaten müsait");
	}
}
	

double kiraBedeliHesapla(int gun) {
	if (gun <= 0) {
		return 0;
	} else { 
		return gunlukUcret * gun;
	}
	
	
}
	
}


		



