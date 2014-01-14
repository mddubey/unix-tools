package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Uniq;

import java.io.File;

public class UniqClient {
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Arguments not found....");
            System.err.println("Usage:  Uniq    File Name");
            System.exit(1);
        }
        File file = new File(args[0]);
        String text = new MyFileReader().readFile(file);
        Uniq uniq = new Uniq(text);
        System.out.println(uniq.getUniqLines());
    }
}
