package ex2;

abstract class NumberRandomizer {
    abstract int randomizeInBetween(int min, int max);
    abstract int[] randomizeUniqueInBetween(int min, int max, int amount);
}