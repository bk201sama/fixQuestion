package org.eu.bk201sama.search.twodimensionalarray;
public class Etc {
    public static void main(String[] args) {
        int[][] input1 = {{1,2,3},{4,5}};
        int input2 = 2;
        System.out.print(stupidContains(input1,input2));
      

   }
   //复杂度 o(n^2)
   private static boolean stupidContains(int [][] input1,int input2){
       for(int i=0;i<input1.length;i++){
           for(int j = 0;j<input1[i].length;i++){
               if(input1[i][j]==input2)
               return true;

           }
       }
       return false;
   }

   //复杂度o（n）
   private static boolean contains1(int [][] input1,int input2){
       int oneDSize = input1[0].length;
       int twoDsize = input1[1].length;
       if(input2<=input1[0][oneDSize-1]&&input2>=input1[0][0]){
        for(int j = 0;j<input1[0].length;j++){
            if(input1[0][j]==input2)
            return input1[0][j]==input2;

        }
       }
       if(input2<=input1[1][twoDsize-1]&&input2>=input1[1][0]){
        for(int j = 0;j<input1[1].length;j++){
            if(input1[1][j]==input2)
            return input1[1][j]==input2;

        }
       }
       return false;
   }



}