package game;

import java.util.Random;

public class NumberGuessingGame {
    private int maxAttempts;
    private int numberRangeStart;
    private int numberRangeEnd;
    private int numberToWin;
    private int attempts;

    public NumberGuessingGame(int maxAttempts, int numberRangeStart, int numberRangeEnd) {
        this.maxAttempts = maxAttempts;
        this.numberRangeStart = numberRangeStart;
        this.numberRangeEnd = numberRangeEnd;
        resetGame();
    }

    public void resetGame() {
        Random random = new Random();
        numberToWin = random.nextInt(numberRangeEnd - numberRangeStart + 1) + numberRangeStart;
        attempts = 0;
    }

    public int getAttemptsLeft() {
        return maxAttempts - attempts;
    }

    public boolean hasAttempts() {
        return attempts < maxAttempts;
    }

    public boolean checkGuess(int guess) {
        attempts++;
        return guess == numberToWin;
    }

    public String getHint(int guess) {
        return guess < numberToWin ? "higher" : "lower";
    }

    public int getNumberToWin() {
        return numberToWin;
    }
}