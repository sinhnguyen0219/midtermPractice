package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result {WIN, LOSE, NONE};
    private String word;
    private List<Character> usedLetters;
	public int misses;
    //public int misses;
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
		misses = 0;

		
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
		int numberOfOccurrences = 0;
        if (available(c) == true){
			usedLetters.add(c);		
			for(int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == c){
					numberOfOccurrences++;
				}
			}
			if (numberOfOccurrences == 0){
				misses++;
			}
			getResult();
		}else if(available(c) == false){
			misses++;
			getResult();
		}
		return numberOfOccurrences;
    }
    
    public String getResult() {
		if (misses < 6){
			return "WIN";
		}
		else if (misses >= 6){
			return "LOSE";
		}
		else {
			return "NONE";
		}
		
}
}












