import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.lang.System.out;

public class Task1 {
    public static void main(String[] args) {
        List<String> line = List.of("Vlad", "Kola", "Maruna", "Larusa", "Max", "Alla");
        findOddName(line);
    }

    public static void findOddName(List<String> names) {
        AtomicInteger order = new AtomicInteger(1);
        List<String> arr = names.stream().map(name -> order.getAndIncrement() + "." + name)
                .collect(Collectors.toList());

        String nameStream = IntStream
                .range(0, arr.size())
                .filter(i -> i % 2 != 1)
                .mapToObj(arr::get)
                .collect(Collectors.joining(","));
        System.out.println(nameStream);
    }
}
