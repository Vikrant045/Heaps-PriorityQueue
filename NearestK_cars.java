
import java.util.*;
public class NearestK_cars {
static class Point implements Comparable<Point> {
    int x,y,ptsSq,idx;
    public Point(int x,int y,int ptsSq,int idx){
        this.x=x;
        this.y=y;
        this.ptsSq=ptsSq;
        this.idx=idx;
    }
    @Override
    public  int compareTo(Point p){
        return this.ptsSq-p.ptsSq;
    }

}
    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq= new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int dist = (pts[i][0]*pts[i][0])+(pts[i][1]*pts[i][1]);
         pq.add(new Point(pts[i][0],pts[i][1],dist,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("Car "+pq.remove().idx);
        }


    }
    
}
