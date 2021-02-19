package Accenturepgms;

import java.util.Arrays;

public class Ass10 {
    static int row1(int m[][]){
        for(int i=0;i<m.length;i++)
        Arrays.sort(m[i]);//sorting values in a arrays
        for(int i=0;i<m.length;i++){/////loop for rows
            for(int j=0;j<m[i].length;j++)//loop for coloumns
            System.out.print(m[i][j] + " ");
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        int m[][]={{9,6,3},{8,5,2},{7,4,10}};
        row1(m);
    }
    
}
