public class Methodovrride {
    public static void main(String[] args) {
        Grandfather obj = new Baby();
        obj.move();   
    }
    
}
class Grandfather{
    public void move(){
        System.out.println("uses his stick to walk");
    }
}
class Father extends Grandfather{
   private void move(){
        System.out.println("uses his legs to walk");

    }
    
}
class Baby extends Father{
  public  void move(){
        System.out.println("crawl");
    }
}