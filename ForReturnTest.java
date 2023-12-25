/**
 * @author zhang
 */
public class ForReturnTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5){
                return;
            }else {
                System.out.println(i);
            }
        }

    }
}
