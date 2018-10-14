package simpleStringDivision;

public class SimpleStringDivision {
	public static void main(String[] args) {
		System.out.println(solve("1 2 36 4 8", 2));
	}

	public static int solve(String s, int k) {
		int howMany = 0;
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++)
				if (i != j)
					if ((Integer.parseInt(a[i] + a[j])) % k == 0)
						howMany++;
		return howMany;

	}
}
