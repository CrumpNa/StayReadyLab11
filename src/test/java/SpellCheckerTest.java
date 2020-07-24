import java.io.FileNotFoundException;
import java.util.Set;
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Scanner;


/*

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SpellCheckerTest {
    SpellChecker spellChecker;
    @Before
    public void setup() {
        this.spellChecker = new SpellChecker();
    }
    @Test
    public void readFileTest() throws FileNotFoundException {
        //given
        Scanner sc = new Scanner(new File("letter_from_gandhi.txt"));
        String [] expectedLine= {"Dear","friend,"}; //a split array
        //when action
        String [] actualLine= spellChecker.getLine(sc.nextLine()); //calls getLine fx
        //then
        Assert.assertEquals(expectedLine,actualLine);
    }
    @Test
    public void correctSpellingTest(){
    }
    @Test
    public void dictionarySetUpTest() throws FileNotFoundException {
        //action
        spellChecker.dictionarySetUp(); // void function the puts everything into our dictionary set
        //then
        Assert.assertTrue(spellChecker.dictionary.contains("a")); // test if a is in our set
    }
    @Test
    public void testTreeSet(){
        //should be alpha order
    }
}




*/
public class SpellCheckerTest {

    SpellChecker spellChecker;
    @Before
    public void setup() {
        this.spellChecker = new SpellChecker();


    }


    @Test
    public void readFileTest() throws FileNotFoundException {
        //given
        Scanner sc = new Scanner(new File("letter_from_gandhi.txt"));
        String [] expectedLine= {"Dear","friend,"}; //a split array
        //when action
        String [] actualLine= spellChecker.getLine(sc.nextLine()); //calls getLine fx
        //then
        Assert.assertEquals(expectedLine,actualLine);
    }

    
    @Test 
    public void correctSpellingTest(){

    }



    @Test
    public void dictionarySetUpTest() throws FileNotFoundException {

        //when 
        spellChecker.dictionarySetUp(); //takes in the alpha file, puts dictionary file into dictionary set

        Assert.assertTrue(spellChecker.dictionary.contains("a")); //tests if a is in our set
    }

    @Test
    public void testTreeSet(){
        //should be alpha order 
        
    }

}
