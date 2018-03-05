package test;

public class test1 {

	private static final int aa = 1;
	private static final int bb = 0;

	public static void main(String[] args) {

		String a = "7D";
		String b = "418";

		String[] n = convert(a, b);

		System.out.println(n[aa]);
		System.out.println(n[bb]);
		System.out.println(n[bb]);


	}

	private static String[] convert(String a, String b) {

		String[] ary = getArray(false);

		if (ary == null) {
			return new String[] {a,b};
		}

		return ary;
	}

	private static String[] getArray(boolean f) {

		if (f) {
			return new String[] { "11", "418" };
		} else {
			return null;
		}

	}

}
