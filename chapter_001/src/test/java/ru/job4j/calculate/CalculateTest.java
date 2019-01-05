package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Ivan Dvoeglazov (dvoeglazovcom@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Ivan Dvoeglazov";
    String expect = "Echo, echo, echo : Ivan Dvoeglazov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}