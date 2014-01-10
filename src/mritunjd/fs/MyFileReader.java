package mritunjd.fs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public String readFile(String filename) {
        String line;
        StringBuilder sb = new StringBuilder("");
        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\r\n");
            }
            return sb.toString().trim();
        } catch (FileNotFoundException e){
            System.err.println("File not Found");
            return "";
        } catch (IOException e) {
            System.err.println("unable to Read");
            return "";
        }
    }
}
