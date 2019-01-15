package ru.job4j.condition;

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

public class PointTest  {
    @Test
    public void distanceToPoint()  {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double expect = 4.47213595499958;
        double result = a.distanceTo(b);
        assertThat(result, is(expect));

    }


}