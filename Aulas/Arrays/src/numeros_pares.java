import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos numeros quer digitar? ");
        int n = in.nextInt();

        int[]vect = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = in.nextInt();
        }
        System.out.println("NUMEROS PARES:");

        int count = 0;
        for(int i = 0;i<n;i++){
            if(vect[i] %2 == 0){
                System.out.printf("%d  ",vect[i]);
                count++;
            }
        }
        System.out.println();
        System.out.printf("\nQuantidade de numeros pares: %d\n", count);
    }
}
