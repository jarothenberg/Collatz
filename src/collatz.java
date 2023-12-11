public class collatz {

	public static int formula(int i) {// total turns until reaches 1
		int count = 0;
		while (i != 1) {
			count++;
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i *= 3;
				i++;
			}
		}
		return count;
	}

	public static boolean isPowerOfTwo(int n) {
		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

	public static int formula2(int i) {// total turns until reaches 2 to the power of something
		int count = 0;
		while (!isPowerOfTwo(i)) {
			count++;
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i *= 3;
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1000000; i++) {
			System.out.println(formula2(i));
		}
	}
}