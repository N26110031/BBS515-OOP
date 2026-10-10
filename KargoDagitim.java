package DersEtkinlik;

public class KargoDagitim {

	public static void main(String[] args) {
		
		double toplamGelir = 0;
		
		for (int teslimatNo = 1; teslimatNo <=10; teslimatNo++) {
			
			int mesafe = teslimatNo * 5; 
			System.out.print (teslimatNo + ".Teslimat: " + "Mesafe:" + mesafe + "km  ");
			
			double ucret;
			if (mesafe <= 10) {
				ucret = 50;
			}
			else if (mesafe <= 30) {
				ucret = 80;
			}
			else {
				ucret = 120;
		}
			if (teslimatNo % 3 == 0) {
			ucret += 20;
			}
			
			if (mesafe >= 40) {
				ucret = ucret - (ucret * 0.10);
			}
			
			toplamGelir = toplamGelir + ucret;
			System.out.println ( "ucret:" + ucret + "TL"); 
		}
			
			System.out.println (" Toplam Gelir: " + toplamGelir + "TL");
			
	
			
			
		}
	}



			
	
			
			
			
			
			
			
	

		


