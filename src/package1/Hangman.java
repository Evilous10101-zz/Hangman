package package1;
//Hangman PSEUDOCODE
import java.util.Scanner;
import java.util.*;
public class Hangman {
// Present game state (Mask = replace chars of word no guesses with asterisk)
	
	private  String cat;
    private  String word = cat;
    public String mask;
    
    
		
    
	
	public static int x = 5;
	 
public static int NUMBER_OF_BAD_GUESSES_BEFORE_DEATH = (x);
public static void main(String args[])
 {
System.out.println("Hello! You are playing hangman please hold while we gather some data. Please only use lowercase letters.");

	{
		
		System.out.println("You have this many letters you can get wrong before you lose: " + NUMBER_OF_BAD_GUESSES_BEFORE_DEATH);
		
	}

//If not solved
	
//get input from user
 
		Scanner in = new Scanner(System.in);
		
		 {
		
{
		
	
	//Prompt user to guess letter
    char [] c;
    String temp;
    Scanner bee = new Scanner(System.in);
    System.out.println("Please guess any letter");
    temp=bee.next();
    c=temp.toCharArray();
}
    if(NUMBER_OF_BAD_GUESSES_BEFORE_DEATH > 0) {
    	
    System.out.println("I am sorry you got that letter wrong. You have this many guesses left: " + NUMBER_OF_BAD_GUESSES_BEFORE_DEATH);
   
   
    }
  
    	
    
    else {
    	System.out.println("You lost please play again");
    	 System.exit(0); 
    
    }
		 } 
 }
    
     

	
 

    
   
//Apply guess to game



 
 // Present game state (Mask = replace chars of word no guesses with asterisk)


public void mark()
{
	System.out.println(word);
	 
}
}

 

