public class InheritancePracticeProgram1 {
    public static void main(String[] args) {
        PostGraduate obj=new PostGraduate();
        obj.getDegree();
        obj.getGraduate();
    }
}

  class Degree1{
      public void getDegree(){
          System.out.println("I Got A Degree");
        }
    }
    class UnderGraduate extends Degree1{
        public void getGraduate(){
            System.out.println("I am UnderGraduate");
        }
    }
    class PostGraduate extends Degree1{
        public  void getGraduate(){
            System.out.println("I am PostGraduate");

        }
    }
 
