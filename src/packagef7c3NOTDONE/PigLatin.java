package packagef7c3NOTDONE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class PigLatin {

  public static void main(String[] args) throws IOException {
      List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');
      final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] englishInp = br.readLine().split(" ");

      StringBuilder pigLatin = new StringBuilder();

      // assuming the sentence is well formed
      String pigLatinWord;
      for (String word : englishInp) {
          if (Character.isLetter(word.charAt(0))) {
              if (VOWELS.contains(word.charAt(0))) {
              }
          } else {
              pigLatinWord = word;
          }
          pigLatin.append(word);
          pigLatin.append(" ");
      }


  }
}
