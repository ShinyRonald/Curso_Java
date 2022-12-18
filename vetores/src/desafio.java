import java.util.Scanner;

public class desafio {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int quartos[] = new int[10];
    int estudantes = 0;
    int numero_quarto = 0;
    String nome[] = new String[10];
    String email[] = new String[10];
    int aluguel[] = new int[10];

    System.out.println("Digite o número de estudante: ");
    estudantes = sc.nextInt();

    if(estudantes >= 0 && estudantes < 10){

        for(int i = 0; i < estudantes; i++){

        System.out.println("Digite o número do quarto: ");
        numero_quarto = sc.nextInt();
        quartos[numero_quarto] += numero_quarto;
        System.out.println("Número do quarto alugado: "+ quartos[numero_quarto]);
        
        sc.nextLine(); //Pra não bugar o scanner

        System.out.println("Digite seu nome: ");
        nome[numero_quarto] = sc.nextLine();

        System.out.println("Digite seu email: ");
        email[numero_quarto] = sc.nextLine();

        System.out.println("Digite seu aluguel: ");
        aluguel[numero_quarto] = sc.nextInt();

        }
        
    }

    for(int i = 0; i < 10; i++ ){

    if(nome[i] != null){
    System.out.println("Quarto: "+quartos[i]+" | Nome: "+nome[i]+" | Email: "+email[i]+" | Aluguel:"+aluguel[i]);
    }

    }

    sc.close();
    }
}