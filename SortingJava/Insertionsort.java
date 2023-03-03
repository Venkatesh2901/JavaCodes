
import java.util.*;
class Insertionsort {
    public static void printArray(int arr[]) {
        System.out.println(" Insertion sort :");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println(" Enter the 5 value in array");
        int arr[] = new int[5];
        for(int i=0 ; i<arr.length ;i++){
          arr[i]=sc.nextInt();
        }

        //Insertrion sort
        for(int i =1 ; i<arr.length; i++){    //n-1
             int current = arr[i];
            int j=i-1;

             while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
             }
             //placed
             arr[j+1] = current;
        }
      printArray(arr);
    }
}
