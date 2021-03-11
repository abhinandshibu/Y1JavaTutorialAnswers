package package85bb;

public abstract class AbstractStringStack implements StringStack {

    @Override
    public abstract void push(String s);

    @Override
    public abstract String pop();

    @Override
    public abstract boolean isEmpty();

    @Override
    public abstract StringStackIterator iterator();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringStackIterator iterator = iterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }

        return sb.toString();
    }

}
