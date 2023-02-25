import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> line = List.of("Vlad", "Kola", "Maruna", "Larusa", "Max", "Alla");

        System.out.println(returnedUperCasesorter(line));

    }

    public static List<String> returnedUperCasesorter(List<String> person) {
        return person
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
