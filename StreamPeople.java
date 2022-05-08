import java.util.stream.Collectors;

public class StreamPeople {

	public static void main(String[] args) {
 String people = person.getPeople().stream().map((person) -> person.getName()).sorted()
.collect(Collectors.joining(" ,"));
	
 
 System.out.println(people);
}

}
