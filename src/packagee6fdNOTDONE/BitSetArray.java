package packagee6fdNOTDONE;

// NOT WORKING PROPERLY

public class BitSetArray implements BitSet {

    private final long[] values;
    private final int maxValue;

    public BitSetArray(int maxValue) {
        this.maxValue = maxValue;
        this.values = new long[getIndex(maxValue) + 1];
    }

    private int getIndex(int x) {
        return x / Long.SIZE;
    }

    private int getRemainder(int x) {
        return x % Long.SIZE;
    }

    private boolean inRange(int x) {
        return (x >= 0) && x <= maxValue;
    }

    @Override
    public void add(int x) {
        if (inRange(x)) {
            values[getIndex(x)] |= ((long) 1 << (long) getRemainder(x));
        }
    }

    @Override
    public void remove(int x) {
        if (inRange(x)) {
            values[getIndex(x)] &= ~(1 << getRemainder(x));
        }
    }

    @Override
    public boolean contains(int x) {
        if (inRange(x)) {
            return (values[getIndex(x)] & (long) (1 << getRemainder(x))) != (long) 0;
        }
        return false;
    }

    @Override
    public void intersectWith(BitSet s) {
        Long[] setS = new Long[getIndex(maxValue) + 1];
        for (int i = 0; i <= Math.min(this.maxStorableValue(), s.maxStorableValue()); i++) {
            if (s.contains(i)) {
                setS[getIndex(i)] |= (1 << i);
            }
        }

        for (int i = 0; i < getIndex(maxValue) + 1; i++) {
            values[i] &= setS[i];
        }
    }

    @Override
    public int maxStorableValue() {
        return maxValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = maxValue; i >= 0; i--) {
            sb.append(contains(i) ? 1 : 0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BitSet bs = new BitSetArray(64);
        bs.add(2);

        System.out.println(bs);

//        bs.add(3);
//        bs.add(4);
//        System.out.println(bs);
//        bs.remove(3);
//        System.out.println(bs);
//
//        BitSet bs2 = new BitSetArray(64);
//        bs2.add(1);
//        bs2.add(2);
//        System.out.println(bs2);
//        bs2.intersectWith(bs);
//        System.out.println(bs2);
    }
}
