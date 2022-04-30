public class StringManipulator {

	public String trimAndConcat(String str, String str2) {
		String concatTrim = str.trim().concat(str2.trim());

		return concatTrim;
	}

	public int getIndexOrNull(String str, char letter) {
		int index = str.indexOf(letter);

		return index;
	}

	public int getIndexOrNull(String str1, String str2) {

		return str1.indexOf(str2);
	}

	public String concatSubstring(String str1, int init, int fin, String str2) {

		String subStr1 = str1.substring(init, fin);

		return subStr1.concat(str2);
	}
}
