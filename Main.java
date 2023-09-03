public class Main {

    public static void main(String[] args){
        //You cannot create a cake object since it is abstract
        //Cake cake = new Cake("Vanilla", 2, 20.00);
        BirthdayCake bcake = new BirthdayCake("Vanilla", 2, 20.00, true);
        System.out.println(bcake.calculateTotalPrice());
    }

}
