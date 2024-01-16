public class ReverseDigits {
    public static void main(String[] args) {
        int number = 12345; // You can initialize it to any integer value
        int reversedNumber = reverseDigits(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    private static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}