import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;

import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Mock
    private Calculator mockcalculator;
    Calculator calculator;


    @Before
    public void createCaculator() {
        mockcalculator = mock(Calculator.class);
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
        assertThat(calculator.add(a, b), is(27.0));
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
    public void testPow() {
        assertThat(this.calculator.pow(3, 3), is(27.0));
    }

    @Test
    public void leftShift() {
        assertThat(this.calculator.leftShift(1, 3), is(8));
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void rightShift() {
        doThrow(new InvalidUseOfMatchersException()).when(mockcalculator).rightShift(3, eq(-1));
        calculator.rightShift(3, -1);
    }

    @Test
    public void toBinary() {
    }

    @Test(expected = NoSuchElementException.class)
    public void toHexa() {
        doThrow(new NoSuchElementException()).when(mockcalculator).toHexa(15);
        mockcalculator.toHexa(15);
    }
}