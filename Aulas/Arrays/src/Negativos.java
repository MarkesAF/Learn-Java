import java.util.Scanner;
import java.util.Locale;


public class Negativos {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar?: ");
        n = in.nextInt();
        int[]vect = new int[n];
        for(int i =0; i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = in.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");

        for(int i=0;i<n;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
