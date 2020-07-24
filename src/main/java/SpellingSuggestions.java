import java.util.ArrayList;

public class SpellingSuggestions extends SpellChecker {

    ArrayList<String> suggestions= new ArrayList<String>(); //declare array list

    public String deleteFL(String word){
        String tempWord=word.substring(1,word.length()-1); //makes new word without first
        if(dictionary.contains(tempWord)){ //if word without first letter is in the dict
            suggestions.add(tempWord); //add it to the array list
        }

        return tempWord;

    }

    /**
     * This deletes last letter and sees if it is in dictionary
     * @param word the word being manipulated.
     */
    public String deleteLL(String word){
        String tempWord=word.substring(0,word.length()-1); //makes new word without last
        if(dictionary.contains(tempWord)){
            suggestions.add(tempWord); //add it to the array list
        }
        return tempWord;

    }



    /**
     * This method pluralizes a word input
     * @param word the word being manipulated.
     */
    public String pluralize(String word) {
        String tempWord = word + "s"; //pluralize the word
        if (dictionary.contains(tempWord)) {
            suggestions.add(tempWord); //add it to the array list
        }
        return tempWord;
    }
}
