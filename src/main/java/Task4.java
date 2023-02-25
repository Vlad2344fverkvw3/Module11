
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

        public static void main(String[] args) {
           generetorNumbersWithOunFormul(25214903L,11L,(long)Math.pow(2,48L));
        }
        public static Stream<Long> generetorNumbersWithOunFormul(Long a, Long c, Long m) {
            Stream<Long> stream = Stream.iterate(1L, x ->  (a * x + c) % m);
             stream
                     .limit(10)
                 //   .forEach(System.out::println);
                     .peek(System.out::println)
                     .collect(Collectors.toList());
return stream;
        }
    }

