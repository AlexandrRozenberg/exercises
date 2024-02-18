package exercises.leedcode.task193;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "(\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4})";
        Pattern pattern = Pattern.compile(regex);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while((line = reader.readLine()) != null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    System.out.println(matcher.group());
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
