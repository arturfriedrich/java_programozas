public class JelszoVerficitator {

    public static void main(String[] args) {

        String password = "asb:cap3od";
        boolean valid = false;

        int length = password.length();
        int letterCount = 0;
        int numberCount = 0;
        int specialCharacterCount = 0;

        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                specialCharacterCount++;
            }
        }

        if (length >= 8 && letterCount >= 1 && numberCount >= 1 && specialCharacterCount >= 1) {
            valid = true;
        }

        for (int i = 0; i < length - 1; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            if (c1 == c2) {
                valid = false;
            }
        }

        System.out.println("Your password is " + (valid ? "valid" : "invalid") + ".");

    }

}
