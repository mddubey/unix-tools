package mritunjd.unixtools;

public class SpaceReducer {
    String text;

    public SpaceReducer(String text) {
        this.text = text;
    }

    public String reduceSpaces() {
        String textWithSingleSpaces = text.replaceAll(" +", " ");
        String textWithoutSpaceAfterNewLine = textWithSingleSpaces.replaceAll("\n ","\n");
        String textWithoutNewLineAfterSpace = textWithoutSpaceAfterNewLine.replaceAll(" \n","\n");
        return textWithoutNewLineAfterSpace.trim();
    }
}
