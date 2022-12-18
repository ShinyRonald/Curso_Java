import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {

    /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor */

    Scanner sc = new Scanner(System.in);

    int n = 0;
    n = sc.nextInt();

    int vetor[] = new int[n];
    int valor_digitado = 0;
    int media = 0;

    if(n >= 0 & n < 10){

        for(int i = 0; i < vetor.length; i++ ){

            System.out.println("Digite um número: ");
            valor_digitado = sc.nextInt();
            vetor[i] = valor_digitado;

        }

    }

    for(int i = 0; i < vetor.length; i++){

        System.out.println("Vetor: " + i + " Valor: "+ vetor[i]);
        media += vetor[i];
        
    }

    media = (media/n);
    System.out.println("Media: " +media);


    sc.close();
    }
}