package Arrayprogramms;

public class Arrasspgm34 {
    public static void main(String[] args) {
        int i, j, row_sum, column_sum;	
	
		int[][] SumOfRowCols_arr = {{11, 21, 31}, {41, 51, 61}, {71, 81, 91}};
	
		
		for(i = 0; i < SumOfRowCols_arr.length; i++)
		{
			row_sum = 0;
			column_sum = 0;
			for(j = 0; j < SumOfRowCols_arr[0].length; j++)
			{
				row_sum = row_sum + SumOfRowCols_arr[i][j];
				column_sum = column_sum + SumOfRowCols_arr[j][i];
			}
			System.out.println("The Sum of Matrix Items "
					+ "in Row " + i + " = " + row_sum);
			System.out.println("The Sum of Matrix Items "
					+ "in Column " + i + " = " + column_sum);
		}
    }
    
}
