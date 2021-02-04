public class ArraysPrg47 
{
    public static void main(String[] args) 
    {
        char a[]={'c','h','a','n','d','u'};
        String b="chandrakiran";
        System.out.println(toString(a));//converts the char array into string
         char ch[]= new char[b.length()];
         for(int i=0;i<b.length();i++)
         {
             ch[i]=b.charAt(i);//converts the string into the char
             System.out.print(ch[i]+" ");//prints each character in the string

         }

    }
    public static String toString(char[] a) 
    {
        String S=new String(a);
		return S;
    }

}

    
    

    

