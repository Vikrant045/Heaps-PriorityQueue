
import java.util.*;
public class Find_K_weakest_Soldier  {
    static class Row implements Comparable <Row>{
        int Soldier;
        int idx;
        public Row(int Soldier,int idx){
            this.Soldier=Soldier;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if (this.Soldier==r2.Soldier){
                return this.idx-r2.idx;
            }
            else{
                return this.Soldier -r2.Soldier;
            }
        }
    }
    public static void main(String args[]){
        int army[][] ={{1,0,0,0},{1,1,1,0},{1,0,0,0},{1,0,0,0}};
        int k=2;
PriorityQueue<Row>pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count =0;
            for(int j=0;j<army[0].length;j++){
                if(army[i][j]==1){
                    count++;
                }
            }
            pq.add(new Row(count,i));

        }
        for(int i=0;i<k;i++){
            System.out.println("Soldier "+pq.remove().idx);
        }


    }
    
}
