import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas vao ser digitadas? ");
        int n = in.nextInt();

        String[] nomes = new String[n];
        double[] altura = new double[n];
        int[] idades = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Dados da "+(i+1)+ " Pessoa:");
            System.out.print("Nome: ");
            nomes[i] = in.next();
            System.out.print("Altura: ");
            altura[i] = in.nextDouble();
            System.out.print("Idade: ");
            idades[i] = in.nextInt();
        }
        double percentualMenores = 0;
        double alturaTotal = 0;
        int menores = 0;
        double media = 0;
        for(int i=0;i<n;i++){
            if(idades[i] < 16){
                menores++;
            }
            alturaTotal = altura[i] + alturaTotal;
        }
        media = alturaTotal / n;
        percentualMenores = ((double)menores /n) * 100;

        System.out.printf("\nAltura media: %.2f\n",media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);

        for(int i =0;i<n;i++){
            if(idades[i] < 16){
                System.out.printf("%s\n",nomes[i]);
            }
        }
    }
}
