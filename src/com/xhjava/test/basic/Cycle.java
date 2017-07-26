package com.xhjava.test.basic;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			      int [] numbers = {34, 534, 53, 405, 50};
			      int tmp;
			      for(int i = 0; i < 5; i++)
			      {
			    	  for(int j = 0;j < 4-i; j++)
			    	  {
			    		  if(numbers[j] > numbers[j+1])
			    		  {
			    			  tmp = numbers[j];
			    			  numbers[j] = numbers[j+1];
			    			  numbers[j+1] = tmp;
			    		  }
			    	  }
			      }
			      
			      for(int x : numbers ){
			         System.out.print( x );
			         System.out.print(",");
			      }
			      System.out.print("\n");
			      String [] names ={"James", "Larry", "Tom", "Lucy"};
			      for( String name : names ) {
			         System.out.print( name );
			         System.out.print(",");
			      }
	}

	}
