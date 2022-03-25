import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class CodeAssistance {

    public static final String EXT = "txt";

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input." + EXT);
        ArrayList<String> lines;
        try {
            BufferedReader reader = new BufferedReader(fileReader);
            lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } finally {
            fileReader.close();
        }
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        for (String s : array) System.out.println(s);
    }
}