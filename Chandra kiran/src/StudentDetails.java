class Student 
{
    int rollno=7;
    String name="Chandu",branch="cse";
    
 void Even()
 {
     for(int n=1;n<=5;n++)
     {
         if(n%2==0)
         {
            System.out.println(n+" number is even" );
          }
         else
         {
            System.out.println(n+" number is odd");
          }

        }
    }
   
 void Add(int a,int b,int c)
    {    
        c=a+b;
        System.out.println(c);
    }

   
}
 

    

class Studentdetails
{
    public static void main(String[] args)
    {
        Student Stud1=new Student();
        
        System.out.println(Stud1.rollno);
        System.out.println(Stud1.name);
        System.out.println(Stud1.branch);
        Stud1.Even();
         
    }
    
}
