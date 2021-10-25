/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class FinanceCalculator {
    private static int MONTHS_IN_YEAR = 12;

    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double interestRate = 1 + rate / 100;
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * (Math.pow(interestRate, months));

        return futureValue;
    }
}