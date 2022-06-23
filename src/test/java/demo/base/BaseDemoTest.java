package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void test_sum_case1(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(6,baseDemo.sum(2,4));
    }

    @Test
    public void test_sum_case2(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(2,baseDemo.sum(-2,4));
    }
}
