package ex1;

class AbstractMath {
    static int reverseNumber(int num) {
        int sign = num < 0 ? -1 : 1;
        int value = Math.abs(num);
        int reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + (value % 10);
            value /= 10;
        }
        return sign * reversed;
    }

    static int roundedNumber(double num) {
        return (int) Math.round(num);
    }

    static int countDistinct(int[] values) {
        java.util.HashSet<Integer> distinct = new java.util.HashSet<>();
        for (int value : values) {
            distinct.add(value);
        }
        return distinct.size();
    }

    static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }

        int value = Math.abs(decimal);
        int binary = 0;
        int place = 1;
        while (value > 0) {
            binary += (value % 2) * place;
            place *= 10;
            value /= 2;
        }

        return decimal < 0 ? -binary : binary;
    }
}
