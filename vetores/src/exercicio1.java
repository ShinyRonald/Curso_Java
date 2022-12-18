import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {

    /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.  */

    Scanner sc = new Scanner(System.in);

    int n = 0;
    n = sc.nextInt();

    int vetor[] = new int[n];
    int valor_digitado = 0;

    if(n >= 0 & n < 10){

        for(int i = 0; i < vetor.length; i++ ){

            valor_digitado = sc.nextInt();
            vetor[i] = valor_digitado;

        }

    }

    for(int i = 0; i < vetor.length; i++){

        if(vetor[i] < 0){
            System.out.println("Vetor: " + i + " Valor Negativo: "+ vetor[i]);
        }
    }

    sc.close();
    }
}