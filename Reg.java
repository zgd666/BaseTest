import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhang
 */
public class Reg {
    public static void main(String[] args) {
        String reg = "(\\d*)-(\\S*)-([a-z]*)";
        String name = "18-张国鼎-zgd";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(name);

        if(matcher.matches()) {
            String num = matcher.group(1);
            String chineseName = matcher.group(2);
            String abbreviation = matcher.group(3);

            System.out.println(num);
            System.out.println(chineseName);
            System.out.println(abbreviation);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int i = random.nextInt(100);
            System.out.println(i);
            arrayList.add(i);
        }
        int[] nums = arrayList.stream().mapToInt(Integer::intValue).toArray();
        int i = Arrays.binarySearch(nums, 50);
        System.out.println(i);
    }
}
