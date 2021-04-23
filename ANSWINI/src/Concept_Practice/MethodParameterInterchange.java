public class MethodParameterInterchange 
{
    public static void main(String[] args) 
    {
        ParameterInterchange obj=new ParameterInterchange();
        obj.add(4500, 'A');
        obj.add('B',2066); 
    }
    static class ParameterInterchange
    {
        void add(int a,char b)
        {
            System.out.println("int datatype value is: "+a);
            System.out.println("char datatype value is: "+b);
            System.out.println("ADDING DIFFERENT DATATYPE VALUES  "+(a+b)+"\n");
        }
        void add(char b,int a)
        {
            System.out.println("int datatype value is: "+a);
            System.out.println("char datatype value is: "+b);
            System.out.println("SUBTRACTING DIFFERENT DATATYPE VALUES  "+(a-b));
        } 
    }  
}

