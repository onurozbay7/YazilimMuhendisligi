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
      
     int sonuc = topla(x,y);
      
      System.out.println("Toplama İşleminin Sonucu:" + sonuc);
    }
    
    public static int topla(int x, int y){
        int sonuc = x+y;
        
        return sonuc;
    }
}