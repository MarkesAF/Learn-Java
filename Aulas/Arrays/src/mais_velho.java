import java.util.Scanner;
import java.util.Locale;


public class mais_velho {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n =  in.nextInt();
        String[]names = new String[n];
        int[]idades = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Dados da "+(i+1)+"a Pessoa:");
            System.out.print("Nome: ");
            names[i] = in.next();
            System.out.print("Idade: ");
            idades[i] = in.nextInt();
        }
        int posicaoMaior=0;
        int maiorIdade= idades[0];
        for(int i = 1;i<n;i++){
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s",names[posicaoMaior]);
    }
}
