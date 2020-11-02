public class TestTax {

    public static void main(String[] args) {


        //NJTax t = new NJTax(2, 50000, "NJ");
        //t.numberOfDependents = 3;
        //int numberOfDependents = Integer.parseInt(args[0]);

        Tax t = new Tax(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
        double yourTax = t.calcTax();
        Tax.convertToEuro(yourTax);

        Tax t2 = new Tax (4, 65000, "TX");
        double hisTax = t2.calcTax();
        Tax.convertToEuro(hisTax);

        //double njt = t.adjustForStudents(yourTax);

        //System.out.println("Your tax is " + yourTax);

    }
}
