package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.FieldCutter;
import mritunjd.unixtools.helper.MyArray;

import java.io.File;

class CutInputOptions {
    private String filename;
    private int[] fieldNo = {1};
    private String delemiter = " ";

    CutInputOptions(String[] inputs) {
        for (String input : inputs) {
            if (input.startsWith("-d"))
                this.delemiter = input.substring(2);
            else if (input.startsWith("-f")) {
                String[] fieldsAsStrings = input.substring(2).split(",");
                int[] fieldsAsNumeric = new int[fieldsAsStrings.length];
                for (int i = 0; i < fieldsAsStrings.length; i++) {
                    fieldsAsNumeric[i] = Integer.parseInt(fieldsAsStrings[i]);
                }
                this.fieldNo = fieldsAsNumeric;
            }
            else this.filename = input;
        }
    }

    public String getFilename() {
        return filename;
    }

    public int[] getFieldNo() {
        return fieldNo;
    }

    public String getDelemiter() {
        return delemiter;
    }
}

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
        String[] linesAfterCut = cutter.cutLines(userInputs.getFieldNo(), userInputs.getDelemiter());
        String result = new MyArray(linesAfterCut).join("\n");
        System.out.println(result);
    }
}
