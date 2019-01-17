package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ivan Dvoeglazov (dvoeglazovcom@gmail.com)
 * @version $Id$
 * @since 0.1
 */

      public class MaxTest {
          @Test
          public void whenFirstLessSecond() {
              Max maxim = new Max();
              int result = maxim.summation(1, 4);
              assertThat(result, is(4));
          }

          @Test
          public void whenFirstLessSecondLessThird() {
              Max m = new Max();
              int result = m.max(1,2,5);
              assertThat(result, is(5));
          }

      }