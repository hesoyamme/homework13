public class AuthValidator {
    public static boolean validate(String login, String password, String confrimPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Логин должен быть короче 20 символов и не содержать пробелов");
            }
            if (password.length() >= 20 || password.contains(" ") || !containsDigit(password)) {
                throw new WrongPasswordException("Пароль должен содержать не меньше 20 символов, содержать минимум одну цифру и не содержать пробелов");
            }
            if ((!password.equals(confrimPassword))) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false;
        }
    }

    private static boolean containsDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
