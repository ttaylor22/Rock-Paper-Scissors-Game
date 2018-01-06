
import java.util.Random;
import java.util.Scanner;
 /*
 * @author Tevin
 *Program 3: Rock,Paper,Scissors
 *Date: Octuber 31, 2014
 *Name: Tevin Taylor
 */
public class RockPaperScissors {
    public static void main(String [] args){
        System.out.print("Welcome to a Game of Rock-Paper-Scissors.");
       game(0,0,0,1);
    }
       public static void game(int wins,int losses,int ties,int played){
        Scanner in=new Scanner(System.in);
        int computerMove;
        Random random=new Random();
        computerMove=random.nextInt(3);
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        System.out.print("\n(0) Rock"+"\n(1) Paper"+"\n(2) Scissors"+"\nChoose a move (0-2): ");
        int chose=in.nextInt();
        System.out.println("\nYou chose: "+chose+"\nThe computer chose: "+computerMove);
        if((computerMove==ROCK&&chose==SCISSORS)||(computerMove==PAPER&&chose==ROCK)||(computerMove==SCISSORS&&chose==PAPER)){
            System.out.println("Computer won.");
            losses++;
        }
        else if((chose==ROCK&&computerMove==SCISSORS)||(chose==PAPER&&computerMove==ROCK)||(chose==SCISSORS&&computerMove==PAPER)){
            System.out.println("You won.");
            wins++;
        }            
        else if(computerMove==chose){
            System.out.println("It's a tie.");
            ties++;
        }
        System.out.println("\nDo you want to play again?"+"\n(1) Yes"+"\n(2) No");
        System.out.print("Your choice (1-2): ");
        int count=in.nextInt();
        if(count==1){
            played++;
            game(wins,losses,ties,played);}
        else if(count==2){
            double per=100*((wins+((double)(ties)/2))/played);
            System.out.println("\nThanks for playing.");
            System.out.println("\nGame Statistics:");
            System.out.print("+"); dashes(50); System.out.print("+");
            System.out.println("\n| WINS |LOSSES| TIES | GAMES PLAYED |PERCENTAGE WON|");
            System.out.print("|"); dashes(6);System.out.print("+");dashes(6);System.out.print("+");dashes(6);System.out.print("+");dashes(14);System.out.print("+");dashes(14); System.out.print("|");
            System.out.println("\n|   "+wins+"  |  "+losses+"   |  "+ties+"   |      "+played+"       |     "+String.format("%.2f",per)+"%   |");
            System.out.print("+"); dashes(50);System.out.println("+");
            System.exit(2);}
        
       }
       
        public static void dashes(int count){
            if(count>0){
                System.out.print("-");
                count--;
                dashes(count);
            }
        }

    
    }

            
            
