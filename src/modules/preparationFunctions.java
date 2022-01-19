package modules;
import content.content;

public class preparationFunctions {
    public static void checkIfConsoleArgumentsAreValid(String[] args){
        String __inputFile =
                args.length > 0 ?
                        args[0] :
                        content._noFileContent;

        String[] __inputExtension =
                args.length > 0 ?
                        args[args.length-1].split(".") :
                        new String[] {content._noFileContent} ;


        if(__inputFile == content._noFileContent){
            error.noInputError();
        } else fileOperations.readFile(__inputFile);
    }
}
