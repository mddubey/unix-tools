package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.fs.MyFileWritter;
import mritunjd.unixtools.SpaceReducer;

public class SpaceReducerClient {
    private SpaceReducer reducer;

    public SpaceReducerClient(String text) {
        this.reducer = new SpaceReducer(text);
    }

    public SpaceReducer getReducer() {
        return reducer;
    }

    public static void main(String[] args) {
        String text;
        text = new MyFileReader().readFile(args[0]);
        SpaceReducer reducer = new SpaceReducerClient(text).getReducer();
        String newText = reducer.reduceSpaces();
        new MyFileWritter().write(args[1],newText);
    }
}
