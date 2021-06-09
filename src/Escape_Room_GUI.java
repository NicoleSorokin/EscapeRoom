// Nicole Sorokin
// November 9th, 2020
// this program will run a escape room gamein GUI format which interacts with the user

import java.awt.event.*;// import Abstract Window Toolkit event which contains all the classes to create my user interface, helps me develop my GUI, the * includes all the functions of swing so I dont have to import each function seperately
import javax.swing.*;// import swing, the * includes all the functions of swing so I dont have to import each function seperatly

public class Escape_Room_GUI// class that implements an escape room
{// no constructors here because I dont need them and it doesnt really make sense 
    // state the variables
    int count = 0;// this variable holds the count
    String escape_room = "lobby";// this variable hols the current value of the room, default is lobby
    String Room1_Questions = "1) 1866<br/>2) 1865<br/>3) 1867<br/>4) 1868<br/>5) 1869</html>";// Room1_Questions string, I made it a string because an array isnt necessary here. its just a string for output, nothing special
    String Room2_Questions = "1) 1<br/>2) 2<br/>3) 10<br/>4) 4<br/>5) 3</br></html>";// Room2_Questions string, I made it a string because an array isnt necessary here. its just a string for output, nothing special
    String Room3_Questions = "1) 23<br/>2) 26<br/>3) 22<br/>4) 29<br/>5) 21</br></html>";// Room3_Questions string, I made it a string because an array isnt necessary here. its just a string for output, nothing special
    String WelcomeMessage = "<html>This is the Super Mysterious and Adventurous Escape Room.<br/>"
                            + "<br/>Welcome to the lobby.<br/>In order to win you must unlock a 3 digit lock which is here, in the lobby.<br/>"
                            + "The three digits are scattered amongst three rooms.<br/>Each room has some sort of riddle, which you are to solve.<br/>"
                            + "You are given three tries per riddle.<br/>After the first failed attempt you are given a hint AND another chance.<br/>"
                            + "After the second failed attempt, you are given another chance.<br/>After the third failed attempt...GAME OVER!!!<br/>"
                            + "<br/>Please enter your name below:<br/><br/></html>";//WelcomeMessage string, I made it a string because an array isnt necessary here. its just a string for output, nothing special
    String usersName; // this variable will hold the users name
    JFrame escape_room_frame = new JFrame("Super Mysterious and Adventurous Escape Room");// create the JFrame in other words the output window and give it a title
    JPanel escape_room_panel = new JPanel(null);// create the JPanel, in other words the container that will store my components
    JTextField userInput = new JTextField();// create the JTextField that will let the user type in
    JButton OK_button = new JButton("OK!");// create the JButton, the button the user will click and give it a name/title "OK!"
    JLabel firstLabel = new JLabel();// create my first JLabel, which will display text
    JLabel secondLabel = new JLabel();// create my second JLabel, which will display text
   
// my 3 methods
public void Escape_Room_GUI() // Escape_Room_GUI method 
{// start of Escape_Room_GUI
    escape_room_frame.setBounds(50, 50, 700, 500);//setting the size of the JFrame manually
    escape_room_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// setting so that when the user clicks the exit button the program actually exits/closes and stops running
    escape_room_frame.getContentPane().add(escape_room_panel);// retreive the content pane layer and add the my JPanel
    escape_room_frame.setVisible(true);// set the JFrame to be visible
    All_The_Rooms();// call the All_The_Rooms method
}// end of Escape_Room_GUI
 
public void All_The_Rooms() // All_The_Rooms method
{// start of All_The_Rooms method
    firstLabel.setBounds(20,20,500,200);//setting the size of the firstLabel manually
    firstLabel.setVisible(true);// set the firstLabel to be visible
    escape_room_panel.add(firstLabel);// add the firstlable to the escape_room_panel
    userInput.setBounds(20,230,150,25);// set the size of the userInput (JTextField) manually
    userInput.setVisible(false);// set the userInput (JTextField) to not be visible 
    escape_room_panel.add(userInput);// add the userInput (JTextField) to the panel
    OK_button.setBounds(200,230,60,25);// set the size of the button manually
    OK_button.setVisible(true);// set the button to be visible
    firstLabel.setText("<html>Welcome to Escape Room Game!<br/><br/>Please click OK! to start THE Game!</html>");//set the current text for the firslabel to be this, basically dsiplay it
    escape_room_panel.add(OK_button);// add the button to the panel
    escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
    
        OK_button.addActionListener(new ActionListener()// add an actionlister which is responsible for handling an event which in this case is when the OK_button is clicked 
        {// this contains everything that happens when the OK_button is clicked every single time
            @Override// Java gave me an error and suggested I insert this, I learned that it demonstrates that the base class method is being over written by the child class method
            public void actionPerformed(ActionEvent event)// responds to the click action of OK_button
            {// start of actionPerformed 
                
                if (escape_room.equals("lobby"))// is the escape_room variable equal to the value "lobby"
                {
                    userInput.setVisible(true);// set the userInput (JTextField) to be visible
                    firstLabel.setBounds(20,20,600,200);//setting the size of the firstLabel manually
                    firstLabel.setText(WelcomeMessage);//set the current text for the firslabel to be the WelcomeMessage, basically dsiplays it
                    escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                    escape_room = "room1";// set the value of the escape_room to be room1
                    count = 0;// set count to 0
                    secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
                    userInput.setText(null);// clear userInput, the JTextField
                }

                else if (escape_room.equals("room1")) // is the escape_room variable equal to the value "room1"
                {
                    
                    if (count == 0) // is count equal to 0
                        usersName = userInput.getText();//gets and stores the users name for the userInput
                    
                    firstLabel.setText("<html>Welcome to Room 1 " + usersName + "!<br/><br/>When was Canada founded (please type the year as answer)?<br/><br/>" + Room1_Questions);//set the current text for the firslabel to be this, basically dsiplay it
                    
                        if (count <= 3 && userInput.getText().equals("1867")) // is count less than or equal to 3 AND is the userInput equal to 1867
                        {
                            escape_room = "room2";// set the value of escape_room to be "room2"
                            firstLabel.setText("<html>Hey you got it, well done " + usersName + ", congratulations, you got the right answer.<br/>Now you can move onto the next room.<br/><br/>Welcome to Room 2 " + usersName + "!<br/><br/>How many Oscars has Leonardo DiCaprio won (please type number of Oscars as answer)?<br/><br/>" + Room2_Questions);//set the current text for the firslabel to be this, basically dsiplay it and also call a few variables that will also display stuff
                            secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
                            escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                            count = 0;// set count to 0
                        }

                        else if (count < 2 && count > 0 )// is count less than 2 AND is count greater than 0
                        {
                            secondLabel.setBounds(20,270,400,50);//setting the size of the secondLabel manually
                            secondLabel.setVisible(true);// set the secondLabel to be visible
                            secondLabel.setText("<html>HINT: The same year Thomas Edison was fired from Western Union.</html>");//set the current text for the secondlabel to be this, basically the hint for room1
                            escape_room_panel.add(secondLabel);// add the secondLabel to the escape_room_panel
                            escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                        }

                        else if (count > 2) // is count greater than 2
                            game_over();// call game_over method
                        
                            if (count <=2) // is count less than or equal to 2
                                userInput.setText(null);// clear userInput, the JTextField
                               
                            count++;// increase count by 1
                }

                else if (escape_room.equals("room2"))// is the escape_room variable equal to the value "room2"
                {
                    
                    if (count <= 3 && userInput.getText().equals("1")) // is count less than or equal to 3 AND is the userInput equal to "1"
                    {
                        escape_room = "room3";// set the value of escape_room to be "room3"
                        firstLabel.setText("<html>Hey you got it, well done " + usersName + ", congratulations, you got the right answer.<br/>Now you can move onto the next room.<br/><br/>Welcome to Room 3 " + usersName + "!<br/><br/>What is the SUM of 11+12 (please type the sum as answer)?<br/><br/>" + Room3_Questions);//set the current text for the firslabel to be this, basically dsiplay it and also call a few variables that will also display stuff
                        secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
                        escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                        count = 0;// set the count to 0
                    }

                    else if (count < 2 && count > 0 )// is count less than 2 AND greater than 0
                    {
                        secondLabel.setBounds(20,270,400,50);//set the size of the secondLabel manually
                        secondLabel.setVisible(true);// set the secondLabel to be visible
                        secondLabel.setText("<html>HINT: Leonardo DiCaprio has won the same amount of Oscars as Jennifer Lawrence.</html>");//set the current text for the secondlabel to be this, basically dsiplay the hint for room2
                        escape_room_panel.add(secondLabel);// add the secondLabel to the escape_room_panel
                        escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                    }

                    else if (count > 2) // is count less than 2
                        game_over();// call the game_over method

                        if (count <=2) // is count less than or equal to 2
                            userInput.setText(null);// clear userInput, the JTextField
                           
                        count++;// increase count by 1
                }

                else if (escape_room.equals("room3"))// is the escape_room variable equal to the value "room3"
                {
                    
                    if (count <= 3 && userInput.getText().equals("23")) // is count less than or equal to 3 AND is userInput equal to "23"
                    {
                        escape_room = "final_lobby";// set the value of escape_room variable to be "final_lobby"
                        firstLabel.setBounds(20,20,400,200);//set the size of the firstLabel manually
                        firstLabel.setText("<html>" + usersName + ", congratulations, you got the right answer.<br/><br/>Now it is time to go back to the lobby and open up the lock!!!<br/><br/>Welcome back to lobby " + usersName + "!<br/>You are one step away from escaping this Mysterious and Adventurous Escape Room<br/>Now it is time to put the numbers you have collected from the three rooms to use.<br/>Room 1: 1867, Room 2: 1, Room 3: 23<br/><br/>Please enter the three digit code:<br/><html>");//set the current text for the firslabel to be this, basically dsiplay it and also call a few variables that will also display stuff
                        secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
                        escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                        count = 0;// set count to 0
                    }
                    
                        else if (count < 2 && count > 0 )// is count less than 2 AND is count greater than 0
                        {
                            secondLabel.setBounds(20,270,400,50);//set the size of the secondLabel manually
                            secondLabel.setVisible(true);// set the secondLabel to be visible
                            secondLabel.setText("<html>HINT: Seriously?! Just use a calculator.</html>");//set the current text for the secondlabel to be this, basically dsiplay the hint for room3
                            escape_room_panel.add(secondLabel);// add the secondLabel to the escape_room_panel
                            escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                        }

                        else if (count > 2) // is count greater than 2
                            game_over();// call the game_over method

                            if (count <=2)// is count less than or equal to 2 
                                userInput.setText(null);
                               
                            count++;// increase count by 1
                }
                else if (escape_room.equals("final_lobby"))// is the escape_room variable equal to the value "final_lobby"
                {
                    
                    if (count <= 3 && userInput.getText().equals("715")) // is count less than or equal to 3 AND is userInput equal to "715"
                    {
                        escape_room = "lobby";
                        firstLabel.setText("<html>" + usersName + ", congratulations, you cracked the code!<br/><br/>You've escaped!!!!<br/><br/>Please Click OK! to play again!<html>");//set the current text for the firslabel to let the user know they won the game/escaped, basically dsiplay it and also call a few variables that will also display stuff
                        secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
                        userInput.setVisible(false);// set the userInput (JTextField) to not be visible 
                        escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                        count = 0;// set count to 0
                    }

                    else if (count < 2 && count > 0 )// is count less than 2 AND is count greater than 0
                    {
                        secondLabel.setBounds(20,270,500,80);//set the size of the secondLabel manually
                        secondLabel.setVisible(true);// set the secondLabel to be visible
                        secondLabel.setText("<html>HINT for the first digit: 1867-WHEN.length.<br/>HINT for the second digit: 1-Vous n’avez besoin d’aucun indice ici<br/>HINT for the third digit: 23-SUM</html>");//set the current text for the secondlabel to be this, basically dsiplay the three hints
                        escape_room_panel.add(secondLabel);// add the secondLabel to the escape_room_panel
                        escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
                    }

                    else if (count > 2) // is count greater than 2
                        game_over();// call the game_over method
                    
                        if (count <=2) // is count less than or equal to 2
                            userInput.setText(null);// clear userInput, the JTextField
                           
                        count++;// increase count by 1
                }
            }// end of actionPerformed 
        });// end of actionListener
}// end of All_The_Rooms method

public void game_over()// game_over method
{// start of game_over method
    userInput.setText(usersName);// set the userInput, JTextField to usersName
    userInput.setVisible(false);// set the userInput (JTextField) to not be visible
    firstLabel.setBounds(200,100,200,100);//set the size of the firstLabel manually
    firstLabel.setVisible(true);// set the firstLabel to be visible
    firstLabel.setText("<html>GAME OVER!!!<br/>Do you want to play again?<br/>If yes, click OK! button.</html>");//set the current text for the firslabel to let the user know the game is over and ask them if they want to play again, basically dsiplay it 
    escape_room_panel.add(firstLabel);// add the firstLabel to the escape_room_panel
    secondLabel.setText(null);//clear the secondLabel which is where hints are displayed
    escape_room_panel.updateUI();// reset the UI property with a value of all the current components added
    escape_room = "lobby";// set the value of the variable escape_room to be lobby
}// end of game_over method
}// end of class

class Escape_Room_GUI_Tester
{// start of tester class
    public static void main(String[] args)// magic line
    {
        Escape_Room_GUI ERG = new Escape_Room_GUI();// create the Escape_Room_GUI variable
        ERG.Escape_Room_GUI();// call the Escape_Room_GUI method
    }
}// end of tester class