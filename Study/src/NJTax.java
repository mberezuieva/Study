public class NJTax extends Tax {
    NJTax (int numberOfDependents, double grossIncome, String state) {
        super (numberOfDependents, grossIncome,state);
    }

    public double adjustForStudents (double tax) {
        return tax - 500;
    }

    public double calcTax() {
        if (grossIncome < 50000) {
            return grossIncome*0.10;
        }
        else return grossIncome*0.13;
    }
}
