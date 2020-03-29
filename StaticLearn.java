class User {
	static String className = "User";

    private String name;

    String getName() {
    	return name;
    }

    void setName(String name) {
    	this.name = name;
    }
}

public class StaticLearn {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("Green");
		System.out.println(u1.getName());
		System.out.println(u1.className);

		User u2 = new User();
		u2.setName("Blue");
		System.out.println(u2.getName());
		System.out.println(u2.className);

		u1.className = "userclass";
		System.out.println(u1.className);
		System.out.println(u2.className);	

		System.out.println(User.className);

	}
}