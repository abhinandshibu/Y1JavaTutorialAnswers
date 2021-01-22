package package67dd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordCount {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noLines = 0;
        int noWords = 0;
        int noCharacters = 0;

        String line = br.readLine();
        // line != null
        while (!line.isEmpty()) {
            noLines += 1;

            String[] words = line.split("[ -]");
            noWords += words.length;

            for (String word : words) {
                noCharacters += word.replaceAll("[^a-zA-Z0-9]", "").length();
            }

            line = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Lines: ");
        sb.append(noLines);
        sb.append("\nWords: ");
        sb.append(noWords);
        sb.append("\nCharacter: ");
        sb.append(noCharacters);

        System.out.print(sb);
    }

}
