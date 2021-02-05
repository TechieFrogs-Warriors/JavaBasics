package ArrayAssignmentPrograms;

import java.util.Scanner;

public class LeftRotateOfElements3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size Of an Arry: ");
        int n=scan.nextInt();
        int a[]=new int[n];
        int output[]=new int[a.length];//leangth of an array

        for(int i=0;i<n;i++){//assigning values to array
            System.out.println("Enter Array Values: ");
            a[i]=scan.nextInt();
        }

        //left rotation
        System.out.println("Enter number of Rotations: ");
        int NoRotation=scan.nextInt();
        int RotationPoint=NoRotation;

        int i=0;//copy values start from rotation point onwards.
        while(RotationPoint<a.length){
            output[i]=a[RotationPoint];
            i++;
            RotationPoint++;
        }
        RotationPoint=0;//remaining values are copied into output array.
        while(RotationPoint<NoRotation){
            output[i]=a[RotationPoint];
            i++;
            RotationPoint++;
        }
        System.out.println("Output of left Rotation array is: ");
        for(int ch:output){
            System.out.print(ch+" ");
        }
        scan.close();
    }
}
