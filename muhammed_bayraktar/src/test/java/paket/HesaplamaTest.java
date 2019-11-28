package paket;
import org.junit.*;

import muhammed_bayraktar.Hesaplama;



public class HesaplamaTest {
	@org.junit.Test
	
	public void testCarp() {
		
		 int sonuc=Hesaplama.carp(2,4);
		org.junit.Assert.assertEquals(8, sonuc);

}
}
