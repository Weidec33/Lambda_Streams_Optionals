import java.util.ArrayList;
import java.util.List;

public class person {

	private String name ;
	
	
	public person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static int comparePeople(person person1, person person2) {
		if(person1.name.compareTo(person2.name) < 0) {
			return -1;
		}
		else if (person1.name.compareTo(person2.name) > 0 ) {
			return 1;
		}
		else return 0;
	}
   
	 private static List<person> people = List.of(
			new person("Chris"),
			new person("Sara"),
			new person("Ray"),
			new person("Steven"),
			new person("Bobby"));


	
			
	 public static List<person> getPeople(){
		 return new ArrayList <>(people);
 
			

	
     

	}
}
