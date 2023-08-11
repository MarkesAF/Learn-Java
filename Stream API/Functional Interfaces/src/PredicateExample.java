import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExample {
    public static void main(String[]args){
        List<String> palavras = Arrays.asList("java", "Python", "Ruby", "Go", "Node");
        Predicate<String> maisDeCincoCaracteres;
        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);
    }
}
