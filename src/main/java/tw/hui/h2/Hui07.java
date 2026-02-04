package tw.hui.h2;

import tw.hui.h2.entity.User;

public class Hui07 {
	public static void main(String[] args) {
		User user = new User.UserBuilder("Hui")
				.id(1)
				.age(26)
				.gender(false)
				.build();
		System.out.println(user.getAge());
		System.out.println("-------");
		
		User user2 = User.builder("Jason")
				.id(2)
				.age(29)
				.gender(true)
				.build();
	}
}
