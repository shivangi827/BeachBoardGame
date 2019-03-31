

/**
 * BeachPlayer Class
 *
 *
 * @Shivangi
 * @version 1.00 2017/5/9
 */
import java.util.Scanner;
import static java.lang.System.*;
   //import Scanner method
public class Beachplayer     //Players information
  {

 private String p1,p2,p3,p4;  	//these variables will keep track of the players


	 public  void Playerinfo()      	      //Create a public Player for String name
	 {
	  out.println("Let's Play...!!!\n(It's a 4 player game.So, enter your game and try your luck!\n");
         	Scanner kb = new Scanner(in);     	// create your Scanner object
	  out.print("Please enter your name : ");   //prompt the player to enter their name
	  p1= kb.next();
	  out.println("So you are player 1 : " + p1 + "\n");
	  out.print("Please enter your name : ");   //prompt the player to enter their name
	  p2= kb.next();
	  out.println("So you are player 2 : " + p2+ "\n");
	  out.print("Please enter your name : ");   //prompt the player to enter their name
	  p3= kb.next();
	  out.println("So you are player 3 : " + p3+ "\n");
	  out.print("Please enter your name : ");   //prompt the player to enter their name
	  p4= kb.next();
	  out.println("So you are player 4 : " + p4+ "\n");
	 }//Playerinfo ends


 public static void main (String[] args)
 {
  Beachplayer me = new Beachplayer();
  String answer;
  do
  {
   
  me.Playerinfo();
  BeachGame see = new BeachGame();
  see.Money();
  see.Diceroll(2);
  
  out.print("Isn't this game lit???");
  out.print("Do you want to play again (y/n)??");
  
  Scanner kb = new Scanner (in);
        	answer = kb.next();
        	 out.println("\n\n");
        	
    	 }while (answer.equalsIgnoreCase("y"));

 }//main ends
    	}
