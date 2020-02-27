import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCheckerTest {
    ArrayChecker arrayChecker = new ArrayChecker();

    @Test
    @DisplayName("Array is Match")
    public void testIsArrayMatch(){
        boolean expected = true;
        int[] a = {4,9,6};
        int[] b = {4,9,6};
        boolean actual = arrayChecker.isArrayMatch(a,b);
        assertEquals(expected,actual);
    }
}