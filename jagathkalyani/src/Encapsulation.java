public class Encapsulation
 {
    public static void main(String[] args) {
        y obj =new y();
        obj.setName("warriors");
        obj.setno(3);
        System.out.println("name:" + obj.getName());

        System.out.println("no:" + obj.getno());

    }
    
}
class y{
    private String name;
    private int no;
    public String getName(){
        return name;
    }
    public void setName(String name){
       this. name = name;
    }
    public int getno(){
        return no;
    }
    public void setno(int no){
       this. no = no;
    }
}