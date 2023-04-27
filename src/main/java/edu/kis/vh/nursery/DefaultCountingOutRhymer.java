package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INITIAL_TOTAL = -1;
    private static final int NUMBERS_AMOUNT = 12;

    private final int[] numbers = new int[NUMBERS_AMOUNT];
    

    private int total = INITIAL_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_TOTAL;
    }

    public boolean isFull() {
        return total == NUMBERS_AMOUNT + INITIAL_TOTAL;
    }

    protected int peekaBoo() {
        if (callCheck())
            return INITIAL_TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_TOTAL;
        return numbers[total--];
    }

}
