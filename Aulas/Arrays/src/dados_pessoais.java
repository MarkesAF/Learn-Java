import java.util.Locale;
import java.util.Scanner;


public class dados_pessoais {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = in.nextInt();

        double[]altura = new double[n];
        char[]genero = new char[n];

        for(int i=0;i<n;i++){
            System.out.print("Altura da "+(i+1)+"a Pessoa: ");
            altura[i] = in.nextDouble();
            System.out.print("Genero da "+(i+1)+"a Pessoa: ");
            genero[i] = in.next().charAt(0);
        }
        double maiorAltura, menor;
        maiorAltura = altura[0];
        menor = altura[0];
        for(int i=1;i<n;i++){
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(altura[i] < menor){
                menor = altura[i];
            }
        }
        int qtdhomens =0;
        int qtdmulheres =0;
        double alturaFemTotal =0;
        for(int i=0;i<n;i++){
            if(genero[i] == 'M'){
                qtdhomens++;
            }else{
                qtdmulheres++;
                alturaFemTotal = alturaFemTotal + altura[i];
            }
        }
        System.out.println();
        double alturaMedia = alturaFemTotal / n;
        System.out.println("Menor altura: "+String.format("%.2f",menor));
        System.out.println("Maior altura: "+String.format("%.2f",maiorAltura));
        System.out.println("Altura media Feminina: "+String.format("%.2f",alturaMedia));
        System.out.println("Quantidade de Homens: "+qtdhomens);
    }
}
