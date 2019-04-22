import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {


    Calculator calculator;

    @Before
    public void createCaculator(){
        calculator = new Calculator();
    }


    //각각 테스트 함수명 바꿔서 , 추가해서 테스트함수 작성할 것 ,단 맨앞에 Test 붙일 것
    //ex)
    //0으로나누는 것을 막기위해서 throw Exception을 던지는 것을 확인하는 테스트함수명
    //TestThrowExeptionWhenDivideToZeRo 이런식으로 의미있게.


    @Test
    public void TestSimpleAdd() {
        double a = 24;
        double b = 3;
        assertThat(calculator.add(a,b), is(27.0));
    }


    @Test
    public void sub() {
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
    }

    @Test
    public void mod() {
    }

    @Test
    public void pow() {
    }

    @Test
    public void leftShift() {
    }

    @Test
    public void rightShift() {
    }

    @Test
    public void toBinary() {
    }

    @Test
    public void toHexa() {
    }
}