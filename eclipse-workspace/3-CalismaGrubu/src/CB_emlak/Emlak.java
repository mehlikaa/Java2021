package CB_emlak;

import java.util.Scanner;

public class Emlak {


		
		public int listeNo;
		public String evTipi;
		public String il;
		public int odaSayisi;
		private double fiyat;
		public String stokDurumu;
		
		

		
		

		Emlak(int listNo, String evTipi, String il, int odaSayisi, double fiyat, String stokDurumu){
			
			this.listeNo=listeNo++;
			
			Scanner scan=new Scanner (System.in);
			
			System.out.println("Ev Tipi : ");
			this.evTipi=scan.next();
			
			System.out.println("Il : ");
			this.il=scan.next();
			
			System.out.println("Oda Sayisi  : ");
			this.odaSayisi=scan.nextInt();
			
			System.out.println("Fiyat : ");
			this.fiyat=scan.nextDouble();
			
			System.out.println("Stok Durumu : ");
			this.stokDurumu=scan.next();
			
			scan.close();
			
		}
		
		
public void ListeleEmlak() {
	
	System.out.println("\n ListeNo       : "+ listeNo +"\nEv Tip     : "+evTipi+"\nIl        : "+il+"\nOda Sayisi : "+odaSayisi+"\nFiyat      :"+fiyat+"\nStok Durumu : "+stokDurumu);
		
}



		public int getListeNo() {
			return listeNo;
		}






		public void setListeNo(int listeNo) {
			this.listeNo = listeNo;
		}






		public String getEvTipi() {
			return evTipi;
		}






		public void setEvTipi(String evTipi) {
			this.evTipi = evTipi;
		}






		public String getIl() {
			return il;
		}






		public void setIl(String il) {
			this.il = il;
		}






		public int getOdaSayisi() {
			return odaSayisi;
		}






		public void setOdaSayisi(int odaSayisi) {
			this.odaSayisi = odaSayisi;
		}






		public double getFiyat() {
			return fiyat;
		}






		public void setFiyat(double fiyat) {
			this.fiyat = fiyat;
		}






		public String getStokDurumu() {
			return stokDurumu;
		}






		public void setStokDurumu(String stokDurumu) {
			this.stokDurumu = stokDurumu;
		}

}
