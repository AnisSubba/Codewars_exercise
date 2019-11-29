package com.spartaglobal.codewars_exercise;

import static org.junit.Assert.assertEquals;
import com.spartaglobal.codewars_exercise.exercise1.Are_They_Same;
import com.spartaglobal.codewars_exercise.exercise2.natural_number;
import com.spartaglobal.codewars_exercise.exercise3.Remove_String_Spaces;
import com.spartaglobal.codewars_exercise.exercise4.descending_order;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Are_They_Same AreSame;
    private natural_number natural_number;
    private Remove_String_Spaces remove;
    private descending_order decending;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void Test2(){
        assertEquals(233168, natural_number.natural());
    }

    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", remove.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", remove.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", remove.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", remove.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", remove.noSpace("8j aam"));
    }

    @Test
    public void test_01() {
        assertEquals(0, decending.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, decending.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, decending.sortDesc(123456789));
    }
}
