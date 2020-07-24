import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class SpellChecker {
    public HashSet<String> dictionary= new HashSet<String>(370104); //declare hash set names and SIZE
    public HashSet<String> misspelledWords;// and these are global variables
    public void initSet() throws FileNotFoundException, FileNotFoundException {
     

        Scanner sc = new Scanner(new File("letter_from_Ghandi.txt"));

        while (sc.hasNextLine()) { //run thru file
            String[] line = getLine(sc.nextLine()); //built in nextLine gets first line from  the file of the input scaner sc, passes to getline
            misspelledWords = new HashSet<>(Arrays.asList(line)); //put values into hash set, (Arrays.asList)=declares size of hash set dynamic like a list's is
        }

    }





    public void dictionarySetUp()throws FileNotFoundException{
        Scanner sc =new Scanner(new File("words_alpha.txt"));
        while (sc.hasNextLine()) { //run thru file
            //String[] line = getLine(sc.nextLine()); //built in nextLine gets first line from  the file of the input scaner sc, passes to getline
            dictionary.add(sc.nextLine()); //adds every word from the dict into our set
        }
    }




    public String[] getLine(String nextLine){

        String [] line=nextLine.split(" "); //splits  first line into a string array
        return line; //passes string array back to initSet String [] line
    }
}


