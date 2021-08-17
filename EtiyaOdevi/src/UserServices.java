import java.util.ArrayList;
public class UserServices {

		ArrayList<User> users= new ArrayList<User>();
		
		public void add(User user) {
			if(user.getAge()>=15)
			{
				System.out.println(user.getFirstName()+" sisteme eklendi.");
				users.add(user);
			}else {
				System.out.println(user.getFirstName()+" sisteme eklenemedi.");
			}
		}
			
		
		public void remove(User user) {
			System.out.println(user.getFirstName()+" sistemden kaldirildi");
			
		}
		
		public ArrayList<User> getUsers() {
		
			return users;
		}
		
		
		
}
