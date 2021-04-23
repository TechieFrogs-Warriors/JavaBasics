package Java8_Features;

public class FunctionalInterfaceUsing_Lambda_Expression 
{
    public static void main(String[] args) 
    {
        // creating an anonymous object for functional interface using LAMBDA EXPRESSION
        //Lambda expression ignore method-name,return-type and access-specifier
        //Lambda Expression concentrate on arguments as well as body
        //Lamda Expression represented by lamda operator  -> 

        //implementing abstract method of functional interface here using lambda expression
        //when 'return' is used '{};' should be there
        System.out.println("-------------functional interface method with arguments and with returntype--------------");
        Calcy cobj = (int  a,int b) ->{ return  a+b ; };
        System.out.println(cobj.sum(10, 20));

        //or can be written as
        Calcy cobj2 = ( a,b) ->{ return  a+b ; };
        System.out.println(cobj2.sum(10, 20));

        //or can be written as
        Calcy cobj3 = (a,b) -> a+b;
        System.out.println(cobj3.sum(10, 20));

        System.out.println("----------functional interface method with arguments and without returntype------------");
        Calcy2 c = (int a,int b) -> System.out.println(a-b);
        c.sub(20, 10);
        //or can be written as
        Calcy2 c2 = (a,b) -> System.out.println(a-b);
        c2.sub(20, 10);


        System.out.println("------------functional interface method without arguments and without returntype------------");
        Calcy3 onlydisp = () -> System.out.println("Hello im functional interface method without arguments and returntype");
        onlydisp.disp();//since it has no arguments we will just diaplay something
    }

}


//An interface with only one abstract method is called functional interface
@FunctionalInterface //saying that this interface is functional by using annotation
interface  Calcy
{
    int sum(int a,int b); //abstract method with arguments and return type
   //int sub(int a,int b); //throws error saying 'calcy' is not a functional interface
     
}

@FunctionalInterface //saying that this interface is functional by using annotation
interface  Calcy2
{
    void sub(int a,int b); //abstract method with arguments 
   //int sub(int a,int b); //throws error saying 'calcy2' is not a functional interface
     
}


@FunctionalInterface //saying that this interface is functional by using annotation
interface  Calcy3
{
    void disp(); //abstract method without arguments and return type
   //int sub(int a,int b); //throws error saying 'calcy3' is not a functional interface
     
}

