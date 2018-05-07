package com.DataStructure;

public class GraphImplAdjacencyMatrix {
	
	int vertex ;
	int matrix[][];

	public GraphImplAdjacencyMatrix(int vertex) {
		this.vertex = vertex;
		matrix = new int [vertex][vertex];
	}
	
	
	public void insertnodes ( int src , int dest ){
		
		this.matrix[src][dest]=1;
		this.matrix[dest][src]=1;
	}


	public int[][] getMatrix() {
		return matrix;
	}


	
	
	

}
