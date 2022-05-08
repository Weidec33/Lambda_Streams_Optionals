import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPeople {
	
	



public static void main(String[] args) {
	 Optional<person> dude = Optional.empty();
	
 personOptionalB(dude);









 
}
public static   void personOptionalB(Optional<person> optionalPerson) {
	
	
	if(optionalPerson.isEmpty()) {
	try {
		personOptional(Optional.empty());
	} catch (NoSuchElementException e) {
		
		System.out.println(e.getMessage());
	}
	}
	else { System.out.println(optionalPerson);
 }}
 
 
 
public  static person personOptional(Optional<person> optionalPerson) {
	return optionalPerson.orElseThrow(() -> new NoSuchElementException("No person is in here "));
}}