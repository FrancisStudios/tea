package modules;
import content.content;

public class error {
    public static String generalError = "0x0a";
    public static void noInputError(){
        System.out.println(content._noFileError);
        System.exit(0);
    }

    public static void invalidExtensionError(){
        System.out.println(content._invalidExtensionError);
        System.exit(0);
    }
}
