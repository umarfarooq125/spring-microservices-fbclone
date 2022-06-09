import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("c");
        arr.add("a");
        arr.add("b");
        arr.add("c");

        arr.stream().sorted().collect(Collectors.toList()).stream().forEach(i-> System.out.println(i));

        Stream<String> a = arr.stream().map(i -> i + " Hi");

        long count = arr.stream().count();
        a.forEach(i->System.out.println(i));

        MyInter t = (c , d) -> c + d;
        System.out.println(t.add(2, 3));

    }
}

@FunctionalInterface
interface MyInter {

    public abstract int add(int a, int b);
}
