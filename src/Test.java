import java.util.ArrayList;

/**
 * Java Test Class
 * @author buzz
 *
 */
class Test {
	
	public static void main(String args[]){
		ArrayList<User> userlist = new ArrayList<User>();
		
		for(int i=0; i<10; i++){
			User user = new User();
			user.setNo(String.valueOf(i+1));
			user.setId("id_" + String.valueOf(i+1));
			user.setName("name_" + String.valueOf(i+1));
			user.setAge(String.valueOf(i+19));
			user.setMobile("mobile_" + String.valueOf(i+1));
			user.setEmail("email_" + String.valueOf(i+1));
			
			userlist.add(user);
		}
		
		userlist.forEach( item -> {
			System.out.println("===============");
			System.out.println("user no     : " + item.getNo());
			System.out.println("user id     : " + item.getId());
			System.out.println("user name   : " + item.getName());
			System.out.println("user age    : " + item.getAge());
			System.out.println("user mobile : " + item.getMobile());
			System.out.println("user email  : " + item.getEmail());
		});
		
		userlist.sort( (User a, User b) -> {
			return Integer.parseInt(b.getNo()) - Integer.parseInt(a.getNo());
		});
		
		userlist.forEach( item -> {
			System.out.println("===============");
			System.out.println("user no     : " + item.getNo());
			System.out.println("user id     : " + item.getId());
			System.out.println("user name   : " + item.getName());
			System.out.println("user age    : " + item.getAge());
			System.out.println("user mobile : " + item.getMobile());
			System.out.println("user email  : " + item.getEmail());
		});
	}
}