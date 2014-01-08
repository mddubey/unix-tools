package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.WC;

import java.io.File;

public class WcClient {
    WC wc;

    public WcClient(String fileName) {
        MyFileReader mfr = new MyFileReader();
        String text = mfr.readFile(fileName);
        this.wc = new WC(text);
    }

    public WC getWc() {
        return wc;
    }

    public static void main(String[] args) {
        WcClient cli = new WcClient(args[0]);
        WC wc = cli.getWc();
        File file = new File(args[0]);
        System.out.println("\t" + wc.countLines() + "\t" + wc.countWords() + "\t" + wc.countChars() + "\t" + file.getName());
    }
}
