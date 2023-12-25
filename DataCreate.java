import org.json.JSONObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataCreate {
    public static void main(String[] args) throws IOException {
        String inputFile ="F://副本数据.csv";
        String outputFile = "F://结果03.csv";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(Files.newInputStream(Paths.get(inputFile)), "GBK"));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(Files.newOutputStream(Paths.get(outputFile)), StandardCharsets.UTF_8))
        ) {

            String line;
            int lineNumber = 0;
                String idc = "ID";
                String modelNamec = "MODEL_NAME_";
                String mfrNamec = "MFR_NAME_";
                String cardAliasMtc = "CARD_ALIAS_MT_";
                String cardNamec = "CARD_NAME_";
                String portNosc = "PORT_NOS_";
                String portTypec = "PORT_TYPE_";
                String markc = "MARK_";
                String typeIdc = "TYPE_ID_";
                String addrc = "ADDR_";
                String sysNumc = "SYS_NUM_";
                String existc = "EXIST_";
                String portTypeSortc = "portTypeSort";
                String createTimec = "CREATE_TIME_";
                ArrayList<String> strings = new ArrayList<>();
                strings.add(idc);
                strings.add(modelNamec);
                strings.add(mfrNamec);
                strings.add(cardAliasMtc);
                strings.add(cardNamec);
                strings.add(portNosc);
                strings.add(portTypec);
                strings.add(markc);
                strings.add(typeIdc);
                strings.add(addrc);
                strings.add(sysNumc);
                strings.add(existc);
                strings.add(portTypeSortc);
                strings.add(createTimec);
                String c = strings.toString();
                String col = c.replaceAll("^\\[|\\]$", "");
                writer.write(col);
                writer.newLine();
                writer.flush();
            while ((line = reader.readLine()) != null) {
                String row = null;
                if (lineNumber >= 0) {
                    int first = line.indexOf("{");
                    int last = line.lastIndexOf("}");
                    String substring = line.substring(first, last + 1);
                    JSONObject jsonObject = new JSONObject(substring);
                    String id = jsonObject.getJSONObject("_id").getString("$oid");
                    String modelName = jsonObject.optString("MODEL_NAME_","");
                    String mfrName = jsonObject.optString("MFR_NAME_","");
                    String cardAliasMt = jsonObject.optString("CARD_ALIAS_MT_","");
                    String cardName = jsonObject.optString("CARD_NAME_", "");
                    String portNos = jsonObject.optString("PORT_NOS_", "");
                    String portType = jsonObject.optString("PORT_TYPE_", "");
                    String mark = jsonObject.optString("MARK_", "");
                    String typeId = jsonObject.optString("TYPE_ID_", "");
                    String addr = jsonObject.optString("ADDR_", "");
                    String sysNum = jsonObject.optString("SYS_NUM_", "");
                    String exist = jsonObject.optString("EXIST_", "");
                    String portTypeSort = jsonObject.optString("portTypeSort", "");
                    boolean createTime = jsonObject.has("CREATE_TIME_");

                    ArrayList<Object> strings02 = new ArrayList<>();
                    strings02.add(id);
                    strings02.add(modelName);
                    strings02.add(mfrName);
                    strings02.add(cardAliasMt);
                    strings02.add(cardName);
                    strings02.add(portNos);
                    strings02.add(portType);
                    strings02.add(mark);
                    strings02.add(typeId);
                    strings02.add(addr);
                    strings02.add(sysNum);
                    strings02.add(exist);
                    strings02.add(portTypeSort);
                    if (createTime){
                        long l = jsonObject.getJSONObject("CREATE_TIME_").optLong("$date", 0L);
                        System.out.println(l);
                        strings02.add(l);
                    }
                    row = strings02.toString();
                    row = row.replaceAll("^\\[|\\]$", "");
                }
                lineNumber ++;
                writer.write(row);
                writer.newLine();
                writer.flush();
            }
            writer.close();
        }

    }
}
