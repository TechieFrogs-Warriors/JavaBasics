public class Arrayscopy 
{
    public static void main(String[] args) 
    {
        char a[]={'c','h','a','n','d','r','a'};
        char b[]= new char[5];
        System.arraycopy(a, 0, b, 0, 5);
        System.out.println(String.valueOf(b));
        //cloning
        System.out.println("print cloning of array ");
        char c[]=a.clone();
        for (char i : c) {
            System.out.print(i);
          }
          System.out.println();
          System.out.println(a==c);
         // class d = a.getClass();
         // String Name = a.getName();
          
        
    }
    
}
