
import org.junit.Test;
import powerpackage.PowerFinder;

public class PowerTest {

    @Test
    public void shouldReturnOnefForOnePowerOfOne() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void shouldReturnTwoForOnePowerOfTwo() {
        assert PowerFinder.of(2, 1) == 2;
    }

    @Test
    public void shouldReturnFourForTwoPowerOfTwo() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void shouldReturnNineForTwoPowerOfThree() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}
