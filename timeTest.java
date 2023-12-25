
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class timeTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("Wed Sep 27 11:09:07 GMT+08:00 2023");

        String dateString = sdf.format(date);
        System.out.println(dateString); // 输出：20230927110907

    }
}
