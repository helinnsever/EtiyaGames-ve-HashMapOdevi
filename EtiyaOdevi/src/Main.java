
public class Main {

	public static void main(String[] args) {
		
		UserServices userServices=new UserServices();
		GameServices gameServices=new GameServices();
		Game game1=new Game("Sims", "Action",500);
		
		User user1=new User("Alper", "Tombul",28);
		
		
		Game game2=new Game("GTA","Action",300);
		
		User user2=new User("Helin","Sever",5);
		
		
		userServices.add(user1);
		userServices.add(user2);
		
		gameServices.add(game1);
		gameServices.add(game2);

		
		for(Game item: gameServices.getGames()) {
			
			System.out.println(item.getGameName()+"  "+item.getGamePrice()+"  "+item.getGameType());
		}
		
        for(User useritem: userServices.getUsers()) {
			
			System.out.println(useritem.getFirstName()+"  "+useritem.getLastName()+"  "+useritem.getAge());
		}
		
       
		

	}

}
