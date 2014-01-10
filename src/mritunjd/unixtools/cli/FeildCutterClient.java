package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.FieldCutter;

class CutInputOptions{
    private String filename;
    private int fieldNo = 1;
    private String delemiter = " ";

    CutInputOptions(String[] inputs) {
        for (String input : inputs) {
            if(input.startsWith("-d"))
                this.delemiter = input.substring(2);
            else if(input.startsWith("-f"))
                this.fieldNo = Integer.parseInt(input.substring(2));
            else this.filename = input;
        }
    }

    public String getFilename() {
        return filename;
    }

    public int getFieldNo() {
        return fieldNo;
    }

    public String getDelemiter() {
        return delemiter;
    }
}

public class FeildCutterClient {
    FieldCutter cutter;

    public FeildCutterClient(String text) {
        this.cutter = new FieldCutter(text);
    }

    public FieldCutter getCutter() {
        return cutter;
    }

    public static void main(String[] args) {
        CutInputOptions userInputs = new CutInputOptions(args);
        String text = new MyFileReader().readFile(userInputs.getFilename());
        FieldCutter cutter = new FeildCutterClient(text).getCutter();
        String[] fields = cutter.getFields(userInputs.getFieldNo(),userInputs.getDelemiter());
        StringBuilder sb = new StringBuilder("");
        for (String field : fields) {
            sb.append(field).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
