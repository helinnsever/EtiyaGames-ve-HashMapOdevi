
public class Main {

	public static void main(String[] args) {
		
		MyStringList list= new MyStringList();
		
		
		list.put("Forrest Gump","Tom Hanks");
		list.put("Fight Club","Brad Pitt");
		list.put("Gone Girl","Rosamund Pike");
		
        for(String film: list.Getfilms()) {
        	
        	System.out.println(film);
        	
        }
		
		
		
	}
}
