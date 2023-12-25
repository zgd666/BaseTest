package streamLearning;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author zhang
 */
public class BufferedReaderlearning {
    public static void main(String[] args) throws IOException {
        String file = "F://test.txt";
        FileInputStream input = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null) {
            // 处理每一行的内容
            System.out.println(line);
        }
        input.close();
        reader.close();
        br.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        int available = fileInputStream.available();
        byte[] bytes = new byte[1024];
        for (int i = 0; i < available; i++) {
            fileInputStream.read(bytes);
        }
        String s = new String(bytes);
        System.out.println(s.trim());
        fileInputStream.close();
        File file1 = new File("F://test.txt");
        URI uri = file1.toURI();
        System.out.println(uri);
        URL url = file1.toURL();
        System.out.println(url);
    }
}
