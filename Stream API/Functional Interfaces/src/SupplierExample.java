import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.List;


public class SupplierExample {
    public static void main(String[]args){
        Supplier<String> saudacao = () -> "Ola seja bem vindo";

        List<String> listaSaudacoes = Stream.generate(() -> "Ola seja bem vindo").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
