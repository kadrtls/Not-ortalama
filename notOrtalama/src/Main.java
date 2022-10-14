import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz");
        int mat= scanner.nextInt();

        System.out.println("fizik notunuzu giriniz");
        int fizik= scanner.nextInt();

        System.out.println("kimya notunuzu giriniz");
        int kimya= scanner.nextInt();

        System.out.println("türkçe notunuzu giriniz");
        int turkce= scanner.nextInt();

        System.out.println("ingilizce notunuzu giriniz");
        int english= scanner.nextInt();

        int total=(mat+kimya+fizik+turkce+english);
        double ort=total/5;
        System.out.println("ortlama:"+ ort);

    }
}