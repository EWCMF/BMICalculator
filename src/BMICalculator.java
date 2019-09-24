public class BMICalculator {


    /** Denne metoder returnere BMI rundet til 1 decimal for indtastet værdier
     * Vægt skal være i kg.
     * Højde skal være i meter.
     * Returner -1 hvis ikke gyldige tal er brugt.
     */
    static double bmiBeregning(double højde, double vægt) {

        final double MAX_HOEJDE = 3.0;
        final double MIN_HOEJDE = 0.01;

        final double MAX_VAEGT = 500.0;
        final double MIN_VAEGT = 0.1;

        double bmi = vægt / (højde * højde);

        if (højde > MAX_HOEJDE || højde < MIN_HOEJDE || vægt > MAX_VAEGT || vægt < MIN_VAEGT) {
            return -1;
        }

        double bmiRounded = Math.round(bmi*10.0) / 10.0;

        if (bmiRounded <= 18.5) {
            System.out.println("Du er undervægtig");
        }
        else if (bmiRounded <= 25 && bmiRounded > 18.5) {
            System.out.println("Du er normalvægtig");
        }
        else if (bmiRounded <= 30 && bmiRounded > 25) {
            System.out.println("Du er overvægtig");
        }
        else if (bmiRounded > 30) {
            System.out.println("Du er svært overvægtig. Tab dig, fede!");
        }

        return bmiRounded;
    }
}
