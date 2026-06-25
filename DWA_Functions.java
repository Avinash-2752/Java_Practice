// --------------------RECURSION-----------------------
public class DWA_Functions{
    
    // public static int Pattern(int n){
    //     for(int i =1;i<=n;i++){
    //         for(int j=i;j<=n;j++){

           
    //         System.out.print("* ");
    //       }
    //       System.out.println("  ");
    //     }
    // }
// public static void main(String[] args) {
       
//       System.out.println(Pattern(5));
//     }

    //----------Sum of N natural no.s-----------

    // public static int SumOfNNaturalNumbers(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n+SumOfNNaturalNumbers(n-1) ;

    // }
    // public static void main(String[] args) {
    //    System.out.println( SumOfNNaturalNumbers(5));
    // }

   // ---------Fibanacci Series of N th term---------
    // public static int Fib(int n){
    //     if(n==1){
    //         return 0;
    //     }
    //     else if(n ==2){
    //         return 1;
    //     }
    //     return Fib(n-1)+Fib(n-2);

    // }
    // public static void main(String[] args) {
    //     int x = 6;
    //     System.out.println("Num at x position is" + Fib(x));
         
    // } 

    //-------listing out the Fib SERIES-----
    // public static int fib_list(int n){
    //     if(n<=1){
    //         return n;
    //     }
    //     return fib_list(n-1)+fib_list(n-2);

    // }
    // public static void main(String[] args) {
    //     int x = 6;
    //     for(int i =0;i<=x;i++){
    //         System.out.print(" " + fib_list(i)  );
    //     }
    // }


    //-----------Celsius to Farenhit-------------
    // public static int CelsiusToFarenhit(int n){
    //     if(n>=0){
          
    //         return  (n*9/5)+32;
    //     }
    //     return -1;
       
    // }
    // public static void  main(String [] args){
    //     int x = 0;
    //     System.out.println("The temp from C to F is:"+CelsiusToFarenhit(x));
    // }

    //----------Sum of FIRST N natural numbers-----------
    // public static int FirstNaturalNumbers(int n){
    //      int sum = 0;
    //     if (n<=0){
    //         return -1;
    //     }
    //     else{
           
    //     for(int i = 1;i<=n;i++){
    //             sum+=i;
             
                
    //         }
    //         return sum;
    //     }
    // }
   
    // public static void main(String[] args) {
    //     int x = 5;
        
    //     System.out.println("THE SUM OF n numbers is "+ FirstNaturalNumbers(x));
    // }

}