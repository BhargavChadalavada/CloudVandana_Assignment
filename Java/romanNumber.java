
class RomanNumber {
    public static void main(String[] args) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String romanNumber = sc.next();
            int[] rString = new int[romanNumber.length()];
            for (int i = 0; i < romanNumber.length(); i++) {
                if (String.valueOf(romanNumber.charAt(i)).equals("I")) rString[i] = 1;
                else if (String.valueOf(romanNumber.charAt(i)).equals("X")) rString[i] = 10;
                else if (String.valueOf(romanNumber.charAt(i)).equals("L")) rString[i] = 50;
                else if (String.valueOf(romanNumber.charAt(i)).equals("C")) rString[i] = 100;
                else if (String.valueOf(romanNumber.charAt(i)).equals("D")) rString[i] = 500;
                else if (String.valueOf(romanNumber.charAt(i)).equals("M")) rString[i] = 1000;
                else throw new CustomException("Invalid Roman Number");
            }
            int result = 0;
            int prevValue = 0;
            for (int i = rString.length - 1; i >= 0; i--) {
                if (rString[i] < prevValue) {
                    result -= rString[i];
                } else {
                    result += rString[i];
                }
    
                prevValue = rString[i];
            }
            System.out.println(result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}