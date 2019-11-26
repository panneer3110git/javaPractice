package org.panneer.com.hackerrank;




	public class Solution {
		public static void main(String[] args) {
			int[] arr = {-1,1,2,0,-2};

		    // Complete the compareTriplets function below.
		    double positiveNumber=0;
		    double negativeNumber=0;
		    double zeroNumber=0;
	       double positiveFraction;
	       double negativeFraction;
	       double zeroFraction;
	       int sizeOfArray=arr.length;

	   for(int individualNumbers:arr){
	       
	       if(individualNumbers==0){
	           zeroNumber++;
	       }else if(individualNumbers<0){
	           negativeNumber++;
	       }else if(individualNumbers>0){
	           positiveNumber++;
	       }

	   }
	    positiveFraction=positiveNumber/sizeOfArray;
	       negativeFraction=negativeNumber/sizeOfArray;
	       zeroFraction=zeroNumber/sizeOfArray;

	       System.out.format("%6f", positiveFraction);
	       System.out.println();
	       System.out.format("%6f", negativeFraction);
	       System.out.println();
	       System.out.format("%6f", zeroFraction);
	       System.out.println();
			
		}
		
		
       
	    
	    }
	


