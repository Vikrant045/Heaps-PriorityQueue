import java.util.*;
public class Kth_largest_element_in_Stream {
    public static void main(String args[]){

        int arr[]={10,20,11,70,50,40,100,5,5,6,50,98,300};
        int k=3;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<k;i++){
pq.remove();
        }
      while(!pq.isEmpty()){
        System.out.print(" "+pq.remove());
      }

    }
    
}
