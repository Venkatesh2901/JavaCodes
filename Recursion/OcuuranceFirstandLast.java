import java.util.*;
class OcuuranceFirstandLast {
    public static int first =-1;         
    public static int last =-1;

    public static void FindOccurance(String str , int idx , char element){
        if(str.length()-1 ==0){
            System.out.println(" First Occurances : " + first);
            System.out.println(" Last Occurances : " + last);
            return ;
        }
    
        char CurrChar=str.charAt(idx);

        if(CurrChar==element){
              if(first==-1){
                first =idx;
              }
              else{
                last=idx;
              }
        }
      FindOccurance(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str="abaacdabcae";
        FindOccurance(str, 0 , 'a');
    }
}
