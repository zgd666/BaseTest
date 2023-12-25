import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhang
 */
public class PatternTest {
    private static final Pattern PATTERN = Pattern.compile("框:(\\d+) 大庙屯线路所-(\\d+)-(\\d+)");

    public static void main(String[] args) {
        String nativeEmsName = "框:14 大庙屯线路所-15-25";
        Matcher matcher = PATTERN.matcher(nativeEmsName);

        if (matcher.find()) {
            // 第一个分组
            String group1 = matcher.group(1);
            // 第二个分组
            String group2 = matcher.group(2);
            // 第三个分组
            String group3 = matcher.group(3);

            System.out.println("Group 1: " + group1);
            System.out.println("Group 2: " + group2);
            System.out.println("Group 3: " + group3);
        }
    }
}
