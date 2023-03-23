import java.util.*;
public class PQ_of_Objects{

    static class Student implements Comparable<Student> {
        int roll_no;
        String name;
        private int rank;

        public Student(int rank,String name){
            this.rank = rank;
            this.name = name;
        }

        @Override
         public int compareTo(Student s2)
         {
       return this.rank - s2.rank;
    }
       
    }
   
    public static void main(String args[]){
        PriorityQueue <Student> pq = new PriorityQueue<>();
        pq.add(new Student(15, "aam"));
                pq.add(new Student(150, "ram"));
             pq.add(new Student(5, "sam"));
                    pq.add(new Student(1, "eam"));
while(!pq.isEmpty()){
    System.out.println(pq.peek().name + pq.peek().rank);
    pq.remove();
}
    }
}