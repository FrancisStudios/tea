package tea;
import modules.error;
import modules.preparationFunctions;
import tealang.*;

public class Main {

    public static void main(String[] args) {

        /*
        CHECKING CONSOLE ARGS IF THEY FIT ALL CONSTRAINTS
         */
        String __fileContents = preparationFunctions.checkIfConsoleArgumentsAreValid(args);

        /*
        IF NO ERRORS OCCURED PASS CODE TO THE COMPILER
         */
        if(!__fileContents.equals(error.generalError)){
            compiler.compile(__fileContents);
        }

    }
}
