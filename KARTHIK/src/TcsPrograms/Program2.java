package TcsPrograms;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_1 = vallidation(scan);
        int t_2 = vallidation(scan);
        int t_3 = vallidation(scan);
        int t_4 = vallidation(scan);
        int t_5 = vallidation(scan);
        int t_6 = vallidation(scan);
        int t_7 = vallidation(scan);
        int t_8 = vallidation(scan);
        int t_9 = vallidation(scan);
        int t1_Oxygen = avarage(t_1, t_4, t_7);//avarage of trainee-1
        int t2_Oxygen = avarage(t_2, t_5, t_8);//avarage of trainee-2
        int t3_Oxygen = avarage(t_3, t_6, t_9);//avarage of trainee-3
        //find maximum avarage
        int avarage=Math.max(t1_Oxygen, t2_Oxygen);
        int m_Avarage=Math.max(avarage, t3_Oxygen);
        //cheak maximum avarage greter then 75 or not
        if(m_Avarage<70){
            System.out.println("All trainees are unfit.");
        }
        if(m_Avarage == t1_Oxygen){
            System.out.println("Trainee-1");
        }
        if(m_Avarage == t2_Oxygen){
            System.out.println("Trainee-2");
        }
        if(m_Avarage == t3_Oxygen){
            System.out.println("Trainee-3");
        }
    }
    //Avarage 
    public static int avarage(int t1,int t2,int t3){
        int avarage = (t1+t2+t3)/3;
        return avarage;
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
