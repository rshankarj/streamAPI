package com.app;



public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] strArray ={"practice","temp","coding","perfect"};
		
		String word1="practice";
		String word2="coding";
											
		
		int  distance =Integer.MAX_VALUE; ;
		for(int x = 0; x < strArray.length; x++){
		    if(strArray[x].equals(word1)){
		        for(int y = x; y < strArray.length; y++){
		            if(strArray[y].equals(word2))
		                if(distance > (y - x))
		                	distance = y - x;
		        }
		        for(int y = x; y >=0; y--){
		            if(strArray[y].equals(word2))
		                if(distance > (x - y))
		                	distance = x - y;
		        }
		    }
		}
		System.out.print(distance);
	}
	
	

}

