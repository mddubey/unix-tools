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
        if(args.length < 2){
            System.err.println("Source and Destination Files not found");
            System.err.println("Usage:   SpaceReducerClient  SourceFileName  DestinationFileName");
            System.exit(1);
        }
        String text;
        text = new MyFileReader().readFile(args[0]);
        SpaceReducer reducer = new SpaceReducerClient(text).getReducer();
        String newText = reducer.reduceSpaces();
        new MyFileWritter().writeFile(args[1], newText);
    }
}
