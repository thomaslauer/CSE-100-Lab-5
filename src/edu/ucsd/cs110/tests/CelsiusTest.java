package edu.ucsd.cs110.tests;
import edu.ucsd.cs110.temperature.Celsius;
import edu.ucsd.cs110.temperature.Temperature;
import junit.framework.TestCase;

public class CelsiusTest extends TestCase {
    private float delta = 0.001f;

    public void testCelsius() {
        float value = 12.34f;
        Celsius temp = new Celsius(value);

        assertEquals(value, temp.getValue(), delta);
    }

    public void testCelsiusToString() {
        float value = 12.34f;

        Celsius temp = new Celsius(value);
        String string = temp.toString();

        String beginning = "" + value;
        String ending = " C";

        // Verify the suffix of the formatted string
        assertTrue(string.startsWith(beginning));

        // Verify the prefix of the formatted string
        assertTrue(string.endsWith(ending));

        // Verify the middle of the formatted string
    }
}
