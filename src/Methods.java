import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Methods {
    public static ArrayList<String> readFile() {
        ArrayList<String> List = new ArrayList<String>();
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("ideaold.log"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (fileReader.hasNext()) {
            List.add(fileReader.nextLine());
        }

        return List;
    }

    public static int countErrors(ArrayList<String> theList) {
        int amountOfErrors = 0;

        for(int i = 0; i < theList.size(); i++) {

        }

        return 0;
    }
}



