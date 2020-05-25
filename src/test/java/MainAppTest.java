import com.geekbrains.junit.maxta.MainApp;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;


public class MainAppTest {


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                 {new int[]{1,2,4,4,2,3,1,7}, new int[]{1,7}, "Case 1"},
                 {new int[]{8,3,5,8,2,1}, new int[]{1,3}, "Case 2"},
                 {new int[]{4,3,5}, new int[]{2,9}, "Case 3"}
        });
    }

    private int[] arrOriginal;
    private int[] arrExpected;
    private String message;

    public MainAppTest(int[] arrOriginal, int[] arrExpected, String message) {
        this.arrOriginal = arrOriginal;
        this.arrExpected = arrExpected;
        this.message = message;
    }

    @Test
    public void app() {

    assertArrayEquals("Заданный нами массив должен совпадать с полученным", arrExpected, MainApp.process(arrOriginal));
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionTask1() {

        MainApp.process(new int[]{1,2,3});
    }
}
