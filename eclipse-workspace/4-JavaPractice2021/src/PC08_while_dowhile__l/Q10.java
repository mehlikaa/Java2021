
  package PC08_while_dowhile__l;

  
  
  // copy
  
  
  import java.util.Scanner;

  public class Q10 {

      public static void main(String[] args) {
          // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
          Scanner scan = new Scanner(System.in);

          int enbSayi = 0;
          int count = 0;
          while (count < 5) {
              System.out.print("sayi giriniz : ");
              int sayi = scan.nextInt();
              if (sayi > enbSayi) {
                  enbSayi = sayi;

              }
              count++;
          }
          System.out.println("enbuyuık sayi :"+enbSayi);
      }
  }