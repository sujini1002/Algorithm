package cos.algorithm.level2.전화번호목록;

public class Alreadyna {
	public boolean phoneFind(String[] phone_book) {

		int length = phone_book.length;

		for (int i = 0; i < length; i++) {
			phone_book[i] = phone_book[i].replaceAll(" ", "");
		}

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (phone_book[j].startsWith(phone_book[i])) {
					return false;
				} else if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				}

			}
		}

		return true;

	}
}
