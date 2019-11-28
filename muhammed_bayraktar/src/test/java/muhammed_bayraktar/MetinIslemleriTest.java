package muhammed_bayraktar;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = MetinIslemleri.buyukHarf("muhammed");
		org.junit.Assert.assertEquals("MUHAMMED", sonuc);
	}

}
