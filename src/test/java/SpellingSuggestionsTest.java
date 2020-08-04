import java.io.FileNotFoundException;
import java.util.Set;
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Scanner;

public class SpellingSuggestionsTest {
    SpellingSuggestions spellingSuggestions; //iniitalize the class instance
    SpellChecker spellChecker; //use this to call the file and the functions in this class
    @Before
    public void setUp(){
        this.spellingSuggestions= new SpellingSuggestions();//set up the object, assigns obj to
    }

    @Test
    public void deleteFLTest() throws FileNotFoundException { //FL= first letter
        String file=spellChecker.dictionarySetUp();  //call file "Naja";
        //given
        String expected= "ear";
        //then
        String actual=spellingSuggestions.deleteFL(file);
        //when
        Assert.assertTrue(expected.matches(actual));

    }

    @Test
    public void deleteLLTest(){ //LL= last letter
        String name= "Naja";
        //given
        String expected= "Naj";
        //then
        String actual=spellingSuggestions.deleteLL(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }

    @Test
    public void changeLetterTest(){ // to change any letter from indices 1-one before last index (not first or last)
        //given
        String name= "Naja";
        String expected= "Nala";
        //then
       String actual=spellingSuggestions.changeLetter(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }

    @Test
    public void insertLetterTest(){
        //given
        String name= "Naja";
        String expected="Naqja";
        //then
        String actual= spellingSuggestions.insertLetter(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }

    @Test
    public void swapTwoLettersTest(){ //swap neighboring letters
        //given
        String name="Gatorade";
        String expected="Gaotrade";
        //then
        String actual=spellingSuggestions.swapTwoLetters(name);
        //when
        Assert.assertTrue(expected.matches(actual));
    }

    @Test
    public void pluralizeTest(){ //adds s to end of a word
        String name= "Naja";
        //given
        String expected= "Najas";
        //then
        String actual=spellingSuggestions.pluralize(name);
        //when
        Assert.assertTrue(expected.matches(actual));

    }



}
