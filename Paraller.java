import java.util.stream.IntStream;

public class Paraller{
    public static void main(String[] args) {
        IntStream num = IntStream.range(1, 10);
        num.parallel().forEach(System.out::println);
    }
}