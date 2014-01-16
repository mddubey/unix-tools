package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.FieldCutter;
import mritunjd.unixtools.helper.MyArray;

import java.io.File;

public class FieldCutterClient {
    FieldCutter cutter;

    public FieldCutterClient(String text) {
        this.cutter = new FieldCutter(text);
    }

    public FieldCutter getCutter() {
        return cutter;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Arguments not found....");
            System.err.println("Usage:  FieldCutterClient  [Option]    File Name");
            System.exit(1);
        }
        CutInputOptions userInputs = new CutInputOptions(args);
        File file = new File(userInputs.getFilename());
        String text = new MyFileReader().readFile(file);
        FieldCutter cutter = new FieldCutterClient(text).getCutter();
        String[] linesAfterCut = cutter.cutLines(userInputs.getFields(), userInputs.getDelimiter());
        String result = new MyArray(linesAfterCut).join("\n");
        System.out.println(result);
    }
}
