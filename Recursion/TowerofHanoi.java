
public class TowerofHanoi {

    public static void towerofhanoi(int n , String src , String helper , String dest){
        if(n==1){                                                                       //Base case
            System.out.println("Transfer the  disk : " +n + " from "+ src+ " to " +dest);
            return;
        }

        towerofhanoi( n-1 , src ,  dest ,helper);  //function call for transfering n-1 disk from source to helper by using destination as helper 
        
        System.out.println("Transfer disk : " +n + " from "+ src+ " to " +dest);
        
        towerofhanoi( n-1 , helper  ,  src ,dest);//function call for transfering n-1 disk from helper  to destination by using source as helper 
    }
    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, "S", "H", "D");
    }
}
