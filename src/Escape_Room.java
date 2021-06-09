// Nicole Sorokin
// November 9th, 2020
// this program will run a escape room game which interacts with the user

import java.util.Scanner; // import scanner

class Escape_Room // class that implements an escape room
{   // no constructors here because I dont need them and it doesnt really make sense 
    // state the variables
    Scanner keyboard = new Scanner(System.in); // the scanner object that will get the users input 
    int answer = 0; // this variable will hold the users answer
    boolean Room1_passed=false; // this variable is a boolean and it holds a false value
    boolean Room2_passed=false; // this variable is a boolean and it holds a false value
    boolean Room3_passed=false; // this variable is a boolean and it holds a false value
    String name = null; // this variable will hold the users name
    int[] Room1_Question = {1866, 1865, 1867, 1868, 1869};// Room1_Question array
    int[] Room2_Question = {1, 2, 10, 4, 15};// Room2_Question array
    int[] Room3_Question = {23, 26, 22, 29, 21};// Room_Question array
    String[] WelcomeArray = {"This is the Super Mysterious and Adventurous Escape Room.\n",
                        "Welcome to the lobby.\n",
                        "In order to win you must unlock a 3 digit lock which is here, in the lobby. The three digits are scattered amongst three rooms.",
                        "Each room has some sort of riddle, which you are to solve.",
                        "You are given three tries per riddle.",
                        "After the first failed attempt you are given a hint AND another chance.",
                        "After the second failed attempt, you are given another chance.",
                        "After the third failed attempt...GAME OVER!!!\n"};// Welcome array

//Methods
int Return_answer()// return answer method
{
    return this.answer;// return answer value
}

boolean Return_Room1_passed()// return Room1_passed method
{
    return this.Room1_passed;// return Room1_passed boolean
}

boolean Return_Room2_passed()// return Room2_passed method
{
    return this.Room2_passed;// return Room2_passed boolean
}

boolean Return_Room3_passed()// return Room2_passed method
{
    return this.Room3_passed;// return Room2_passed boolean
}
    
String Return_name()// return return name method
{
    return this.name;// return name value
}

void Welcome()
{
    for(int count = 0; count<WelcomeArray.length; count++)
        System.out.print(WelcomeArray[count] + "\n");// display the array
}

void Room1()// room1 method, its a void because it does not return anything
{ // start of Room1 method
        
    System.out.println("Room 1:");// display room 1
    System.out.println(name + ", WHEN was Canada founded?");// display question/riddle
    
        for(int count = 0; count<Room1_Question.length; count++)// for loop for A1 array
            System.out.print(Room1_Question[count] + "\n");// display A1 array

            for (int count = 0; count <= 2; count ++)
            {   // start of the for loop
                System.out.println("\nPlease enter your answer "+name);// ask the user for their answer
                answer = keyboard.nextInt();// get and store users answer
                System.out.println("");

                if (answer == 1867) // user got it right so get out of the for //loop
                {
                    System.out.println("Hey you got it, well done "+name);// let the user know they got the asnwer right
                    count = 3; // this will terminate the for loop
                }

                    if (count == 0)// person did not guess the number after the first try
                        System.out.println ("HINT: The same year Thomas Edison was fired from Western Union");// display a hint

                    else if (count == 2)// user didn't get the answer right
                    {
                        System.out.println ("GAME OVER!!!\n");// let the user know they got the answer wrong therefore game over
                    }

                    else if (count == 3)// user got the answer right       
                    {
                        System.out.println (name + ", congratulations, you got the right answer. Now you can move onto the next room.\n");// let the user know they got the right answer and will be moving on to the next room
                        Room1_passed=true;// set Room1_passed to true
                    }
            }// end the for loop
} // end of Room1 method

void Room2()// room2 method, its a void because it does not return anything
{ // start of Room2 method
    System.out.println("Room 2:");// display room 2
    System.out.println(name+", how many Oscars has Leonardo DiCaprio won?");// display question/riddle
        
        for(int count=0; count<Room2_Question.length; count++)// for loop for A2 array
            System.out.println(Room2_Question[count]);// display A2 array

            for (int count = 0; count <= 2; count ++)
            { // start of the for loop
                System.out.println("\nPlease enter your answer " + name);// ask the user for their answer
                answer = keyboard.nextInt();// get and store answer
                System.out.println("");

                if (answer == 1) // user got it right so get out of the for loop
                {
                    System.out.println("Hey you got it, well done "+name);// let the user know they got the ritgh answer
                    count = 3; // this will terminate the for loop
                }

                    if (count == 0)// person did not guess the number after the first try
                        System.out.println ("HINT: Leonardo DiCaprio has won the same amount of Oscars as Jennifer Lawrence");// display a hint

                    else if (count == 2)// user didnt get the answer right
                    {
                        System.out.println ("GAME OVER!!!\n");// display game over, lets the user know they got the wrong answer
                    }

                    else if (count == 3) // user did get the answer right
                    {
                        System.out.println (name + ", congratulations, you got the right answer. Now you can move onto the next room.\n");// let the user know they got the right answer and will be moving on to the next room
                        Room2_passed=true;// set Room2_passed to true
                    }
            }// end the for loop
} // end of Room2 method

void Room3()// room3 method, its a void because it does not return anything
{ // start of Room3 method
    System.out.println("Room 3:");// display room 3
    System.out.println(name  +", what is the SUM of 11+12?");// display question/riddle
    
        for(int count=0; count<Room3_Question.length; count++)// for loop for A3 array
            System.out.println(Room3_Question[count]);// display A3 array
            
            for (int count = 0; count <= 2; count ++)
            { // start of the for loop
                System.out.println("\nPlease enter your answer "+name);// ask the user for their name
                answer = keyboard.nextInt();// grt ans store users name
                System.out.println("");

                if (answer == 23) // user got it right so get out of the for //loop
                {
                    System.out.println("Hey you got it, well done "+name);// let the user know they got the rigth answer
                    count = 3; // this will terminate the for loop
                }

                    if (count == 0)  // person did not guess the number after the first try
                        System.out.println ("HINT: Seriously?! Just use a calculator.");// display hint

                    else if (count == 2)// user didn't get the answer right
                    {
                        System.out.println ("GAME OVER!!!\n");// display game over, lets the user know they got the wrong answer
                    }

                    else if(count == 3) // user did get the answer right
                    {
                        System.out.println (name + ", congratulations, you got the right answer. Now it is time to go back to the lobby and open up the lock!!!\n");// let the user know they got the right answer and will be moving on to the next room
                        Room3_passed=true;// ste Room3_passed to true
                    }
            }// end of the for loop
} // end of Room3 method

void Lobby()// Lobby method, its a void because it does not return anything
{ // start of Lobby method
    System.out.println("Lobby:\n");// display lobby
    System.out.println("You are one step away from escaping this Mysterious and Adventurous Escape Room.");// display a message
    System.out.println("Now it is time to put the numbers you have collected from the three rooms to use.\n");// display a message
    System.out.println("Room 1: 1867, Room 2: 1, Room 3: 23\n");// display a message
        
        for (int count = 0; count <= 2; count ++)
        {//start of for loop
            System.out.println("Please enter the three digit code");
            answer = keyboard.nextInt();// get and store answer
            System.out.println("");
			
		if (answer == 715) // user got it right so get out of the for //loop
                {
                    System.out.println("Hey you got it, well done!");// let the user know they got the answer right
                    count = 3; // this will terminate the for loop
                }
	
                    if (count == 0)  // person did not guess the number after the first try
                    {
                        System.out.println ("HINT for the first digit: 1867-WHEN.length");// display hint for first digit
			System.out.println ("HINT for the second digit: 1-Vous n’avez besoin d’aucun indice ici.");// display hint for second digit
			System.out.println ("HINT for the third digit: 23-SUM\n");// display hint for third digit	     
                    }
                    else if (count == 2)// user didn't get the answer right
                    {
                        System.out.println ("GAME OVER!!!\n");// display game over
                    }
          
                    else if (count == 3) // user did get the answer right
                    {
                        System.out.println ("Congratulations, you cracked the code!");// display message
			System.out.println ("You've escaped!!!!\n");// display message
                    }
	}// end the for loop
}// end of lobby method
}// end of class

class Escape_Room_Tester
{ // start of tester class    
    public static void main(String[] args)// magic line 
    {   //state variables
        Scanner keyboard = new Scanner(System.in); // the scanner object that will get the users input 
        String playAgain = "yes";// this is the playAgain variable that holds a yes value, it will determine if the game loops 
        Escape_Room EP = new Escape_Room();
        
        
         
            while(playAgain.equalsIgnoreCase("yes"))// while loop loops as long as the playAgain variable is yes
            { // start of while loop
                EP.Welcome();// call Welcome method
                
                System.out.println("Please enter your name:");// ask user to enter their name
                EP.name = keyboard.nextLine();// get and store name
                System.out.println("");
                
                EP.Room1();// call Room1 method
                
                    if(EP.Room1_passed==true && EP.answer==1867)// is Room1_passed true and is answer equal to 1867  
                        EP.Room2();// call Room2 method

                    if(EP.Room2_passed==true && EP.answer==1)// is Room2_passed true and is answer equal to 1  
                        EP.Room3();// call Room3 method

                    if(EP.Room3_passed==true && EP.answer==23)// is Room2_passed true and is answer equal to 23  
                        EP.Lobby();// call Lobby method
                    
                System.out.println("Would you like to play again? Type yes or no.");// ask the user if they want to play again
                playAgain = keyboard.nextLine();// grab the user's answer
                System.out.println("");
            } // end of while loop
            
        System.out.println("Thank you for playing my game, hope you enjoyed it!");// user is done playing
    }
} // end of tester class