import java.util.List;



public class Sort {

	public static void main(String[] args) {
			System.out.println(lambdaPerson());
		
		
		}

	
private static List<person> lambdaPerson(){
	List<person> lambdaPeople = person.getPeople();
	lambdaPeople.sort((person1, person2) -> person.comparePeople(person1, person2));
	return lambdaPeople;
}

 

private static  List<person>  methodRefPeople(){
	List<person> lambdaPeople = person.getPeople();
	lambdaPeople.sort(person::comparePeople);
	return lambdaPeople;}}