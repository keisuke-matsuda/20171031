import static org.junit.Assert.*;

import org.junit.Test;

public class DealMoneyTest {

	@Test
	public void test1() {
		assertEquals(DealMoney.checkInput(100),100);
		assertEquals(DealMoney.checkInput(200),0);
	}

	@Test
	public void test2() {
		Product testProduct = new Product("cola",120,10);
		assertEquals(testProduct.getName(),"cola");
		assertEquals(testProduct.getPrice(),120);
		assertEquals(testProduct.getBalance(),10);
	}

}
