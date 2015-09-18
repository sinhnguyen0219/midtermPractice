package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
    
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
		//below tests by adding the letter a to the arraylist to see 
		//if the first method works
		//usedLetters.add('a');
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
		boolean avail = true;
		for (int i = 0; i < usedLetters.size();i++){
			if (c == usedLetters.get(i)){
			avail = false;
		}else{
			avail = true;
		}
		}
		return avail;
	}
    
    
    public int guess(char c) {
        return 0;
    }
    
    public Result getResult() {
        return Result.NONE;
    }
    
}












