import java.util.Random;
import java.util.Scanner;
public class DWA_RockPaper{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("ENter your choice from 1-Rock,2Paper,3_Siscors");
      int player = sc.nextInt();
      System.out.println("player choice is " + player);
      int system = rand.nextInt(3)+1;
      System.out.println("System choice is " + system);
       if(player == system){
        System.out.println("MATCH IS A DRAW");
       }
       else if(player == 1 && system == 3 || player == 2 && system == 1 || player == 3 && system == 2){
        System.out.println("PLAYER WINS!!!!");
       }
       else{
        System.out.println("SYSTEM WINS!!!!");
       }
      
    }
}   