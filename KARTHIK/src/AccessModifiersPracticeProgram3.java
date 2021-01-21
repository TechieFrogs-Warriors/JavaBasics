public class AccessModifiersPracticeProgram3 {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.display();
        Data d = new Data();
        d.setName("Karthik");
        System.out.println(d.m);
        d.getName();
        Def obj2=new Def();
        obj2.print();
    }
    
}
class Data {
    private String n="raj";
    String m;
    public String getName() {
        System.out.println(n);
        return this.n;
    }
    public void setName(String name) {
        this.m=name;
    }
}