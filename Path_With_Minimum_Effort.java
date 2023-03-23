public class Path_With_Minimum_Effort {

    public static void main(String args[]){

        int arr[][]={ { 31, 100, 65, 12, 18 },
                      { 10, 13, 47, 157, 6 },
                      { 100, 113, 174, 11, 33 },
                      { 88, 124, 41, 20, 140 },
                      { 99, 32, 111, 41, 20 } };

        int cellValue = arr[0][0];
        int lastValue = arr[arr.length-1][arr[0].length-1];
        int cost=cellValue;

        int i=0;
        int j=0;
       while(i<arr.length && j<arr[0].length){
                //right 
                if(j+1<arr[0].length && cellValue>arr[i][j+1]){
                    j++;

                }
                 //left 
                 if(j-1>=0 && cellValue>arr[i][j-1]){
                    j--;
                   
                }
                  //up 
                  if(i-1>=0 && cellValue>arr[i-1][j]){
                    i--;

                }
                   //down
                   if(i+1<arr.length && cellValue>arr[i+1][j]){
                    i++;
                   }
                cellValue=arr[i][j];
                cost+=cellValue;
            }
            System.out.println(cost);
            
        
    }
    
}
