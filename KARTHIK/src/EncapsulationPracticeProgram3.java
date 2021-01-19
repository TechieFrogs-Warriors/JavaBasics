public class EncapsulationPracticeProgram3 {
    public static void main(String[] args) {
        Man obj=new Man();
        obj.setNew("karthik",60,5.6f);
        System.out.println("Name Of The Man:"+obj.getName());
        System.out.println("Hieght Of The Man:"+obj.getHieght());
        System.out.println("Weight Of The Man "+obj.getWeight());
    }
    
}
class Man{
    private String Name;
    private float Hieght;
    private int weight;
    public String getName(){
        return Name;
    }
    public float getHieght(){
        return Hieght;
        
    }
    public int getWeight(){
        return weight;
    }
    public void setNew(String Name,int weight,float Hieght){
        this.Name=Name;
        this.weight=weight;
        this.Hieght=Hieght;
    }



}