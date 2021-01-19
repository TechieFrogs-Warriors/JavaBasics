public class EncapsulationPracticeProgram4 {
    public static void main(String[] args) {
        Man1 obj=new Man1();
        obj.setName("karthik");
        obj.setHieght(5.6f);
        obj.setWeight(60);
        System.out.println("Man Details: "+obj.getNew1());
    }
    
}
class Man1{
    private String Name;
    private float Hieght;
    private int weight;
	public String getNew1() {
		if(Name==""){
            return Name;
        }
         if(Hieght!=12){
            System.out.print(Hieght);
            return "";
        }
        if(weight!=100){
            System.out.println(weight);
            return "";
        }
        return "";
	}
	public void setName(String name) {
		Name = name;
	}
	public void setHieght(float hieght) {
		Hieght = hieght;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
    

}

