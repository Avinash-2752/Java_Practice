import java.util.Scanner;
public class DWA_Sites{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the site");
        String site = sc.nextLine();
        if(site.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(site.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(site.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else{
            System.out.println("This is an unknown website");
        }
    }
}
