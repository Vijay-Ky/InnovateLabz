package app1;

public class H {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
