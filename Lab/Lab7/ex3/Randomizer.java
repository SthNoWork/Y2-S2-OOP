package ex3;

public class Randomizer extends TextRandomizer {
    @Override
    char randomizeACharacter() {
        return (char) (Math.random() * 26 + 'a');
    }

    @Override
    String randomizeAString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomizeACharacter());
        }
        return sb.toString();
    }

    @Override
    String[] randomizeStrings(int length, int amount) {
        String[] result = new String[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = randomizeAString(length);
        }
        return result;
    }
    
}
