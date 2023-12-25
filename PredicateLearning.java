import java.util.function.Predicate;

/**
 * @author zhang
 */
public class PredicateLearning {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("zgd");
            }
        };
        Predicate<String> predicateTwo = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("18");
            }
        };
        boolean test = predicate.or(predicateTwo).test("18");
        System.out.println(test);
        boolean zgd18 = predicate.and(predicateTwo).test("zgd");
        System.out.println(zgd18);
    }
}
