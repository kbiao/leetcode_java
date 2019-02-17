/**
 * Leetcode - two_sum
 */
package me.kbiao.leetcode.two_sum;

// basic util
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;


// JUnit & hamcrest
// slf4j

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== 【static for different test cases】 ============================== */

    // Solution to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {
        int[] p1 = {2, 7, 11, 15}; int[] r1 = {0,1};
        return Arrays.asList(new Object[][]{
//             {2, 7, 11, 15},     // test case 1 (parameters in array)
               {new int[]{2, 7, 11, 15}, 9, new int[] {1,0}},     // test case 2 (parameters in array)
               {p1,9,r1}  // test case 3 (parameters in array)
        });
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}



    /**=========================== 【for each test case】 ============================== */

    /** Parameters for each test */
     private int[] nums;                       // parameter 1
     private int target;                       // parameter 2
     private int[] expected;        // parameter 3 (expected answer)


    /** This constructor must be provided to run parameterized test. */
    public Tester(int[] parameter1, int target, int[] expected) {
        //
        // this.= ; (initialize test parameter1)
        //
        // this.= ; (initialize test parameter2)
        //
        this.nums = parameter1;
        this.target = target;
        this.expected = expected;

    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.info("your-method() pass unit test!");
        }

        Assert.assertArrayEquals(solution.twoSum(nums,target),expected);
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
