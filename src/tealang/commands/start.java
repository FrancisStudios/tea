package tealang.commands;
import content.tealangLanguage;
import tealang.logicControllers.statusController;

public class start {
    /*
    THIS FUNCTION STARTS RUNTIME AND SETS STATUS CONTROLLER
    AS SOON AS IT IS CALLED VALIDLY
     */
    public static boolean start(String __program){
        statusController.flipIsStartedController();
        return __program.substring(0, 6).equals(tealangLanguage._start);
    }
}
