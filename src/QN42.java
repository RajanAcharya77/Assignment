import java.util.Locale;
public class QN42 {
    public static void main(String[] args) {
        String str = " Black dog has Black teeth.";
        int count;
        str = str.toLowerCase(Locale.ROOT);
        String words[] = str.split("");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }


            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}