import junit.framework.TestCase;

public class BMICalculatorTest extends TestCase {

    // Tage imod højde (m) og vægt (kg)

    public void testBmiBeregning() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(1.85, 95);
        assertEquals(27.8, resultat);
    }

    // Test for maksimum højde.
    public void testBmiBeregningMax() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(3.1, 95);
        assertEquals(-1.0, resultat);
    }

    // Test for minimum højde.
    public void testBmiBeregningMin() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(0.001, 95);
        assertEquals(-1.0, resultat);
    }

    // Test for division by zero.
    public void testBmiBeregningZero() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(0, 95);
        assertEquals(-1.0, resultat);
    }

    public void testBmiBeregningNegativ() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(-1, 95);
        assertEquals(-1.0, resultat);
    }

    public void testBmiBeregningVaegt() {
        double resultat;
        resultat = BMICalculator.bmiBeregning(1, 0);
        assertEquals(-1.0, resultat);
    }

    public void testBmiBeregningVaegtklasser() {

        // Undervægtig
        double resultat;
        resultat = BMICalculator.bmiBeregning(1.5, 40);
        assertEquals(17.8, resultat);

        // Normalvægtig
        resultat = BMICalculator.bmiBeregning(1.5, 50);
        assertEquals(22.2, resultat);

        // Overvægtig
        resultat = BMICalculator.bmiBeregning(1.5, 60);
        assertEquals(26.7, resultat);

        // Svært overvægtig
        resultat = BMICalculator.bmiBeregning(1.5, 120);
        assertEquals(53.3, resultat);
    }
}