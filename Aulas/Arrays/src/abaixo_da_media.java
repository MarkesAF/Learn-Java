import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = in.nextInt();

        double[]vect = new double[n];

        for(int i = 0;i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = in.nextInt();
        }
        double soma=0;
        for(int i=0;i<n;i++){
            soma = soma + vect[i];
        }
        double media = soma/n;
        System.out.println("MEDIA DO VETOR: "+String.format("%.2f",media));
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i=0;i<n;i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }
    }
}
