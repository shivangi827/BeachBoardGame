/* BeachGame
* For Beach side
*Shivangi
*Pink Team
*/

 import java.util.Scanner;        	//import your Scanner object
import static java.lang.System.*;

 public class BeachGame
 {
String [] action;
int[] move;
int[] money;
int num;
int currency;
public int setSpots(int num)        // sets messages and add/subb spots and oney
{
action = new String[101];
move = new int [101];
money = new int [101];
 action[0]="You are brought back to the starting point";money[0]=0;move[0]=0;
 action[1]= action[23]= action[45]= action[67]= action[89]="You have found $20! Also you move 3 spots up.";
 money[1]= money[23]= money[45]= money[67]= money[89]=20;
 move[1]= move[23]= move[45]= move[67]= move[89]=3;
 action[2]= action[24]= action[46]= action[68]= action[90]="Pirates have attacked and has robbed your $25! Also you move 3 spots down! ";
 money[2]= money[24]= money[46]= money[68]= money[90]= (-25);
 move[2]= move[24]= move[46]= move[68]= move[90]=(-3);
 action[3]= action[25]= action[47]= action[69]= action[91]="You have found a party hat with $10 in it!Also you move 1 spots up!";
 money[3]= money[25]= money[47]= money[69]= money[91]=10;
 move[3]= move[25]= move[47]= move[69]= move[91]=1;
 action[4]= action[26]= action[48]= action[70]= action[92]="Parrots have taken $10.Also you move 2 spots up! ";
 money[4]= money[26]= money[48]= money[70]= money[92]=20;
 move[4]= move[26]= move[48]= move[70]= move[92]=2;
 action[5]= action[27]= action[49]= action[71]= action[93]="You have found a treaure chest with +$20. Also you move 5 spots up!";
 money[5]= money[27]= money[49]= money[71]= money[93]=20;
 move[5]= move[27]= move[49]= move[71]= move[93]=5;
 action[6]= action[28]= action[50]= action[72]= action[94]="You have found $20 floating in the ocean! ";
 money[6]= money[28]= money[50]= money[72]= money[94]=20;
 move[6]= move[28]= move[50]= move[72]= move[94]=0;
 action[7]= action[29]= action[51]= action[73]= action[95]="A wave has washed away $15 from you. ";
 money[7]= money[29]= money[51]= money[73]= money[95]=(-15);
 move[7]= move[29]= move[51]= move[73]= move[95]=0;
 action[8]= action[30]= action[52]= action[74]= action[96]="Pirates have taken $40 from you. ";
 money[8]= money[30]= money[52]= money[74]= money[96]=(-40);
 move[8]= move[30]= move[52]= move[74]= move[96]=0;
 action[9]= action[31]= action[53]= action[75]= action[97]="A gust of wind has pushed you 3 spots ahead";
 money[9]= money[31]= money[53]= money[75]= money[97]=0;
 move[9]= move[31]= move[53]= move[75]= move[97]=3;
 action[10]= action[32]= action[54]= action[76]= action[98]="A wave has pushed you back 2 spots and have lost $25. ";
 money[10]= money[32]= money[54]= money[76]= money[98]=(-25);
 move[10]= move[32]= move[54]= move[76]= move[98]=(-2);
 action[11]= action[33]= action[55]= action[77]= action[99]="A parrot has swooped in and taken $10 from you. ";
 money[11]= money[33]= money[55]= money[77]= money[99]=(-10);
 move[11]= move[33]= move[55]= move[77]= move[99]=0;
 action[12]= action[34]= action[56]= action[78]= action[44]="A crab has ripped apart your $10 bill. ";
 money[12]= money[34]= money[56]= money[78]= money[44]=(-10);
 move[12]= move[34]= move[56]= move[78]= move[44]=0;
 action[13]= action[35]= action[57]= action[79]= action[22]="Pirates have pushed you back 3 spots! ";
 money[13]= money[35]= money[57]= money[79]= money[22]=0;
 move[13]= move[35]= move[57]= move[79]= move[22]=(-3);
 action[14]= action[36]= action[58]= action[80]= action[88]="Pirates have pushed you back 5 spots and took $50 from you! ";
 money[14]= money[36]= money[58]= money[80]= money[88]=(-50);
 move[14]= move[36]= move[58]= move[80]= move[88]=(-5);
 action[15]= action[37]= action[59]= action[81]="A strong gust of wind has blown you 2 spots ahead! ";
 money[15]= money[37]= money[59]= money[81]=0;
 move[15]= move[37]= move[59]= move[81]=2;
 action[16]= action[38]= action[60]= action[82]="A wave has pushed you 1 spot back. ";
 money[16]= money[38]= money[60]= money[82]=0;
 move[16]= move[38]= move[60]= move[82]=(-1);
 action[17]= action[39]= action[61]= action[83]="You have found a beach ball with $30 attached to it! ";
 money[17]= money[39]= money[61]= money[83]=30;
 move[17]= move[39]= move[61]= move[83]=0;
 action[18]= action[40]= action[62]= action[84]= action[66]="You have found $10 floating in the water! ";
 money[18]= money[40]= money[62]= money[84]= move[66]=10;
 move[18]= move[40]= move[62]= move[84]= move[66]=0;
 action[19]= action[41]= action[63]= action[85]="A pirate came aboard and stole $50 from you! ";
 money[19]= money[41]= money[63]= money[85]=(-50);
 move[19]= move[41]= move[63]= move[85]=0;
 action[20]= action[42]= action[64]= action[86]="You have found a treasure chest with $100 and a group of fish have pushed you 4 spots ahead. ";
 money[20]= money[42]= money[64]= money[86]=100;
 move[20]= move[42]= move[64]= move[86]=4;
 action[100]="You have reached Donna's Beach Party!!! Congratulations and have fun!!!.";
 move[100]=0;
 money[100]=0;
 return 0;
}
 public  int Money()     //initiates money
	 {
   Scanner kb= new Scanner(in);
	  do                                            	//create a do while method that prompts the user to enter a money amount while it is between $250 and $650
	  {
	   out.print("What money would you like to start the game with . Please make sure it's between $250-$750: ");
	   	currency = kb.nextInt();
	   	out.println();
	  }while(currency < 250 || currency > 750);
	  return currency;
	 }//money ends

 public int Diceroll(int spot)
 	{
Scanner kb = new Scanner(in);     //create Scanner object
int d1,d2,d3,d4,D1,D2,D3,D4;
int M1=currency;
int M2=currency;
int M3=currency;
int M4=currency;  ////dice number// identify your integer die variables
int P1=0,P2=0,P3=0,P4=0;


  	                                                 	// Create a do while loop that will run the game unless someone wins
int i=1;
 	 do                    //create a do while loop that will let them roll dice and will change positions
 	 {

 	 do
 	 {


 	 if(i==1)                                                                    	//create an if statement for player 1 that will run the Math.random method for both die
 	 {
 	  out.println("Here you go player" + i);                                      	// prompt player one to press a key to roll the die
   out.print("Please press your favourite alphabet or lucky number to roll the dice1 : ");
 	  kb.next();
 	  d1= (int) (Math.random()*(6-1+1)+1);
 	  out.print("Oh you got " +d1 + "\nPlease press your favourite alphabet or lucky number to roll the dice2 : ");           //  int temp = (int)(Math.random()*(3 - 1 + 1) + 1);
 	  kb.next();
 	  D1= d1 + (int) (Math.random()*(6-1+1)+1);
 	  out.println("So finally you got " +D1 );
 	  P1+=D1;
 	       //Current Spot
 	  if (P1>100)    //No1 exceeds 100
 	  {
 	   P1=100;
 	  }
 	  if (P1 <0 || M1==0)
 	  {
 	   P1=0;
 	  }
 	  setSpots(P1);
 	  out.println("It led you to spot " +P1 + "\nWell it says at " + P1 +"\n" + action[P1] );
 	  M1+=money[P1];
 	  if (M1==0)   // you loose money go to 1!!!
 	 	{
 	 	 P1=1;
 	 	}
 	  P1+=move[P1];
 	  out.println("So Your new spot is " + P1 +" and your money is " + M1);
 	  out.println();
 	 }

 	 if(i==2)                                                              	//do the same if statements for the next three palyers
 	 {
 	  out.println("Here you go player" + i);                                      	// prompt player one to press a key to roll the die
   out.print("Please press your favourite alphabet or lucky number to roll the dice1 : ");
 	  kb.next();
 	  d2= (int) (Math.random()*(6-1+1)+1);
 	  out.print("Oh you got " +d2 + "\nPlease press your favourite alphabet or lucky number to roll the dice2 : ");           //  int temp = (int)(Math.random()*(3 - 1 + 1) + 1);
 	  kb.next();
 	  D2= d2 + (int) (Math.random()*(6-1+1)+1);
 	  out.println("So finally you got " +D2 );
 	  P2+=D2;     //Current Spot
 	  if (P2>100)    //No1 exceeds 100
 	  {
 	   P2=100;
 	  }
 	  if (P2 <0 || M2==0)
 	  {
 	   P2=0;
 	  }
 	  setSpots(P2);
 	  out.println("It led you to spot " +P2 + "\nWell it says at " + P2 +"\n" + action[P2] );
 	 	M2+=money[P2];
 	 	if (M2==0)   //you loose money go to 1!!!
 	 	{
 	 	 P2=1;
 	 	}
 	  P2+=move[P2];
 	  out.println("So Your new spot is " + P2 +" and your money is " + M2);
 	  out.println();
 	 }
 	 if(i==3)
 	 {
 	  out.println("Here you go player" + i);                                      	// prompt player one to press a key to roll the die
   out.print("Please press your favourite alphabet or lucky number to roll the dice1 : ");
 	  kb.next();
 	  d3= (int) (Math.random()*(6-1+1)+1);
 	  out.print("Oh you got " +d3 + "\nPlease press your favourite alphabet or lucky number to roll the dice2 : ");           //  int temp = (int)(Math.random()*(3 - 1 + 1) + 1);
 	  kb.next();
 	  D3= d3 + (int) (Math.random()*(6-1+1)+1);
 	  out.println("So finally you got " +D3 );
 	  P3+=D3;     //Current Spot
 	  if (P3>100)    //No1 exceeds 100
 	  {
 	   P3=100;
 	  }
 	  if (P3 <0 || M3==0)
 	  {
 	   P3=0;
 	  }
 	  setSpots(P3);
 	  out.println("It led you to spot " +P3 + "\nWell it says at " + P3 +"\n" + action[P3] );
 	  M3+=money[P3];
 	   if (M3==0)   // you loose money go to 1!!!
 	 	{
 	 	 P3=1;
 	 	}
 	  P3+=move[P3];
 	  out.println("So Your new spot is " + P3+" and your money is " + M3);
 	  out.println();
 	 }
 	 if(i==4)
 	 {
 	  out.println("Here you go player" + i);                                      	// prompt player one to press a key to roll the die
   out.print("Please press your favourite alphabet or lucky number to roll the dice1 : ");
 	  kb.next();
 	  d4= (int) (Math.random()*(6-1+1)+1);
 	  out.print("Oh you got " +d4 + "\nPlease press your favourite alphabet or lucky number to roll the dice2 : ");           //  int temp = (int)(Math.random()*(3 - 1 + 1) + 1);
 	  kb.next();
 	  D4= d4 + (int) (Math.random()*(6-1+1)+1);
 	  out.println("So finally you got " +D4 );
 	  P4+=D4;     //Current Spot
 	  if (P4>100)    //No1 exceeds 100
 	  {
 	   P4=100;
 	  }
 	  if (P4 <0 || M4==0)
 	  {
 	   P4=0;
 	  }
 	  setSpots(P4);
 	  out.println("It led you to spot " +P4 + "\nWell it says at " + P4 +"\n" + action[P4] );
 	  M4+=money[P4];
 	  if (M4==0)   // you loose money go to 1!!!
 	 	{
 	 	 P4=1;
 	 	}
 	  P4+=move[P4];
 	  out.println("So Your new spot is " + P4+" and your money is " + M4);i=0;
 	  out.println();
 	 }
 	 if (P1==100 || P2==100 || P3==100 || P4==100)
 	 {
   if (P1> P2 && P1> P3 && P1>P4)
 	{
 	 out.println( "Player1 won");   //shout out to player1
 	  if( P2> P3 && P2 >P4)    //player 2 is second
 	  {
 	   out.println("1st runner up : Player 2.And you are at " + P2);
 	    if (P3>P4)     //player 3 is third
 	    {
 	     out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else      //player 4 is third
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	  }
 	  if( P3> P2 && P3 >P4)    //player 3 is second
 	  {
 	   out.println("1st runner up : Player 3.And you are at " + P3);
 	    if (P2>P4)
 	    {
 	     out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	  }
 	  if( P4> P2 && P3 <P4)    //player 4 is second
 	  {
 	   out.println("1st runner up : Player 4.And you are at " + P4);
 	    if (P2>P3)
 	    {
 	     out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	}
 	}//player 1 won
 	if (P2> P1 && P2> P3 && P2>P4)
 	{
 	 out.println("Player2 won");      //shout out to player2
 	 if( P1> P3 && P1 >P4)    //player 1 is second
 	  {
 	   out.println("1st runner up : Player 1.And you are at " + P1);
 	    if (P3>P4)     //player 3 is third
 	    {
 	     out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else      //player 4 is third
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	  }
 	   if( P3> P1 && P3 >P4)    //player 3 is second
 	  {
 	   out.println("1st runner up : Player 3.And you are at " + P3);
 	    if (P1>P4)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	  }
 	  if( P4> P1 && P3 <P4)    //player 4 is second
 	  {
 	   out.println("1st runner up : Player 4.And you are at " + P4);
 	    if (P1>P3)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	}
 	}//player 2 won
 	if (P3> P1 && P3> P2 && P3>P4)
 	{
 	 out.println("Player3 won");      //shout out to player3
 	 if( P1> P2 && P1 >P4)    //player 1 is second
 	  {
 	   out.println("1st runner up : Player 1.And you are at " + P1);
 	    if (P2>P4)     //player 2 is third
 	    {
 	     out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else      //player 4 is third
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	  }
 	   if( P2> P1 && P2 >P4)    //player 2 is second
 	  {
 	   out.println("1st runner up : Player 2.And you are at " + P2);
 	    if (P1>P4)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 4 :( . You are the last!.And you are at " + P4);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 4.And you are at " + P4);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	  }
 	  if( P4> P1 && P2 <P4)    //player 4 is second
 	  {
 	   out.println("1st runner up : Player 4.And you are at " + P4);
 	    if (P1>P2)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	}
 	}
 	if (P4> P1 && P4> P2 && P4>P3)
 	{
 	 out.println("Player4 won");      //shout out to player4
 	 if( P1> P3 && P1 >P2)    //player 1 is second
 	  {
 	   out.println("1st runner up : Player 1.And you are at " + P1);
 	    if (P3>P2)     //player 3 is third
 	    {
 	     out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	    else      //player 2 is third
 	    {
 	      out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	  }
 	   if( P3> P1 && P3 >P2)    //player 3 is second
 	  {
 	   out.println("1st runner up : Player 3.And you are at " + P3);
 	    if (P1>P2)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 2 :( . You are the last!.And you are at " + P2);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 2.And you are at " + P2);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	  }
 	  if( P2> P1 && P3 <P2)    //player 2 is second
 	  {
 	   out.println("1st runner up : Player 2.And you are at " + P2);
 	    if (P1>P3)
 	    {
 	     out.println("2nd runner up : Player 1.And you are at " + P1);
 	     out.println("Sorry player 3 :( . You are the last!.And you are at " + P3);
 	    }
 	    else
 	    {
 	      out.println("2nd runner up : Player 3.And you are at " + P3);
 	     out.println("Sorry player 1 :( . You are the last!.And you are at " + P1);
 	    }
 	}
 	}
 	  break;
 	 }
 	 i++;
 	 } while(i<=4);
 	    //do while ends
 	 }while(P1>=100 && P2>=100 && P3>=100 && P4>=100);  // do while ends after someone reaches over 100
  return spot;
 	}//Dice roll ends


}// class ends






