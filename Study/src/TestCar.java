public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "blue";
        car2.color = "red";

        System.out.println("These cars have been painted");
        System.out.println("The color of car1 is " + car1.color);
        System.out.println("The color of car2 is " + car2.color);


        String gf = "Masha";
        if (gf == "Masha") System.out.println(" True Masha ");

        String gf1 = new String ("Masha");
        String gf2 = new String ("Masha");

        if (gf1.equals(gf2)) System.out.println(" True Masha 1");


        System.out.println(" Hello " + args[0]);
    }
}
