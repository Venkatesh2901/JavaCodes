 import java.util.*;

 class QuickSort{

    public static int Partition(int arr[] ,int low ,int high) {     
           int pivot =arr[high];
           int i = low-1;                                         //i =-1   

           for(int j = low ; j<high ; j++){
            if(arr[j] <pivot){
                i++;                                              //i =0 to n
             
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

             }
           }

           //swap with pivot
           i++;                                     
           int temp=arr[i];
           arr[i]=arr[high];
           arr[high]=temp;
           return i;                                             //return index  
    }



    public static void Quicksort(int arr[] ,int low , int high){
       if(low< high){
          int pi=Partition(arr, low, high);                      //pi=pivot index

          Quicksort(arr, low, pi-1);
          Quicksort(arr, pi+1, high);
       }
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[]=new int[6];
        int n =arr.length;

        System.out.println(" Enter 6 values in array : ");
        for(int i = 0 ; i <n ; i++){
            arr[i]=sc.nextInt();
        }

        Quicksort(arr, 0, n-1);

        //print the elements
        System.out.println(" Sorting  in Ascending order : ");
        for(int i =0 ; i <n ;i++){
            System.out.print( " " + arr[i]);
        }
    }
}
