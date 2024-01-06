
import java.util.Scanner;

public class login {
    public boolean login(Hesap hesap){
    Scanner scanner = new Scanner(System.in);
    String kullanici_adi;
    String parola;
            System.out.println("kullanıcı adı :");
            kullanici_adi = scanner.nextLine();
            System.out.println("parola : ");
            parola = scanner.nextLine();
            if (hesap.getKullaniciadi().equals(kullanici_adi)&& hesap.getParola().equals(parola)) {
                return true;
            }
            else{
            return false;
            }
    } 
}
