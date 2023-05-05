package OneToTwenty;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (char index = 0; index < charArray.length; index++) {
            System.out.print(index);
            switch (charArray[index]) {
                case 'I' -> {
                    if (index == charArray.length - 1) {
                        sum++;
                    } else if (charArray[index + 1] == 'V') {
                        sum += 4;
                        index++;
                    } else if (charArray[index + 1] == 'X') {
                        sum += 9;
                        index++;
                    } else {
                        sum++;
                    }
                }
                case 'V' -> sum += 5;
                case 'X' -> {
                    if (index == charArray.length - 1) {
                        sum += 10;
                    } else if (charArray[index + 1] == 'L') {
                        sum += 40;
                        index++;
                    } else if (charArray[index + 1] == 'C') {
                        sum += 90;
                        index++;
                    } else {
                        sum += 10;
                    }
                }
                case 'L' -> sum += 50;
                case 'C' -> {
                    if (index == charArray.length - 1) {
                        sum += 100;
                    } else if (charArray[index + 1] == 'D') {
                        sum += 400;
                        index++;
                    } else if (charArray[index + 1] == 'M') {
                        sum += 900;
                        index++;
                    } else {
                        sum += 100;
                    }
                }
                case 'D' -> sum += 500;
                case 'M' -> sum += 1000;
                default -> System.out.println(charArray[index] + " is an incorrect roman numeral");
            }
        }
        System.out.println("Input:  " + s);
        System.out.println("Output: " + sum);
    }
}
