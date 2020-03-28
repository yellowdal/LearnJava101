public class TypeLesson {
	public static void main(String[] args) {
		int a = 1; // This is an integer
		float f = 1; // This is a float variable
		double d = 1; // This is a double variable
		long l = 1; //This is a long variable
		short s = 1; // This is a short variable
		byte b = 1; // This is a byte variable
		char c = 125; // This is char variable
		String string = "1"; // This is a string variable


		playWithInt();
		playWithChar();
	}

	public static void playWithInt() {
		int a = 1;
		int b = a;

		a = 10;
		System.out.println(a);
		System.out.println(b);

		a = 32000;
		System.out.println(a);

		a = 320000000;
		System.out.println(a);

		a = 2147483647;
		System.out.println(a);

		b = a + 1;
		System.out.println(b);
	}

	public static void playWithChar() {
		char myChar = 65;
		System.out.println(myChar);

		for (int i = 0; i < 256; i++) {
			myChar = (char)i;
			System.out.printf("%d   %c\n",i , myChar);
		}
	}
}