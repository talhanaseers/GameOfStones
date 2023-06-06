import java.util.Scanner;

/********************
*ProjectFour.java
* 
*Talha Naseer
*
*
*
*This Program designs a game called the 'The Game Of Stones'. This is two player game. One of the players is the computer and 
* one is the human interacting with the program. The program takes user input for the number of stones (1, 2, or 3 stones) and
* asks user how many stones he'd like to remove. The person and computer alternatively remove stones. Who ever removes the last 
* stone loses. 
*********************/

public class ProjectFour
{
    public static void main (String [] args)
    {
        System.out.println("Welcome to the Game of Stones!\n" +
                           "In this game, you and the computer will alternate removing either\n" +
                           "1, 2 or 3 stones from a group of stones until there are no stones\n" +
                           "left. The player who removes the last stone loses the game.\n");//Displays welcome message to the screen.

        
        System.out.print("Enter the number of starting stones: ");//Asks user to enter the number of stones. 

        int numStartingStones;

        Scanner firstQuestion = new Scanner(System.in);

        int firstAnswer = firstQuestion.nextInt();

        numStartingStones = firstAnswer;


                while (numStartingStones < 0)
                {
                    System.out.println("Invalid input - must enter a positive number.");//Displays error message if user entered number is less than 0.

                    System.out.print("Enter the number of starting stones: ");//Asks user again to enter the number of stones. 
                    int firstAnswerIf = firstQuestion.nextInt();
                    numStartingStones = firstAnswerIf;
                }//end while

        
        System.out.print("\nDo you want to go first? ");//Asks user if the user wants to go first

        Scanner secondQuestion = new Scanner(System.in);

        String secondAnswer = secondQuestion.nextLine();

        String doUWantToGoFirst = secondAnswer;
           

                while(!doUWantToGoFirst.equals("y") && !doUWantToGoFirst.equals("n"))
                {
                    
                    System.out.println("\nInvalid input - must enter y or n.");//Displays error message if user entered number is less than 0.

                    System.out.print("\nDo you want to go first? ");//Asks user again to enter the number of stones. 
                    String secondAnswerWhile = secondQuestion.nextLine();
                    doUWantToGoFirst = secondAnswerWhile;
                    
                }//end while

        int numStonesRemovedByU = 0;

        int numRemainingStones = 0;

        int randomComputerNum = 1 + (int)(Math.random() * ((3 - 1) + 1));

        Scanner thirdQuestion = new Scanner(System.in);
               

                if(doUWantToGoFirst.equals("y"))//runs if the user wants to go first
                {
                    System.out.print("\nHow many Stones do you want to remove? ");//Asks user the number of stones the user wants to remove.
                    
                    
                    
                    int thirdAnswer = thirdQuestion.nextInt();
                    numStonesRemovedByU = thirdAnswer;

                            if(numStonesRemovedByU > 3 || numStonesRemovedByU < 1)
                            {
                                
                                    while(numStonesRemovedByU > 3 || numStonesRemovedByU < 1)
                                    {
                                        System.out.print("\nThe number you enter must be either 1, 2, or 3. \n" + "\nHow many Stones do you want to remove? ");//Displays error message if user entered number is NOT 1, 2, or 3. Asks user to re-enter the number of stones to remove. 
                                        int thirdAnswerWhile = thirdQuestion.nextInt();
                                        numStonesRemovedByU = thirdAnswerWhile;
                                    }//end while
                            }//end if 
                        
                    numRemainingStones = numStartingStones - numStonesRemovedByU;

                    randomComputerNum = 1 + (int)(Math.random() * ((3 - 1) + 1));

                            if(numRemainingStones < 1)
                            {
                                System.out.println("Sorry, you lose.");//Displays message to screen if number of stones is less than 0.
                            }//end if
                            else
                            {
                                System.out.println("Number of stones left: " + numRemainingStones);//Displays number of remaining stones. 
                            
                                System.out.println("\nComputer removes " + randomComputerNum);//Displays the number of stones the computer removes. 
                
                                numRemainingStones = numRemainingStones - randomComputerNum;

                                    if(numRemainingStones < 1)
                                    {
                                        System.out.println("Computer loses. ");//Displays message to screen if number of remaining stones is less than 0. 
                                    }//end if
                                    else
                                    {
                                        System.out.println("Number of stones left: " + numRemainingStones);//Displays number of remaining stones. 
                                    }//end else     
                            }//end else
                        

                            if(numRemainingStones > 0)
                            {
                                    while(numRemainingStones > 0)
                                    {
                                        System.out.print("\nHow many Stones do you want to remove? ");//Asks user the number of stones the user wants to remove. 

                                        int thirdAnswerWhile2 = thirdQuestion.nextInt();
                                        
                                        numStonesRemovedByU = thirdAnswerWhile2;

                                                while(numStonesRemovedByU > 3 || numStonesRemovedByU < 1)
                                                {
                                                    System.out.print("\nThe number you enter must be either 1, 2, or 3. \n" + "\nHow many Stones do you want to remove? ");//Displays error message if user entered number is NOT 1, 2, or 3. Asks user to re-enter the number of stones to remove. 
                                                    int thirdAnswerWhile3 = thirdQuestion.nextInt();
                                                    numStonesRemovedByU = thirdAnswerWhile3;
                                                }//end while

                                        numRemainingStones = numRemainingStones - numStonesRemovedByU;

                                                if(numRemainingStones < 1)
                                                {
                                                    System.out.println("\nSorry, you lose.");//Displays message to the screen if number of remaining stones is less than 0.
                                                }//end if
                                                else
                                                {
                                                    System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 


                                                    randomComputerNum = 1 + (int)(Math.random() * ((3 - 1) + 1));

                                                    System.out.println("\nComputer removes " + randomComputerNum);//Displays the number of stones the computer removes. 

                                                    numRemainingStones = numRemainingStones - randomComputerNum;

                                                        if(numRemainingStones < 1)
                                                        {
                                                            System.out.println("Computer loses.");//Displays message to the screen if number of remaining stones is less than 0.
                                                        }//end if
                                                        else
                                                        {
                                                            System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 
                                                        }//end else 
                                                }//end else
                                        
                                    }//end while
                            }//end if
                }//end if
                else if(doUWantToGoFirst.equals("n"))//Runs if the user does not want to go first
                {
                    System.out.print("\nComputer removes: ");//Displays the number of stones the computer removes. 

                    System.out.println(randomComputerNum);

                    numRemainingStones = numStartingStones - randomComputerNum;

                            if(numRemainingStones < 1)
                            {
                                System.out.println("Computer loses.");//Displays message to the screen if number of remaining stones is less than 0.
                            }//end if
                            else
                            {
                                System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 

                                System.out.print("\nHow many stones do you want to remove? ");//Asks user the number of stones the user wants to remove. 
                                numStonesRemovedByU =  thirdQuestion.nextInt();

                                        while(numStonesRemovedByU > 3 || numStonesRemovedByU < 1)
                                        {
                                            System.out.print("\nThe number you enter must be either 1, 2, or 3. \n" + "\nHow many Stones do you want to remove? ");//Displays error message if user entered number is NOT 1, 2, or 3. Asks user to re-enter the number of stones to remove. 
                                            int thirdAnswerWhile4 = thirdQuestion.nextInt();
                                            numStonesRemovedByU = thirdAnswerWhile4;
                                        }//end while

                                numRemainingStones = numRemainingStones - numStonesRemovedByU;
                                
                                        if(numRemainingStones < 1)
                                        {
                                            System.out.println("Sorry, you lose.");//Displays message to the screen if number of remaining stones is less than 0.
                                        }//end if 
                                        else
                                        {
                                            System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 

                                        }//end else
                            }//end else

                            if(numRemainingStones > 0)
                            {
                                while(numRemainingStones > 0)
                                {
                                    randomComputerNum = 1 + (int)(Math.random() * ((3 - 1) + 1));

                                    System.out.println("\nComputer removes " + randomComputerNum);//Displays the number of stones the computer removes. 

                                    numRemainingStones = numRemainingStones - randomComputerNum;

                                            if(numRemainingStones < 1)
                                            {
                                                System.out.println("Computer loses.");//Displays message to the screen if number of remaining stones is less than 0.
                                            }// end if
                                            else
                                            {
                                                System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 

                                                System.out.print("\nHow many stones do you want to remove? ");//Asks user the number of stones the user wants to remove. 

                                                int thirdAnswer5 = thirdQuestion.nextInt();
                                                numStonesRemovedByU = thirdAnswer5;

                                                        while(numStonesRemovedByU > 3 || numStonesRemovedByU < 1)
                                                        {
                                                            System.out.print("\nThe number you enter must be either 1, 2, or 3. \n" + "\nHow many Stones do you want to remove? ");//Displays error message if user entered number is NOT 1, 2, or 3. Asks user to re-enter the number of stones to remove. 
                                                            int thirdAnswerWhile5 = thirdQuestion.nextInt();
                                                            numStonesRemovedByU = thirdAnswerWhile5;
                                                        }//end while

                                                

                                                numRemainingStones = numRemainingStones - numStonesRemovedByU;

                                                        if(numRemainingStones < 1)
                                                        {
                                                            System.out.println("Sorry, you lose.");//Displays message to the screen if number of remaining stones is less than 0.
                                                        }//end if 
                                                        else
                                                        {
                                                            System.out.println("Number of stones left: " + numRemainingStones);//Displays the number of remaining stones. 
                                                        }//end else
                                            }//end else
                                }//end while
                            }//end if
                }//end else if   
    }// end main
}// end ProjectFour class
