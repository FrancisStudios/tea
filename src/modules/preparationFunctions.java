package modules;
import content.content;

import java.util.Arrays;

public class preparationFunctions {
    public static String checkIfConsoleArgumentsAreValid(String[] args){
        String __inputFile =
                args.length > 0 ?
                        args[0] :
                        content._noFileContent;

        String __inputExtension = __inputFile != content._noFileContent ?
                getExtensionOfInputFile(args) :
                error.generalError;

        /*
        KILL PROGRAM WITH ERROR IF NO INPUT FILE, OR EXTENSION NOT MATCH
         */
        if(__inputFile == content._noFileContent){
            error.noInputError(); // no input file specified
        } else if (!__inputExtension.equals(content._defaultExtension)) {
            error.invalidExtensionError();
        }

        /*
        INVOKE FILE OPERATIONS IF EVERYTHING CHECKS OUT
         */
        if(
                (__inputExtension.equals(content._defaultExtension)) &&
                (__inputFile != content._noFileContent)
        ) return fileOperations.readFile(__inputFile);

        return error.generalError;
    }

    private static String getExtensionOfInputFile(String[] arguments){
        return (arguments[0].split("\\."))[(arguments[0].split("\\.")).length - 1];
    }
}
