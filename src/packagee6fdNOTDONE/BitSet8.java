package packagee6fdNOTDONE;

public class BitSet8 implements BitSet {

    private byte set;

    public BitSet8() {
        set = 0;
    }

    private boolean inRange(int x) {
        return (x >= 0 && x <= maxStorableValue());
    }

    @Override
    public void add(int x) {
        if (!inRange(x)) {
            throw new RuntimeException("Value " + x + " too large for bit set");
        }
        set |= (byte) (1 << x);
    }

    @Override
    public void remove(int x) {
        if (inRange(x)) {
            set &= (byte) ~(1 << x);
        }
    }

    @Override
    public boolean contains(int x) {
        if (!inRange(x)) {
            return false;
        }
        return ((1 << x) & set) != 0;
    }

    @Override
    public void intersectWith(BitSet s) {
        byte setS = 0;
        for (int i = 0; i < this.maxStorableValue(); i++) {
            if (s.contains(i)) {
                setS += (byte) (1 << i) ;
            }
        }

        set = (byte) (set & setS);
    }

    @Override
    public int maxStorableValue() {
        return Byte.SIZE - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = this.maxStorableValue(); i >= 0; i--) {
            if (this.contains(i)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        BitSet bs = new BitSet8();
        bs.add(2);
        bs.add(3);
        bs.add(4);
        System.out.println(bs);
        bs.remove(3);
        System.out.println(bs);

        BitSet bs2 = new BitSet8();
        bs2.add(1);
        bs2.add(2);
        System.out.println(bs2);
        bs2.intersectWith(bs);
        System.out.println(bs2);

    }
}
