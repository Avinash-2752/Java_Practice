import java.util.Scanner;
public class DWA_Comp{
    public static void main(String []args){
        int c = 1;
        int d = c++;
        System.out.println(d);
        System.out.println(++c);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a value");
        

        int a = sc.nextInt();

        System.out.println("ENter a value");
        

        int b = sc.nextInt();
        if(a>b){
            System.out.println(" A IS greatest");
        }
        else if (a<b) {
            System.out.println("B IS greatest");
        }
        else{
            System.out.println("Both are equal");   
            
        }

    }
}