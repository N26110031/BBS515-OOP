package StokYonetimSistemi;

public class ProductManager {

	public void urunBilgileriniGoster(Product product) {
		System.out.println ("Ürün: " + product.getName());
		System.out.println ("Fiyat: " + product.getPrice());
		System.out.println ("Stok: " + product.getStock());
		
	}
	
public void satisYap (Product product, int adet) {
	if (adet > 0) {
		if (product.getStock() >= adet) {
			int yeniStock = product.getStock() - adet;
			product.setStock (yeniStock);
			
			System.out.println ("Satış Başarılı, kalan stok: " + product.getStock());
			
	} else {
		System.out.println ("Yetersiz stok");
		}
		
		
	} else {
		System.out.println (" Geçersiz adet girdiniz");
		}

	}
public void stokEkle (Product product, int adet) {
	if (adet > 0) {
		int yeniStock = product.getStock() + adet;
		product.setStock(yeniStock);
		
		System.out.println ("Güncel stok: " + product.getStock());
	
	} else {
		System.out.println ("Geçersiz adet girdiniz");
	}
}

}
