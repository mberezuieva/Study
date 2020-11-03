public class Tax {
    int numberOfDependents;
    double grossIncome;
    String state;
    static int customerCounter;

     Tax (int numberOfDependents, double grossIncome, String state) {
        this.grossIncome = grossIncome;
        this.numberOfDependents = numberOfDependents;
        this.state = state;
        customerCounter++;
        System.out.println("Preparing the tax data for customer # " + customerCounter);
    }

    public double calcTax() {

        return (grossIncome*0.33 - numberOfDependents*100);
    }
    static void convertToEuro (double tax) {

        System.out.println("Converted tax is " + tax*0.25);
    }
}
