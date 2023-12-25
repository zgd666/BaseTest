import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class CSVDataProcessor {
//    public static void main(String[] args) throws IOException {
//        // 输入CSV文件路径
//        String inputFile = "F://output.csv";
//        String outputFile = "F://output01.csv";
//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
//            String line;
//            int lineNumber = 0;
//            while ((line = reader.readLine()) != null) {
//                // 假设CSV文件使用逗号分隔列
//                String[] columns = line.split(",");
//                // 处理第二列数据
////                if (columns[1]) {
////                    columns[1] = columns[1].replaceAll("\"MODEL_NAME_\" : \"(.*)\"", "$1");
////                    columns[2] = columns[2].replaceAll("\"CARD_ALIAS_MT_\" : \"(.*)\"", "$1");
////                }
//                if (lineNumber > 0) {
//                    columns[1] = columns[1].replaceAll("\"MODEL_NAME_\" : \"(.*)\"", "$1");
//                    columns[2] = columns[2].replaceAll("\"MFR_NAME_\" : \"(.*)\"", "$1");
//                    columns[3] = columns[3].replaceAll("\"CARD_ALIAS_MT_\" : \"(.*)\"", "$1");
//                    columns[4] = columns[4].replaceAll("\"CARD_NAME_\" : \"(.*)\"", "$1");
//                    columns[5] = columns[5].replaceAll("\"PORT_NOS_\" : \"(.*)\"", "$1");
//                    columns[6] = columns[6].replaceAll("\"PORT_TYPE_\" : \"(.*)\"", "$1");
//                    columns[7] = columns[7].replaceAll("\"MARK_\" : \"(.*)\"", "$1");
//                    columns[8] = columns[8].replaceAll("\"TYPE_ID_\" : \"(.*)\"", "$1");
//                    columns[9] = columns[9].replaceAll("\"ADDR_\" : \"(.*)\"", "$1");
//                    columns[10] = columns[10].replaceAll("\"SYS_NUM_\" : \"(.*)\"", "$1");
//                    columns[11] = columns[11].replaceAll("\"EXIST_\" : \"(.*)\"", "$1");
//                    columns[13] = columns[13].replaceAll("\"CREATE_TIME_\" : \\{ \"\\$date\" : (\\d+) \\}", "$1");
////                }
//                    // 将修改后的行写入输出文件
//                    writer.write(String.join(",", columns));
//                    writer.newLine();
//                    lineNumber++;
//                }
//            }
//            System.out.println("转换完成。");
//        }
//    }
//}
import java.io.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class CSVProcessor {

    public static void main(String[] args) throws IOException {

        String inputFile = "F://output.csv";
        String outputFile = "F://output01.csv";

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(inputFile), "GBK"));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream(outputFile), "GBK"))  ) {

            String line;
            int lineNumber = 0;

//            while ((line = reader.readLine()) != null) {
//                new JSONObject(line.toString())
//
//            }

            System.out.println("CSV数据转换完成");

        }

    }

    public static String processColumn(String col, String regex) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(col);

        if (matcher.find()) {
            return "\"" + matcher.group(1) + "\"";
        }

        return col;

    }

}