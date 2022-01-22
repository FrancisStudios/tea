package tealang.logicControllers;
public class statusController {
    public static Boolean isStarted = false;

    public static void flipIsStartedController(){
        isStarted = !isStarted;
    }
}
