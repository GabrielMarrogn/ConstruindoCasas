import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a;

        while((a = sc.nextInt()) != 0){
            
            double b = sc.nextInt();
            double c = sc.nextInt();
            double soma;

            soma = (a * b) / (c/100);
            soma = Math.sqrt(soma);

            System.out.println((int) soma);

        }

        sc.close();
    }

}
