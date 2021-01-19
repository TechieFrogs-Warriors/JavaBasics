public class AccessModifiersPracticeProgram4 {
    public static void main(String[] args) {
        Def def = new Def();
        def.print();
        //System.out.println(def.num);
        Data obj=new Data();
        obj.getName();
    }
}
class Def {
    private int num = 175;  
    void print() {
        System.out.println("Default class " + num); 
    }
}
