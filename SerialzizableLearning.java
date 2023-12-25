import pojo.User;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author zhang
 */
public class SerialzizableLearning {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("zgd");
        user.setAddress("chengdu");
        try (OutputStreamWriter writer = new OutputStreamWriter(
                Files.newOutputStream(Paths.get("F://serializable.txt")), StandardCharsets.UTF_8)) {

          writer.write(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
