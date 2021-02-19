abstract class Anonymousinnerclass {
    abstract void MyProgram();

}

class ClassProgram2 {
    public static void main(String[] args) {

        Anonymousinnerclass inner = new Anonymousinnerclass() {
            void MyProgram() {
                System.out.println("Hi This Is Karthik");
            }
        };
        inner.MyProgram();

    }
}

