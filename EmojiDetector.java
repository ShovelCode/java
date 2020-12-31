import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("((::)|(\\*\\*))(([A-Z][a-z]{2,}))\\1");
        ArrayList<String> emojis = new ArrayList<>();
 
        int countEmoji = 0;
        int coolness;
        long threshold = 1;
        String[] text = input.split(" ");
        Matcher matcher = pattern.matcher(input);
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a >= 49 && a <= 57) {
                threshold *= Integer.parseInt(a + "");
            }
        }
        for (int i = 0; i < text.length; i++) {
            if (matcher.find()) {
                countEmoji++;
                String emoji = matcher.group(4);
                coolness = 0;
                for (int j = 0; j < emoji.length(); j++) {
                    char c = emoji.charAt(j);
                    coolness += c;
                }
                if (coolness >= threshold) {
                    emojis.add(matcher.group());
                }
            }
        }
        System.out.println(String.format("Cool threshold: %d", threshold));
        System.out.println(String.format("%d emojis found in the text. The cool ones are:", countEmoji));
        for (int i = 0; i <  emojis.size(); i++) {
            System.out.println(emojis.get(i));
        }
    }
}
