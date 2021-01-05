import java.util.Scanner;

class ProgramOnClass3 {
  void mySample(){
    Scanner scan=new Scanner(System.in);
    int Number;
    do{
        System.out.println("Enter Number: ");
        while(!scan.hasNextInt()){
            System.out.println("Please Enter Integer Value: ");
            scan.next();
        }
        Number=scan.nextInt();
    }
    while(Number<=0); 
    scan.close();
  }  
}
