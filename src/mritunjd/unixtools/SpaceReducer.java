package mritunjd.unixtools;

public class SpaceReducer {
    String text;

    public SpaceReducer(String text) {
        this.text = text;
    }

    public String reduceSpaces() {
        return text.replaceAll(" +", " ").trim();
    }
}
