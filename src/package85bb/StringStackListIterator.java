package package85bb;

import java.util.List;

public class StringStackListIterator implements StringStackIterator {

    private final List<String> contents;
    private int iteratorPointer;

    public StringStackListIterator(List<String> contents) {
        this.contents = contents;
        this.iteratorPointer = contents.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return iteratorPointer >= 0;
    }

    @Override
    public String next() {
        if (hasNext()) {
            // returns the value for iteratorPointer, then decrements it
            return contents.get(iteratorPointer--);
        }
        return null;
    }
}
