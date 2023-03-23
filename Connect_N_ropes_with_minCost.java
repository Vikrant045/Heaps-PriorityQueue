import java.util.*;
public class Connect_N_ropes_with_minCost {

    public static void main(String args[]){
        int arr[]={2,3,3,4,6};
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        while(pq.size()>1){
              int minSum= pq.remove()+pq.remove();
              cost+=minSum;
              pq.add(minSum);
        }
        System.out.println(cost);
    }
    
}
