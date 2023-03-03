import java.util.*;

class FibonacciSeries {
     public static void PrintFib( int a , int b , int n){
         if(n==0){                        //base case 
            return ;                      // after complete return  to main function
         }

         int c = a+b;
         System.out.print(c + " ") ;

         PrintFib(b, c, n-1);            //Function call
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the value of number ");
        int n = sc.nextInt();

        System.out.print(" fibonacci series :  ");
        int a = 0 ; 
        int  b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        PrintFib(a, b, n-2);        //n-2 bcz we already print 2 elements inside main function

     }
}
