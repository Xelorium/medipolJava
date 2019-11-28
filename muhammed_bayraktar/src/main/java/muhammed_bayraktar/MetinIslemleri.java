package muhammed_bayraktar;

import java.util.Locale;

public class MetinIslemleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static String buyukHarf(String metin) {
		return metin.toUpperCase(
			Locale.forLanguageTag("tr")
			);
	}
	
}
