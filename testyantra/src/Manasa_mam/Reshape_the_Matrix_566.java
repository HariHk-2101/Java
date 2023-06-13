package Manasa_mam;

import java.util.Arrays;

public class Reshape_the_Matrix_566 {

	public static void main(String[] args) {
		
		int mat[][]= {{1,2},{3,4},{1,3}};
		
	
		
		System.out.println(matrixReshape(mat,1,4));
		
		
	}
	   public static int[][] matrixReshape(int[][] mat, int r, int c) {
	        
	        int n[][]=new int[r][c];
	        
	        int k=0,l=0;
	        for(int i=0;i<mat.length;i++)
	        {
	        	
	            for(int j=0;j<mat[i].length;j++)
	            {
	            	n[r][c]=mat[i][j];
	            	System.out.println(Arrays.toString(n));
	            }
	         System.out.println();
	        }
	        
	        return n;
	    }
}
