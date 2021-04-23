public class ControlFlowStatements 
{
    public static void main(String[] args) 
    {
        //IF STATEMENT
        System.out.println("*****If Statement Output*****");
        int a=5;int b=10;
        if((a+b)==15){
            System.out.println("sum is equal to 15\n");
        }
        else{
            System.out.println("sum is not eaual to 15\n");
        }
        //NESTED IF AND ELSE IF  STATEMENTS
        System.out.println("*****Nested If AND Else If Output*****");

        String product="Available";
        String colour="Blue";
        int cost=500;
        if(product=="Available")
        {
            System.out.println("PRODUCT IS AVAILABLE");

            if(colour=="Blue"&&cost==500)
            {
                System.out.println("YOU HAVE BLUE COLOUR IN YOUR RANGE\n");
            } 
            else if(cost>500)
            {
                System.out.println("COST IS HIGH AND YOU CANT BUY IT NOW\n");

            }
            else if(colour!="Blue")
            {
                
                 System.out.println("TAKE PRODUCT IN OTHER COLOUR\n");
                
            }else
            {
                System.out.println("Nothing Happened");
            }

        }else
             {
            System.out.println("PRODUCT NOT AVAILABLE");
             }

        //SWITCH STATEMENTS
        System.out.println("*****Switch Statements Output*****");

        String work="Teacher";
        switch(work)
        {
           case "Lawyer" :
                    System.out.println("IAM LAWYER");break;
           case "Teacher":
                    System.out.println("IAM A TEACHER");break;
           case "Doctor" :
                    System.out.println("IAM A DOCTOR");break;
           default :
                    System.out.println("IAM NOT EDUCATED");
                          
        }
         

    }
    
}
