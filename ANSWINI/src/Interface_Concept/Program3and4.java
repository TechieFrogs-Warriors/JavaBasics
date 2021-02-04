package Interface_Concept;

public interface Program3and4
    {
        void nothing();
        void nothing2();
        void nothing3();
        int id=1;
        String name="aswini";
        public static void main(String[] args) 
        {
            //Checking.id=10;//'id' is final by default in 'checking' interface
            // Checking.name="vedansh";// 'name' is final by default in 'checking' interface
            Check_Field c=new Check_Field();
            // c.id=10;//final cannot be assigned
            //c.name="java";//final cannot be assigned
        }   
    }

class Check_Field implements Program3and4
{
    public void nothing()
    {
        System.out.println("iam nothing method of interface Sample_check");
    }
    public void nothing2()
    {
        System.out.println("iam nothing2 method of interface Sample_check");
    }
    public void nothing3()
    {
        System.out.println("iam nothing3 method of interface Sample_check");
    }
}
 
