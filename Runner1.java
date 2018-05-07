package com.Runner.test;

import com.DataStructure.GraphImplAdjacencyMatrix;

public class Runner1 {

	public static void main(String[] args) {
      GraphImplAdjacencyMatrix  adjacencyMatrix = new GraphImplAdjacencyMatrix(5);
      adjacencyMatrix.insertnodes(0,1);
      adjacencyMatrix.insertnodes(0,4);
      adjacencyMatrix.insertnodes(1,2);
      adjacencyMatrix.insertnodes(1,3);
      adjacencyMatrix.insertnodes(1,4);
      adjacencyMatrix.insertnodes(2,3);
      adjacencyMatrix.insertnodes(3,4);
      
      int arr[][] = adjacencyMatrix.getMatrix();
      
      System.out.println(arr.length);
      for (int i =0 ; i <arr.length;i++){
    	  for (int y = 0 ; y<arr[i].length;y++){
    		  System.out.print(arr[i][y] + " ");
    	  }
    	  System.out.println();
      }


	}

}
