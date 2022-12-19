import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numero_funcionarios = 0;

        System.out.println("Digite o número de funcionarios: ");
        numero_funcionarios = sc.nextInt();
        sc.nextLine(); //desbugar o nextline

        List<String> id = new ArrayList<>();
        List<String> nome = new ArrayList<String>();
        List<String> salary = new ArrayList<String>();

        for(int i = 0; i < numero_funcionarios; i++){

            System.out.println("Digite o ID: ");
            String a = sc.nextLine();
            id.add(i,a);

            System.out.println("Digite o nome: ");
            a = sc.nextLine();
            nome.add(i,a);

            System.out.println("Digite o salário: ");
            a = sc.nextLine();
            salary.add(i,a);

        }
        
        for(int i = 0; i < numero_funcionarios; i++){

        System.out.println("ID:" + id.get(i) + " Nome: " + nome.get(i) + " Salário: " + salary.get(i));

        }

        sc.close();
    }
}