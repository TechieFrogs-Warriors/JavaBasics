import Myprogram.*;

public class Empdet extends Emp {
    public static void main(String[] args) {
        Empdet obj = new Empdet();
        obj.setAcc_no(7560504000L);
        obj.setName("Sai Sandeep");
        // obj.setEmail("saisandeep@javatpoint.com");
        obj.setAmount(500000f);

        System.out.println(obj.getAcc_no() + " " + obj.getName() + " " + obj.getEmail() + " " + obj.getAmount());

    }

}
