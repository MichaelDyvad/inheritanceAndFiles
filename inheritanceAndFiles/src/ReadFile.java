import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public void ReadThisFile() throws FileNotFoundException {
        ArrayList<String> strings = new ArrayList<>();
        File readStrings = new File("inheritanceAndFiles/Ressources/ReadStrings.CSV");
        Scanner filScanner = new Scanner(readStrings);
        filScanner.nextLine();

        while(filScanner.hasNext()){
            String thisLine = filScanner.nextLine();

            String[] lineAsArray = thisLine.split(";");
            String name = lineAsArray[0];
            String color = lineAsArray[1];

            strings.add(name);
            strings.add(color);

        }
        
    }
}
