

import utils.HttpRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


/**
 * @author zhang
 */
public class CallUrl {
    public static void main(String[] args) throws IOException {
        String s = HttpRequest.sendGet("https://192.168.22.194:8008/railwayline/v3");
        System.out.println(s);
    }
}
