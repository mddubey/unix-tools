package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) {
        String text = new MyFileReader().readFile(args[0]);
        Uniq uniq = new Uniq(text);
        System.out.println(uniq.getUniqLines());
    }
}
