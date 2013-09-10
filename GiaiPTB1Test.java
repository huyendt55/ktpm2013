package Test;

import static org.junit.Assert.*;


import org.junit.Test;


public class GiaiPTB1Test {
	private GiaiPTB1 GiaiPTB1 = new GiaiPTB1();
	
	
@Test
	public void test1(){
		assertEquals("",-1,GiaiPTB1.test(1,1));
	}

	public void test2(){
		assertEquals("",9,GiaiPTB1.test(-10,90));
}

}
