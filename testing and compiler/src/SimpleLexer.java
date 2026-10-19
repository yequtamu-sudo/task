
public class SimpleLexer {
    public static void main(String[] args) {
        String source = "age = 20 + 3;";

        String[] lexemes = source.split(
                "\\s+|(?=[=+;])|(?<=[=+;])"
        );

        for (String lexeme : lexemes) {
            if (lexeme.isEmpty()) {
                continue;
            }

            if (lexeme.matches("[a-zA-Z][a-zA-Z0-9]*")) {
                System.out.println(lexeme + " -> IDENTIFIER");
            } else if (lexeme.matches("[0-9]+")) {
                System.out.println(lexeme + " -> NUMBER");
            } else if (lexeme.equals("=")) {
                System.out.println(lexeme + " -> ASSIGNMENT_OPERATOR");
            } else if (lexeme.equals("+")) {
                System.out.println(lexeme + " -> ARITHMETIC_OPERATOR");
            } else if (lexeme.equals(";")) {
                System.out.println(lexeme + " -> SEMICOLON");
            } else {
                System.out.println(lexeme + " -> UNKNOWN");
            }
        }
    }
}
