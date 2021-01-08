public class MethodExcerciseProgram5 {
   public static void main(String[] args) {
       Degree obj1=new Degree();
       obj1.getDegree();
       Degree.UnderGraduate obj2=obj1.new UnderGraduate();
       obj2.getGraduate();
       Degree.PostGraduate obj3=obj1.new PostGraduate(); 
       obj3.getGraduate();
    
   }
}

     class Degree{
      public void getDegree(){
        System.out.println("I Got A Degree");
       }
    
     class UnderGraduate extends Degree{
           public  void getGraduate(){
               System.out.println("I am UnderGraduate");
           }
        }
        class PostGraduate extends Degree{
            public  void getGraduate(){
                System.out.println("I am PostGraduate");
            }
        }
    }



