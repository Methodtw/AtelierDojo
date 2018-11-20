import java.util.*;

public class atelierJava {

	public static void main(String[] args){


		List<String> JAVA = new ArrayList<String>();
		JAVA.add("Mohamed-Kamel");
		JAVA.add("Marthe");
		JAVA.add("Erwann");
		JAVA.add("Alexis");
		JAVA.add("Annabelle");
		JAVA.add("Tony");
		JAVA.add("Justine");
		JAVA.add("Tantely");
		JAVA.add("Lucas");	
		JAVA.add("Gaetan");
		JAVA.add("Nicolas");
		JAVA.add("Mohamed");
	
		Iterator<String> iterator = JAVA.iterator();
		while (iterator.hasNext()) {
	  		System.out.println(iterator.next());
		}	
		List<String> JS = new ArrayList<String>();
		JS.add("Thomas");
		JS.add("Florentin");
		JS.add("Michel");
		JS.add("Matthieu");
		JS.add("Leuthsouline");
		JS.add("Michael");

		Map<String, ArrayList> MyMap = new HashMap<String, ArrayList>();

		MyMap.put("JAVA" , (ArrayList)JAVA);
		MyMap.put("JS" , (ArrayList)JS);
		
		for (Map.Entry<String, ArrayList> entry : MyMap.entrySet()) {
		    	String promo = entry.getKey();
		    	ArrayList prenom = entry.getValue();
			System.out.println(promo + " " + prenom);
		}

	
	}
}
			
	
	
	
	
