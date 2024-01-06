public class Main {
   public static void main(String[] args) {
   
       ATM atm = new ATM();
       
      Hesap hesap = new Hesap("ahmet enes", "12345", 2000);
       
       atm.çalış(hesap);
       
       System.out.println("programdan çıkılıyor.");
}
   
   
}
