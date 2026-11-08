package StokYonetimSistemi;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product ("Laptop" , 25000, 10);
		Product product2 = new Product ("Mouse" , 500, 20);
		
		ProductManager productManager1 = new ProductManager ();
		
		System.out.println ( "=== BAŞLANGIÇ BİLGİLERİ===");
		productManager1.urunBilgileriniGoster(product1);
		productManager1.urunBilgileriniGoster(product2);
		
		productManager1.satisYap (product1, 3);
		productManager1.satisYap (product2, 25);
		
		productManager1.stokEkle (product2, 10);
		
		product1.setPrice (-500);
		
		System.out.println("\n=== GÜNCEL BİLGİLER ===");
		productManager1.urunBilgileriniGoster(product1);
		productManager1.urunBilgileriniGoster(product2);
		
		
		
		
	}

}
