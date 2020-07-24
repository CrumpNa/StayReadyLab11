import java.io.FileNotFoundException;
import java.util.Set;
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.Scanner;

public class SpellingSuggestionsTest {
    SpellingSuggestions spellingSuggestions; //iniitalize the class instance
    @Before
    public void setUp(){
        this.spellingSuggestions= new SpellingSuggestions();//set up the object, assigns obj to
    }

    @Test
    public void deleteFLTest(){ //FL= first letter
        String name= "Naja";
        //given
        String expected= "aja";
        //then
        String actual=spellingSuggestions.deleteFL(name);
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
        //then
        //when

    }

    @Test
    public void insertLetterTest(){ //
        //given
        //then
        //when

    }

    @Test
    public void swapTwoLettersTest(){ //swap neighboring letters
        //given

        //then
        //when

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
