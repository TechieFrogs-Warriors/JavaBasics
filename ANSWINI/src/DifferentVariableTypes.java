

public class DifferentVariableTypes {

    public static void main(String[] args) 
     //***********HOW TO WRITE DIFFERENT DATATYPES WE HAVE IN JAVA*************   
    
    {
        //Instance variables
        boolean  say=true;
        byte myage=30;
        short myphone_cost=28000;
        int state_population=346357494;
        long $India_population=-970408356974596738l;
        char A='a';
        char B=65;
        float price=48986789998763244455.508763249656433f;
        double totalprice=1999999999999476574657564279232445678943299.99999999999999999;
        System.out.println("*******MY OUTPUT********");
        System.out.println("\nIAM GOOD: "+say);

        System.out.println("\nNEVER ASK AGE: "+myage);

        System.out.println("\nYou know my newphone cost: "+myphone_cost);

        System.out.println("\nSTATE POPULATION: "+state_population);

        System.out.println("\nMY COUNTRY POPULATION:"+$India_population);

        System.out.println("\nPrints Assigned Value: "+A);

        System.out.println("\nWhose ASCII value is this: "+B);

        System.out.println(price);

        System.out.println(totalprice);
        Local obj=new Local();
        obj.MyAge();
    }

}
       
      class Local 
      { 
        int age = 10;//local variable
        static int K;//static variable
        void MyAge() 
       { 
           age=age-2;
           K++; 
           System.out.println(K);
           System.out.println("My age is : " + age); 
       }   
        
      }  
    
    

