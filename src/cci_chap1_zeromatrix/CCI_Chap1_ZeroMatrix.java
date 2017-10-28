/*
    Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
    column are set to 0.
 */
package cci_chap1_zeromatrix;

import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class CCI_Chap1_ZeroMatrix 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {0, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 0, 20},
            {21, 22, 23, 24, 25}
        };
        
        zeroMatrix(matrix);
    }
    
    private static void zeroMatrix(int[][] matrix)
    {
        ArrayList<Integer> cols = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    cols.add(j);
                    rows.add(i);
                }
            }
        }
        
        //make columns 0
        if (cols.size() > 0)
        {
            cols.stream().forEach((col) -> 
            {
                for (int i=0; i<matrix[0].length; i++)
                {
                    matrix[i][col] = 0;
                }
            });
        }
        
        //make rows 0
        if (rows.size() > 0)
        {
            rows.stream().forEach((row) -> 
            {
                for (int i=0; i<matrix.length; i++)
                {
                    matrix[row][i] = 0;
                }
            });
        }
        
        for (int[] matrix1 : matrix) 
        {
            for (int j = 0; j<matrix[0].length; j++) 
            {
                System.out.print(matrix1[j] + "   ");
            }
            System.out.println("");
        }
    }
    
}
