


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Task3 {
    public static void main(String[] args) {
        List<String> array = List.of("1, 2, 0", "4, 5");

        System.out.println(getAllWorldsFromList(array));
    }

    public static List<String> getAllWorldsFromList(List<String> list) {
        return list.stream()
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.toList());


    }

}
