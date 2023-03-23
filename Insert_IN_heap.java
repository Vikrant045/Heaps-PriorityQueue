import java.util.*;
public class Insert_IN_heap {

    static class Heap{
ArrayList<Integer> arr  = new ArrayList<>(); // we create heap using ArrayList

public void add(int data){    // add element in heap 
    // add at last
    arr.add(data);
    int x = arr.size()-1;  // index of child
    int par = (x-1)/2;    // index of parent
    while(arr.get(par)>arr.get(x)){
        int temp = arr.get(x);
        arr.set(x,arr.get(par));
        arr.set(par,temp );

        x = par;
        par = (x-1)/2;
    }
}

public int peek(){
    return arr.get(0);
}
private void heapify(int i){
    int left = 2*i+1;
    int right = 2*i+2;
    int minIdx =i;

    if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
        minIdx = left;
    }
    if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
        minIdx = right;
    }
    if(minIdx != i){
        int temp = arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);
        heapify(minIdx);
    }
}
public int remove(){
    int data = arr.get(0);
// step 1 swap first and last
int temp = arr.get(0);
arr.set(0, arr.get(arr.size()-1));
arr.set(arr.size()-1, temp);

// step 2 delete last element in Al of Heap
arr.remove(arr.size()-1);

// heapify
heapify(0);
return data;

}

public boolean isEmpty(){
    return arr.size()==0;
}
    }
    public static void main(String args[]){

        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(6);
        pq.add(8);
while(!pq.isEmpty()){
System.out.println(pq.peek());
pq.remove();
}

    }
    
}
