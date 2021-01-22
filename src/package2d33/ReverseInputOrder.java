package package2d33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseInputOrder {

    public static void main(String[] args) throws IOException {
        final Deque<String> inputs = new ArrayDeque<>();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // tried line != null, but i don't know when it becomes null, it just carried
        // on forever
        String line = br.readLine();
        // !line.isEmpty()
        while (line != null) {
            inputs.push(line);
            line = br.readLine();
        }

        while (!inputs.isEmpty()) {
            System.out.println(inputs.pop());
        }
    }
}
