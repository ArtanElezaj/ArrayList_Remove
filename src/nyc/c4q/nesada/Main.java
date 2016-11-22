/*

Given an array of strings and an integer, write a method that returns an ArrayList where all the strings of the given length are omitted.

wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}

 */


package nyc.Tani;

import  java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>(Arrays.asList("a","bb","b","ccc"));

        System.out.println(takeOf(letters, 4));
    }

    public static ArrayList<String> takeOf(ArrayList el, int a){

        String currentEl = "";
        for (int i = 0; i<el.size(); i++){

            currentEl = el.get(i).toString();

            if (currentEl.length() == a){
            el.remove(i);
            }

        }

        return el;
    }


}
