package test.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import main.java.ElementAppearOnce;
import org.junit.Test;

public class ElementAppearOnceTest {

  private static final ElementAppearOnce findUnique = new ElementAppearOnce();

  @Test
  public void shouldFindUniqueElement(){
    //given
    int[] arr = {9,9,9,1,2,3,4,2,3,4,2,3,4};
    int expected = 1;

    //when
    int unique = findUnique.getUniqueElementFromArray(arr);

    //then
    assertThat(expected, equalTo(unique));
  }

}
