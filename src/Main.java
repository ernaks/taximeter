import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("KM cinsinden mesafe giriniz: ");
        int km = sc.nextInt();
        double perKm = 2.2;
        double total = 10 + (km * perKm);
        if(total < 20) {
            total = 20;
            System.out.println("Toplam tutar: " + total);
        }
        else
            System.out.println("Toplam tutar: " + total);

        }
    }
