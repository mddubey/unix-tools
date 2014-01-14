package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.WC;

import java.io.File;

public class WcClient {
    WC wc;

    public WcClient(File fileName) {
        MyFileReader mfr = new MyFileReader();
        String text = mfr.readFile(fileName);
        this.wc = new WC(text);
    }

    public WC getWc() {
        return wc;
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Arguments not found....");
            System.err.println("Usage:  WcClient  [Option]    [File Name]");
            System.exit(1);
        }
        File file = new File(args[0]);
        WcClient cli = new WcClient(file);
        WC wc = cli.getWc();
        System.out.println("\t" + wc.countLines() + "\t" + wc.countWords() + "\t" + wc.countChars() + "\t" + file.getName());
    }
}
