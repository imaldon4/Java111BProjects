
public class CountableMain {

	public static void main(String[] args) {
		Countable box = new Countable();
		int input = box.getInstanceCount();
		System.out.println(input);
		
		Countable a = new Countable();
		int aa = a.getInstanceCount();
		System.out.println(aa);
		
		Countable b = new Countable();
		int bb = b.getInstanceCount();
		System.out.println(bb);
	}

}
