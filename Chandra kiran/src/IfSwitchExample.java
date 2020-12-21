public class IfSwitchExample {
    public static void main(String[] args) {
        Integer cost=150,tickets=4,vacancy=10,booked=40;
        if((cost>0&&tickets>0)&(vacancy>0||booked<50)){
            switch(cost){
                case 50:System.out.println("front row tickets are available");
                break;
                case 100:System.out.println("1st class tickets are available");
                break;
                case 150:System.out.println("balcony tickets are available");
                break;
                case 200:System.out.println("reclainers tickets are available ");
                break;
                default:System.out.println("housefull");

            }

        }
    }
    
}
