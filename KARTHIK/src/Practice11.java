import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String A = vallidation(scan);//vallidating string

        //split the string
        String number[]= A.split("=");
        int arr[] = new int[number.length];
        //converting String to int
        for(int i=0;i<number.length;i++){
            arr[i]=Integer.parseInt(number[i]);
        }
        //assign array numbers to LHS,RHS
        int LHS = arr[0];
        int RHS = arr[arr.length-1];

        //logic
        int rem=0, sum=0, count=0;
        while(LHS>0){
            rem = LHS%10;//to extract single digit
            sum =sum + rem;//summing the each digits
            count++;
            LHS =LHS/10;//remove last element
            if((sum+LHS)==RHS){
                System.out.println("Minimum Pluses:"+count);
                break;
            }
        }
    }
    //string vallidation
    public static String  vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[0-9&=]*")){
                System.out.println("Enter Numeric String only:");
                scan.next();
            }
            str = scan.next();
        }
        while(str.equals(" "));
        return str;
    }
}
