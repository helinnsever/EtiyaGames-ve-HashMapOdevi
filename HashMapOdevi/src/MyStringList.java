
public class MyStringList {
	
	private String[] films;
	private String[] star;
	
	private String[] tempfilms;
	private String[] tempstar;
	
	public MyStringList() {
		films=new String[0];
		star= new String[0];
	}
	
	public void put(String key, String value) {
		
		tempfilms=films;
		tempstar=star;
		
		films= new String[films.length+1];
		star= new String[star.length+1];
		
			
		for(int i=0; i<tempfilms.length; i++) {
			films[i]=tempfilms[i];
			star[i]= tempstar[i];
		}
		
	        films[films.length-1]=key;
	        
	        star[star.length-1]=value;
	        
	       
	}
	
	public String[] Getfilms() {
		
		String[] filmarray= new String[films.length];
		
		for(int i=0; i<films.length; i++) {
			filmarray[i]="key: "+films[i]+"      value: "+star[i];
		}
		return filmarray;
	}
	

}
