class Cat {
	int legs = 4;

	int getLegs() {
		return legs;
	}
}

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		int l = cat.legs;
		System.out.println(l);

		int legs = cat.getLegs();
		System.out.println(legs);

		System.out.println(cat.getLegs());
	}
}