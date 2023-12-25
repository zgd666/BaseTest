import java.util.function.Function;

/**
 * @author zhang
 */
public class FunctionLearning {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        Integer apply = function.apply("hello");
        System.out.println(apply);
        Function<Integer, Double> squareRoot = Math::sqrt;
        Function<Integer, String> result = squareRoot.andThen(res -> "The square root is: " + res);
        // 返回 "The square root is: 4.0"
        String message = result.apply(16);
        System.out.println(message);
        squareRoot.compose(data -> Integer.valueOf("78979"+data));

    }
}
