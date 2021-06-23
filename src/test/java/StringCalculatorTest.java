import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp()
    {
        this.stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown()
    {
        this.stringCalculator = null;
    }

    @Test
    public void testAdd()
    {
        Throwable actualError = null;
        try
        {
            int result = this.stringCalculator.add("-1,5");
        }
        catch (Throwable error)
        {
            actualError = error;
        }

        assertTrue(actualError instanceof IllegalArgumentException);

    }

    @Test
    public void testAdd2()
    {
        int result = this.stringCalculator.add("1001, 1");

        assertEquals(1,result);
    }
}
