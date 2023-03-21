import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un precio");
        price=sc.nextDouble();
        getIVA(price);
    }

    private static void getIVA(double price) {
        System.out.println("El precio con IVA es: "+ price*1.21+"€");
    }
}