package tealang;
import tealang.logicControllers.*;
import tealang.commands.*;
import content.*;

public class compiler {
    /*
    THE ENTRY POINT OF THE COMPILER
     */
    public static void compile(String __fileContents){
        if(start.start(__fileContents)){
            /*
            here I should implement some logic with reading code
             */
            System.out.print(content._runtimeStarted);
        };

        System.out.print(content._runtimeFinished);
    }
}
