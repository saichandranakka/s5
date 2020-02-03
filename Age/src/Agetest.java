import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Agetest {

  private int input;
  private String output;
  private Age age;
  public Agetest(int input,String output)
  {
    this.input=input;
    this.output=output;
  }
  
  @Before
  public void init()
  {
    age=new Age();
        
  }
  
  @Parameterized.Parameters
  public static Collection Agetest()
  {
    return Arrays.asList(new Object[][] {
      {15,"Not Elgible"},
      {20,"Elgible to vote"},
    });
  }
  @Test
  public void addtest()
  {
	  assertEquals(output,age.election(input));
  }
}