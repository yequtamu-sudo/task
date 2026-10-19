
public class SimpleLexer2 {
    public static void main(String[] args) {
        String source = "sum = 10 + 5;";

        String[] tokens = source.split(
                "\\s+|(?=[=+;])|(?<=[=+;])"
        );

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
