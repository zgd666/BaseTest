import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CountWh {
    public static void main(String[] args) {
        String str ="INSERT INTO PLAT_RES_PHY_SLOT(" +
                "ID_,ORI_IDENTI_,EMSID_,ALIAS_,NAME_,DELETE_STATE_,ORI_TYPE_,INSERT_TIME_,SLOT_NO_," +
                "SHELF_ID_,DEVICE_ID_,LAST_TIME_,SLOT_PARENT_ID_" +
                ",COLLECT_TIME_,KEY_PATH_" +
                ")VALUES(?,?,?,?,?,?,?,STR_TO_DATE(?,'%Y%m%d%H%i%s'),?,?,?,NOW(),?" +
                ",STR_TO_DATE(?,'%Y%m%d%H%i%s'),?)";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '?') {
                count++;
            }
        }

        System.out.println("字符串中包含" + count + "个问号");

    }
//    读取xml文件内容的方法。
    public static String readXml(String path){
        String xml = "";
        try {
            xml = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xml;
    }
//    生成一个方法使用datasource链接数据库，执行update语句

    public static void update(String sql,String[] args){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC", "root", "123456");
            conn.prepareStatement(sql).executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("更新成功");
        System.out.println("更新失败");
        System.out.println("更新成功");
        System.out.println("更新失败");
        System.out.println("更新成功");
        System.out.println("更新失败");
        System.out.println("更新成功");
        System.out.println("更新失败");
        System.out.println("更新成功");
    }

    
}
