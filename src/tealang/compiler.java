package tealang;
import tealang.logicControllers.*;
import tealang.commands.*;

public class compiler {
    /*
    THE ENTRY POINT OF THE COMPILER
     */
    public static void compile(String __fileContents){
        if(start.start(__fileContents)){
            System.out.println(statusController.isStarted);
        };
    }
}
