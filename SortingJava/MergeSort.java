import java.util.*;

class MergeSort {
   
    public static void Conquer(int arr[] , int si , int mid ,int ei){
        int merged[]= new int[ei-si+1];                              // new array
         
        int idx1=si;                                         
        int idx2=mid+1;
         int x=0;                                                      //index in new array
        
         while(idx1<=mid  && idx2<=ei){
            if( arr[idx1] <= arr[idx2]){                                // comparsion b/w 1st and 2nd array after divide
                merged[x++]= arr [idx1++]; 
            } 
            else{
                merged[x++] =arr[idx2++];
            }
         }
                        
         while(idx1<=mid){                                            //if after comp 2nd matrix empty but 1st matrix contain element
            merged[x++]=arr[idx1++];           
         }

         while(idx1<=mid){                                            //if after comp 1st matrix empty but 2nd  matrix contain element
            merged[x++]=arr[idx2++];                              
             
         }                                                           
           /* merged[x] =arr[idx1];
             x++ , idx1++; */


        for(int i =0 , j= si ; i<=merged.length ; i++ ,j++){
            arr[j] = merged[i];
        }
    }

   

    public static void Divide(int arr[] , int si , int ei){
        if(si>=ei){
            return ;
        }

        int mid =si +(ei-si)/2;   // (ei+si)/2

        Divide( arr , si , mid);
        Divide( arr , mid+1 , ei);
       
        Conquer(arr,  si ,  mid , ei);

    }

    

    public static void main(String[] args) {
        int arr[] = { 6 ,3, 9 ,5 , 2, 8};
        int n = arr.length;
      /* Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println(" Enter the  6 value in array");
        for(int i=0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
 */

        Divide(arr ,0, n-1);

        //print
        System.out.println(" sorting : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
