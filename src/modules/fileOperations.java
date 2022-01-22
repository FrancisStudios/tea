package modules;
import java.io.*;

public class fileOperations {
    public static String readFile(String inputFile) {

        String __fileContents = "";

        try{
            FileReader _fileHandler = new FileReader(inputFile);
            int _reader = 0;

            while((_reader=_fileHandler.read())!=-1){
                __fileContents += ((char)_reader);
            }
            return __fileContents;

        } catch (Exception e){
            e.printStackTrace();
            return error.generalError;
        }

    }
}
