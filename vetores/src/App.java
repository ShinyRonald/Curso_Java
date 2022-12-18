import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for(int i=0; i<vetor.length;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Product(name,price);
        }

        double soma = 0.0;

        for(int i=0; i<vetor.length; i++){
            soma += vetor[i]. getPrice();
        }

        double avg = soma / vetor.length;

        System.out.printf("Preço: %.2f%n",avg);


        sc.close();
    }
}
