package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class SpiralModel12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=vallidation(scan);
        spiral(number);
        scan.close();
    }
    //vallidation method
    static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Positive Integer Only:");
                scan.next();
            }
            number=scan.nextInt();
        }
        while(number<0);
        return number;
    }
    //spiral method 
    static void spiral(int size){
        //create an array
        int arr[][]=new int[size][size];

        //variables
        int row=0,col=0;
        char movement='r';

        //boundries
        int flag=1;
        int boundry=size-1;
        int left_Size=size-1;

        for(int i=1;i<size*size+1;i++){
            arr[row][col]=i;

            switch(movement){
                //right
                case 'r':
                col=col+1;
                break;
                //down
                case 'd':
                row=row+1;
                break;
                //left
                case 'l':
                col=col-1;
                break;
                //up
                case 'u':
                row=row-1;
                break;
            }
            //boundry cheak
            if(i==boundry){
                boundry=boundry+left_Size;

                if(flag !=2){
                    flag=2;
                }
                else{
                    flag=1;
                    left_Size = left_Size-1;//for every 2 times it happen
                }
                //directions
                switch(movement){
                    //right
                    case 'r':
                    movement='d';
                    break;
                    //down
                    case 'd':
                    movement='l';
                    break;
                    //left
                    case 'l':
                    movement='u';
                    break;
                    //up
                    case 'u':
                    movement='r';
                    break;
                } 
            }
        }
        //print
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
