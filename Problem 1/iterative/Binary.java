
package Binary;

import java.util.Random;
import java.util.Scanner;
public class Binary {

       public static int BS(int ARR[] , int LIF , int RIG , int MID ,int TAR) {  //binary search
         if(LIF>RIG){
        System.out.println("the target not found " );
        return 0 ;
        }
        int MIDV = 0 ;
        MID = (int) Math.floor( (LIF+RIG)/2 ) ;
        MIDV = ARR[MID]; 
        if (MIDV==TAR){
        System.out.println("the target found in place :"+  (MID+1) );
        }
        else{
         if(MIDV>TAR){
            int x = MID - 1;
        BS(ARR,LIF,x,MID,TAR);
        }
        else{
       int y = MID + 1;
       BS(ARR,y,RIG,MID,TAR);
        }  
        }  
        return 0 ;
      }

    public static void main(String[] args) {
                 long start1 = System.currentTimeMillis();
              
  
        Scanner ENT = new Scanner(System.in);  // ARR ----> array
        int ARR [] = new int []{1,3,5,9,12,18,22,24,27,29,31,39,40,55,78,79,82,89,95,112} ;
        System.out.println("what is the number that you want to search for ??");
        int TAR = ENT.nextInt();               // TAR ----> target
        int MID = 0 , LIF ,RIG , MIDV = 0 ,k = 0 ;                   // MID ----> middle
        LIF = 0 ;                         // LEF ----> left
        RIG = 19 ;                        // RIG ----> right
        BS(ARR,LIF,RIG,MID,TAR);
        
        long end1 = System.currentTimeMillis();   
      System.out.println("Time Taken : "+ ((end1-start1))+" Mili seconds");


    }
    
}
