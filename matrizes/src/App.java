import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
            System.out.print(matriz[i][i] + " ");
            }
        }


        sc.close();
    }
}
