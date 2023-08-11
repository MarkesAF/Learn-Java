import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;



public class ConsumerExample {
    public static void main(String[]args){
        List<Integer> numeros = Arrays.asList(1,2,4, 10, 220, 21, 29);
        Consumer<Integer> imprimirPares = numero ->{
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
