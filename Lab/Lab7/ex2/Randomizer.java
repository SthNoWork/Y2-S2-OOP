package ex2;

public class Randomizer extends NumberRandomizer {
    @Override
    int randomizeInBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    @Override
    int[] randomizeUniqueInBetween(int min, int max, int amount) {
        if (amount > (max - min + 1)) {
            throw new IllegalArgumentException("Amount must be less than or equal to the range of numbers.");
        }

        int[] result = new int[amount];
        boolean[] used = new boolean[max - min + 1];

        for (int i = 0; i < amount; i++) {
            int num;
            do {
                num = randomizeInBetween(min, max);
            } while (used[num - min]);

            used[num - min] = true;
            result[i] = num;
        }

        return result;
    }
}
