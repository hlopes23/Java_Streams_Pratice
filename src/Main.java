import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a Trash Mercedes Benz";


        Stream<String> prayers = Arrays.stream(prayer.split("\\W+")); // turns a String Array into a Stream of Strings

        String pray = prayers.map(String::toUpperCase) // all words in uppercase
                .filter(word -> !word.equals("TRASH")) // removes word 'trash'
                .reduce (" ", ( word, word2) -> word + " " + word2); // puts everything in one string

        System.out.println(pray);

    }
}