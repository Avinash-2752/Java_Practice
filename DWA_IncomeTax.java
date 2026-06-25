import java.util.Scanner;
public class DWA_IncomeTax{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        if(income<=250000){
            System.out.println("NO TAX");
        }
        else if(income>250000 && income<=500000){
            System.out.println("TAX: 5%");
        }
        else if(income>500000 && income<=1000000){
            System.out.println("TAX: 20%");
        }
        else{
            System.out.println("TAX: 30%"); 
        }
        
    }
}