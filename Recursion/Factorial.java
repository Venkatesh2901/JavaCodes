import java.util.*;

 class Factorial {
    public static int  CalFactorial( int n ){
          if(n==1 || n==0){
            return 1;
          }

         int fact_n1 = CalFactorial(n-1);
         int fact_n2 = n * fact_n1;                 //5! = 5 *4!         
         return fact_n2;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println(" Enter the value of number : ");
         int n = sc.nextInt();

        int ans = CalFactorial(n);

         System.out.println( "Factorial of " + n + " is : "  + ans );
    }
}
