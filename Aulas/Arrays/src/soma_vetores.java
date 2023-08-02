import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = in.nextInt();
        double[]vect = new double[n];

        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = in.nextDouble();
        }
        soma = 0;
        for(int i=0;i<n;i++){
            soma = soma + vect[i];
        }
        media = soma/n;
        System.out.println("VALORES: ");
        for(int i=0;i<n;i++){
            System.out.printf("%.1f\n",vect[i]);
        }
        System.out.println("Soma: "+String.format("%.2f",soma));
        System.out.println("Media: "+String.format("%.2f",media));
    }
}
