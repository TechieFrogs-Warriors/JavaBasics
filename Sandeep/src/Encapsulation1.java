public class Encapsulation1 {
    public static void main(String[] args) {

        Details acc = new Details();

        // acc.setAcc_no(7560504000L);
        acc.setName("Sai Sandeep");
        acc.setEmail("saisandeep@javatpoint.com");
        acc.setAmount(500000f);

        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }

}
