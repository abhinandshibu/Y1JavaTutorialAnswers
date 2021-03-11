package package1486;

public class StringStackArray implements StringStack {

    private final String[] store;
    private int stackPointer;
    private final int STACK_SIZE = 100;

    // Creates an empty string stack
    public StringStackArray() {
        this.store = new String[STACK_SIZE];
        this.stackPointer = 0;
    }

    // If the stack is full, does nothing.
    // Otherwise, pushes the given String on to the top of the stack
    public void push(String s) {
        if (stackPointer < STACK_SIZE) {
            store[stackPointer] = s;
            stackPointer++;
        }
    }

    // If the stack is empty, leaves the stack unchanged and returns
    // null.  Otherwise, removes the string that is on the top of
    // the stack and returns it
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            stackPointer--;
            return store[stackPointer];
        }
    }

    // Returns true iff the stack is empty
    public boolean isEmpty() {
        return stackPointer == 0;
    }

}
