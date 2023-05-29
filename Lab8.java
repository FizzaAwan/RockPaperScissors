import java.util.Scanner;

public class Lab8
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player 1: Choose rock, scissors, or paper: ");
        String player1 = scan.next().toLowerCase();
        System.out.print("Player 2: Choose rock, scissors, or paper: ");
        String player2 = scan.next().toLowerCase();  
        //(your code goes here…)
        if(player1.equals("rock")){
            if(player2.equals("rock")){
                System.out.print("It is a tie ");
            }
            if(player2.equals("scissors")){
                System.out.print("Player 1 wins  ");
            }
            if(player2.equals("paper")){
                System.out.print("Player 2 wins  ");
            }
        }
        if(player1.equals("scissors")){
            if(player2.equals("rock")){
                System.out.print("Play 2 wins ");
            }
            if(player2.equals("scissors")){
                System.out.print("It is a tie  ");
            }
            if(player2.equals("paper")){
                System.out.print("Player 1 wins  ");
            }
        }
        if(player1.equals("paper")){
            if(player2.equals("rock")){
                System.out.print("Player 1 wins ");
            }
            if(player2.equals("scissors")){
                System.out.print("Player 2 wins  ");
            }
            if(player2.equals("paper")){
                System.out.print("It is a tie  ");
            }
        }
    }
}