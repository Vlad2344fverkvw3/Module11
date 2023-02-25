import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5  {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1","2","3","4");
        Stream<String> stream2 = Stream.of("10","20","30","40");
        Stream<String> zip = zip(stream1, stream2);
        System.out.println(zip.collect(Collectors.toList()));
    }
    
public static <T>Stream<T> zip(Stream<T> first,Stream<T> second){
    List<T> rez = new ArrayList<>();
    Iterator<T> iterator1 = first.iterator();
    Iterator<T> iterator2 = second.iterator();
while (iterator1.hasNext() && iterator2.hasNext()){
    rez.add(iterator1.next());
    rez.add(iterator2.next());
}
return rez.stream();
}

}
