import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    private static List<Integer> prime;

    public static void draw(Integer n) {
        prime = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime.add(i);
            }
        }
        prime.stream().sorted().forEach(e -> System.out.print(e + ", "));
    }
}
