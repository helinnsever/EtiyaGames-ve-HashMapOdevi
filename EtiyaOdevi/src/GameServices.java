import java.util.ArrayList;

public class GameServices {

	ArrayList<Game> games=new ArrayList<Game>();
      public void add(Game game) {
		
		System.out.println(game.getGameName()+" oyunu Sisteme eklendi.");
		games.add(game);
	}
	
	public void remove(Game game) {
		System.out.println(game.getGameName()+" oyunu sistemden kaldirildi.");
	}
	
	public ArrayList<Game> getGames() {
		
		return games;
	}
	
	
}
