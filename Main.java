package HotelGreeter;

public class Main {

    public static void main(String[] args) {
        HotelGreeter greeter1 = new Chinese();
        greeter1.say();

        HotelGreeter greeter2 = new Koroan();
        greeter2.say();

        HotelGreeter greeter3 = new Thai();
        greeter3.say();
        }
}
