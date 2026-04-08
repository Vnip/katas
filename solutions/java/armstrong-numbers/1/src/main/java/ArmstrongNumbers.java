class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;
        int sum = 0;
        int digits = String.valueOf(numberToCheck).length(); // number of digits

        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            sum += Math.pow(digit, digits);
            numberToCheck /= 10;
        }

        return sum == originalNumber;

    }

}
