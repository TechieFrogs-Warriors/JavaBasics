
public class PrintNumber 
{
    public static void main(String[] args) 
    {
        InstanceType iMethod=new InstanceType();
        iMethod.printn(10, 45.25f, 'A', true,125478542l, "Answini");
        staticType.printn(25, 78.35f, 'V', false, 145782457l, "Achyuth");   
    }
    public static class staticType
    {
        public static float printn(int a,float f,char ch,boolean b,long l,String s)
        {
        f=f+f;
        System.out.println(f);
        return f+ch;
    }
        
}

}
 class InstanceType
{
    void printn(int a,float f,char ch,boolean b,long l,String s)
    {
        System.out.println("PRINTING INTEGER  "+a);
        System.out.println("PRINTING FLOAT NUMBER  "+f);
        System.out.println("PRINTING CHARACTER  "+ch);
        System.out.println("PRINTING BOOLEAN VALUE  "+b);
        System.out.println("PRINTING LONG NUMBER  "+l);
        System.out.println("PRINTING STRING  "+s);
    }
}



    

