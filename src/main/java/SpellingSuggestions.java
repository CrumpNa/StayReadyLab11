import java.util.ArrayList;

public class SpellingSuggestions extends SpellChecker {

    ArrayList<String> suggestions= new ArrayList<String>(); //declare array list

    public void deleteFL(String word){
        String tempWord=word.substring(1,word.length()-1); //makes new word without first
        if(dictionary.contains(tempWord)){ //if word without first letter is in the dict
            suggestions.add(tempWord); //add it to the array list
        }


    }

    /**
     * This deletes last letter and sees if it is in dictionary
     * @param word the word being manipulated.
     */
    public void deleteLL(String word){
        String tempWord=word.substring(0,word.length()-1); //makes new word without last
        if(dictionary.contains(tempWord)){
            suggestions.add(tempWord); //add it to the array list
        }

    }



    /**
     * This method pluralizes a word input
     * @param word the word being manipulated.
     */
    public void pluralize(String word) {
        String tempWord = word + "s"; //pluralize the word
        if (dictionary.contains(tempWord)) {
            suggestions.add(tempWord); //add it to the array list
        }
    }
}
