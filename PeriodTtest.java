import java.nio.file.OpenOption;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Optional;

/**
 * @author zhang
 */
public class PeriodTtest {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 8, 7);
        LocalDate end = LocalDate.of(2023, 8, 17);
        Period between = Period.between(start, end);
//        int years = between.getYears();
//        System.out.println(years);
        int days = between.getDays();
        System.out.println(days);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("age",18);
        Optional<HashMap<String, Integer>> optional = Optional.of(map);
        HashMap<String, Integer> map1 = optional.get();

    }
}
