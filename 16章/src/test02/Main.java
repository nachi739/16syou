package test02;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayListを準備
		ArrayList<String> names = new ArrayList<String>();

		//3人を追加
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");

		System.out.println(names.get(1));
	}

}
