package ArrayAssignmentPrograms;

import java.lang.Math.*;

public class StanderedDeviation37 {
    public static void main(String[] args) {
        double[] a = { 1.51d, 2.35d, 3.25d, 4.25d, 5, 6 };
        double sum=0,standDev=0;
        double length=a.length;

        for(double ch : a) {
            sum=sum+ch;
        }

        double Mean=sum/length;

        for(double ch:a){
            standDev=standDev+Math.pow(ch-Mean, 2);
        }
        System.out.print("Standered Deviation: ");
        System.out.println( Math.sqrt(standDev/length));
       
    }
}
