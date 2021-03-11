package package85bb;

import java.util.List;

public class StringStackArrayIterator implements StringStackIterator {

    private final String[] contents;
    private int iteratorPointer;

    public StringStackArrayIterator(String[] contents, int stackPointer) {
        this.contents = contents;
        this.iteratorPointer = stackPointer - 1;
    }

    @Override
    public boolean hasNext() {
        return iteratorPointer >= 0;
    }

    @Override
    public String next() {
        if (hasNext()) {
            // decrements iteratorPointer but returns the previous value of it
            return contents[iteratorPointer--];
        }
        return null;
    }

}
