
import com.company.Utils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UtilsTest {

    Utils utils;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before ALL method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each method");
        utils = new Utils();
    }


    @Test
    @Order(4)
    @DisplayName("Check add method of Utils class ))")
    void check_add_method_of_utils_class() {
        int result = utils.add(2, 3); // execute
        Assertions.assertEquals(5, result, "5 is equal to 5");
        Assertions.assertNotEquals(6, result, "6 qanday qilib 5 ga teng boladi 😂");
    }

    @Test
    @Order(3)
    @DisplayName("Check Subtraction method of Utils class ))")
    void supTest() {
        int result = utils.sub(2, 3); // execute
        Assertions.assertEquals(-1, result, "-1 is equal to -1");
        Assertions.assertNotEquals(6, result);
    }

    @Test
    @Order(1)
    void testForSameExample() {
        String str = "hello";
        String str2 = utils.checkForSame(str);
        String str3 = utils.checkForNotSame(str);
        Assertions.assertSame(str, str2, "str and str2 are the same");
        Assertions.assertNotSame(str, str3, "str and str2 are not the same");
    }

    @Test
    @Order(2)
    void checkTwoArrayForEqualOrNot() {
        int[] array = {12, 4, 323, 57, 89};
        int[] sortedArray = utils.sortArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArray));
//        assertArrayEquals(array, sortedArray, "2 ta array teng emas ekanda");
    }


    @Test
    void testIfApplicationVersionHigherThan3() {
        //Assumptions.assumeTrue(utils.getAppVersion() > 2);
        Assumptions.assumeFalse(utils.getAppVersion() > 2);
        assertEquals(12, 45);
        assertEquals(12, 4);
        assertEquals(12, 5);
        assertEquals(12, 4125);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void testIfJREVersionHigherThan17() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_20)
    void testIfJREVersionBetween8and19() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testIfOsisMac() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testIfOsisWindows() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testIfOsisLinux() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = "/usr/lib/jvm/jdk-17")
    void testIfSystemPropertyEqualsToExpecteValue() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }


    @Test
    @EnabledIf(value = "customConditionOne", disabledReason = "Shunchaki Yoqmadi shu test")
    void enableWithCustomCondition() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    @Test
    @DisabledIf(value = "customConditionOne", disabledReason = "Bunisi ham Shunchaki Yoqmadi")
    void disableWithCustomCondition() {
        assertEquals(19, 19, "JRE version is higher than 17");
    }

    boolean customConditionOne() {
        System.out.println("customConditionOne");
        return new Random().nextBoolean();
    }


    @AfterEach
    void afterEach() {
        utils = null;
        System.out.println("After each method called");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After ALL method called");
    }
}