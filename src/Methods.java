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
        int errors = 0;
        int listpos = 0;
        for(int i = 0; i < theList.size(); i++) {
            String currentRow = theList.get(i);
            if (currentRow.contains("ERROR")) {
            errors++;
            }
            listpos++;
        }

        return errors;
    }

    public static ArrayList<String> getGitActivity(ArrayList<String> theList) {
        ArrayList<String> GitList = new ArrayList<String>();
        for (int i = 0; i< theList.size(); i++) {
            String currentRow = theList.get(i);
                if (currentRow.contains("INFO -                         github")) {
                    System.out.println(currentRow);
                }
            }

        return GitList;

    }

    public static ArrayList<String> GetErrorMessages(ArrayList<String> theList) {
        ArrayList<String> ErrorMessageList = new ArrayList<String>();
        for (int i = 0; i < theList.size(); i++) {
            String currentRow = theList.get(i);


        }


        return theList;
    }


}



