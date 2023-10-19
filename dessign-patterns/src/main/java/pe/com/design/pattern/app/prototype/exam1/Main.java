package pe.com.design.pattern.app.prototype.exam1;

public class Main {
	//patron prototype
	//permite crear copias de un obj
	//condiferentes referencias en memorias
 public static void main(String[] args) {
	User user1= new User();
	user1.setAge(28);
	user1.setLastNme("Alarcon");
	user1.setMaritalStatus("Alone");
	user1.setName("Jakie");
	
	User user2= (User) user1.clone();
	user2.setName("Ives");
	
	User user3= (User) user1.clone();
	user2.setMaritalStatus("Married");

	
	System.out.println(user1);
	System.out.println(user2);
	System.out.println(user3);
}
}
