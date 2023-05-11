package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {
    /**
     * In the countOut method elements are taken from the stack of parent class and added
     * to the temporary stack. Then the elements are taken from the temporary stack and added back to the stack
     * of the parent class so that the order of the elements on it matches the order at the beginning.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
