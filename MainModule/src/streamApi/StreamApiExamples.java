package streamApi;

import java.util.stream.Stream;

public class StreamApiExamples {
    public static void main(String[] args) {
        int result = Stream.of("ONE", "TWO", "THREE", "FOUR").mapToInt(s -> s.length()).peek(f -> System.out.println(f))
                .filter(r -> r > 3).sum();
        System.out.println(result);
    }
}
