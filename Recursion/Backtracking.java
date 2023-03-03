
//Total permuation 

import java.util.*;
public class Backtracking {
    public static void PrintPermutation(String str , int idx , String perm ){            //perm is new string , initial empty 
        if(str.length()==0){
            System.out.println( "Value : " +perm);
            return;
        }

        for(int i=0 ; i<str.length(); i++){
            char CurrChar=str.charAt(i);
            String newstr=str.substring(0, i) + str.substring(i+1);

            // System.out.println( " here value of perm : " +perm);
            // System.out.println( " here value of newstr : " +newstr);
           //  System.out.println();

           PrintPermutation( newstr , idx+1,  perm+CurrChar);
           
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str , 0 , " ");
    }
}
