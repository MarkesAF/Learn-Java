import java.util.Scanner;
import java.util.Locale;

public class posicao_maior {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int posmaior;
        double maior;

        System.out.print("Quantos numeros quer digitar? ");
        int n = in.nextInt();
        double[]vect = new double[n];

        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = in.nextDouble();
        }
        posmaior = 0;
        maior = vect[0];
        for(int i = 0;i<n;i++){
            if(vect[i] > maior){
                maior = vect[i];
                posmaior = i;
            }
        }
        System.out.println("NUMERO MAIOR = "+String.format("%.2f",maior));
        System.out.printf("POSIÇAO DO MAIOR = %d",posmaior);
    }
}
