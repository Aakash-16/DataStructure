package com.DataStructure ;

import java.util.LinkedList;

// Adjacent List  implementation of a graph .
public class GraphImpl {

	int vertex;
	LinkedList<Integer> adjlist [];

	public LinkedList<Integer>[] getAdjlist() {
		return adjlist;
	}

	

	public GraphImpl(int vertex) {
		this.vertex = vertex;
		// Below  warning need to be addressed .
		adjlist = new LinkedList [vertex];
		for (int i =0 ; i <vertex ;i++){
			adjlist[i]=new LinkedList<>();
		}
	}
	
	// Adding from both side because we are assuming  that it is undirected graph.
	public void Insertvertex ( int src , int dest){
		 this.adjlist[src].add(dest);
		 this.adjlist[dest].add(src);
		 
		
	}




}
