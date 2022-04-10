import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      

      System.out.println("Hesap Makinesi");
      
      System.out.println("Lütfen ilk sayıyı girin");
      
      Scanner girdi1 = new Scanner(System.in);
      int x = girdi1.nextInt();
      
      System.out.println("Lütfen ikinci sayıyı girin");
      
      Scanner girdi2 = new Scanner(System.in);
      int y = girdi2.nextInt();
      
      System.out.println("Hangi islemi yapmak istiyorsunuz ? toplama için T, Bölüm için B harfini giriniz..");
      
      Scanner girdi3 = new Scanner(System.in);
      String islem = girdi3.next();
      
      if(islem.equals("T") || islem.equals("t")){
          double sonuc = topla(x,y);
          
          System.out.println("Toplama işleminin sonucu: " + sonuc);
      }
      
      else if(islem.equals("B") || islem.equals("b")){
          double sonuc = bolme(x,y);
          
          System.out.println("Bölme işleminin sonucu: " + sonuc);
      }
      
      else {
          System.out.println("Hatalı bir değer girdiniz.. Lütfen tekrar deneyin.");
      }
      
      
     
      
      
    }
    
    public static int topla(int x, int y){
        int sonuc = x+y;
        
        return sonuc;
    }
    
    public static double bolme(int x, int y){
        double sonuc = x/y;
        
        return sonuc;
    }
}