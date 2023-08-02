import java.util.Locale;
import java.util.Scanner;

public class soma_2vetores {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter cada vetor? ");
        int n = in.nextInt();

        int[]vectA = new int[n];
        int[]vectB = new int[n];
        int[]vectC = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for(int i=0;i<n;i++){
            vectA[i] = in.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i=0;i<n;i++){
            vectB[i] = in.nextInt();
        }
        System.out.println("VALORES RESULTANTES:");

        for(int i=0;i<n;i++){
            vectC[i]= vectA[i] + vectB[i];
            System.out.printf("%d\n",vectC[i]);
        }
    }
}
