package paralleltestngpackage;

import org.testng.annotations.Test;

public class ParallelDemo2 {
  
  @Test()
  public void testr2() {
	  System.out.println("test4: "+Thread.currentThread().getId());
  }
  
  @Test
  public void testr3() {
	  System.out.println("test5: "+Thread.currentThread().getId());
  }

}
