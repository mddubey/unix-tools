package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.fs.MyFileWritter;
import mritunjd.unixtools.SpaceReducer;

import java.io.File;

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
        text = new MyFileReader().readFile(new File(args[0]));
        SpaceReducer reducer = new SpaceReducerClient(text).getReducer();
        String newText = reducer.reduceSpaces();
        new MyFileWritter().writeFile(new File(args[1]), newText);
    }
}
