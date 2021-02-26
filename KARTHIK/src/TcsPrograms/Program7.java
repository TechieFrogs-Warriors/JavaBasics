package TcsPrograms;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of monkeys:");
        int n = vallidation(scan);//no.of monkeys
        System.out.println("Number of eatable bananas by monkey: ");
        int k = vallidation(scan);//no.of eatable bananas
        System.out.println("Number of eatable peanuts by monkey: ");
        int j= vallidation(scan);
        System.out.println("total Number of bananas: ");
        int m = vallidation(scan);
        System.out.println("Total Number Of peanuts: ");
        int p= vallidation(scan);
        int eat_Bananas=0;
        int eat_Peanuts=0;

        if(n<0 && k<0 || j<0 || m<0 || p<0){
            System.out.println("Invallid input.");
        }
        else{
            if(k>0){
                eat_Bananas=m/k;//total bananas by eatable bananas
            }
            if(j>0){
                eat_Peanuts=p/j;
            }
            n = n-(eat_Bananas+eat_Peanuts);
            System.out.println("Number of  Monkeys left on the tree: "+n);
        }
    }
    //valldation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
}
