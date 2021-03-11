package package85bb;

import java.util.LinkedList;
import java.util.List;

public class StringStackList extends AbstractStringStack {

    private final List<String> store;

    public StringStackList() {
        this.store = new LinkedList<>();
    }

    // If the stack is full, does nothing.
    // Otherwise, pushes the given String on to the top of the stack
    public void push(String s) {
        store.add(s);
    }

    // If the stack is empty, leaves the stack unchanged and returns
    // null.  Otherwise, removes the string that is on the top of
    // the stack and returns it
    public String pop() {
        return store.remove(store.size() - 1);
    }

    // Returns true iff the stack is empty
    public boolean isEmpty() {
        return store.size() == 0;
    }

    @Override
    public StringStackIterator iterator() {
        return null;
    }

}
