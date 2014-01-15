package mritunjd.fs;

import java.io.*;

public class MyFileReader {
    public String readFile(File filename) {
        String line;
        StringBuilder sb = new StringBuilder("");
        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\r\n");
            }
        } catch (FileNotFoundException e){
            System.err.println("File not Found");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("unable to Read");
            System.exit(1);
        }
        return sb.toString().trim();
    }
}
