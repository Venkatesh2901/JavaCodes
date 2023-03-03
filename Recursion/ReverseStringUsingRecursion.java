
import java.util.*;

public class ReverseStringUsingRecursion {
    
    public static void PrintRev( String str , int idx){
        
        if(idx>=0){                              //base case 
        System.out.print(str.charAt(idx) + " ");

         PrintRev(str, idx-1); 
        }
    }
    public static void main(String[] args) {
        
        String str1="abc";

        System.out.print(" Reverse of string :  ");
        int lastindex =str1.length()-1;          // index = 2 in this case
        PrintRev(str1,lastindex);                //starts with last element of string
    }

}

