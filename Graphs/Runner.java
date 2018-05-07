package com.Runner.test;

import java.util.LinkedList;

import com.DataStructure.GraphImpl;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphImpl graphImpl = new GraphImpl(5);
		graphImpl.Insertvertex(0, 1);
		graphImpl.Insertvertex(0, 4);
		graphImpl.Insertvertex(1, 2);
		graphImpl.Insertvertex(1, 3);
		graphImpl.Insertvertex(1, 4);
		graphImpl.Insertvertex(2, 3);
		graphImpl.Insertvertex(3, 4);

		LinkedList<Integer> arr[]	=	graphImpl.getAdjlist();
        
		for (int i =0 ; i <arr.length;i++){
			System.out.println("Adjacency list of vertex " + i);
			System.out.print("Head ");
			for (int y =0;y<arr[i].size();y++){
				System.out.print(" -> " +arr[i].get(y));
			}
			System.out.println();
			
			
		}

	}

}
