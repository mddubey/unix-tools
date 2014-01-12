package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Arguments not found....");
            System.err.println("Usage:  Uniq    File Name");
            System.exit(1);
        }
        String text = new MyFileReader().readFile(args[0]);
        Uniq uniq = new Uniq(text);
        System.out.println(uniq.getUniqLines());
    }
}
