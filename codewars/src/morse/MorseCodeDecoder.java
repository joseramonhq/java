package morse;

public class MorseCodeDecoder {

	public static void main(String[] args) {
		System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
	}

	public static String decode(String morseCode) {

		String str = "", phrase = "";
		morseCode.trim();
		while (morseCode.indexOf(" ") != -1) {
			str = morseCode.substring(0, morseCode.indexOf(" "));
			phrase += MorseCodeDecoder.decode2(str);
			morseCode = morseCode.substring(morseCode.indexOf(" ") + 1);
			if (morseCode.substring(0, 1).equals(" ")) {
				phrase += " ";
				morseCode.trim();
			}

		}
		phrase += MorseCodeDecoder.decode2(str);
		return phrase;
	}


	public static String decode2(String code) {
	
		String[][] a = { { ".-", "A" }, { "-...", "B" }, { "-.-.", "C" }, { "-..", "D" }, { ".", "E" },
				{ "..-.", "F" },{"--.","G"},{"....","H"},{"..","I"},{".---","J"},{"..-","U"},{"-..","Y"}};
		int i;
		for (i = 0;i<a[0].length; i++) {
			if (a[i][0].equals(code)) {
				return a[i][1];
			}
		}
		return "";
		
	}

}
