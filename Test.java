public class Test {
    public static void main(String[] args) {
        String str = "ff80808135d15c190135d17ec2ec0004,382def2c54364f13a4cb16424c6f50a6,d77aae13e0e146dc93924d2afce3bcf4";
        for (String s : str.split(",")) {
            String newStr = "'"+s+"'";
            System.out.println(newStr);
        }

    }
}
