public class Main {
    public static void main(String[] args) {
     boolean result = AuthValidator.validate("Login ", "password1", "password1");
        System.out.println(result);
    }
}