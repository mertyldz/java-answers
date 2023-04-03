public class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message) {
        super(message);
        System.out.println("Hatalı giriş denemesi !");
    }
}
