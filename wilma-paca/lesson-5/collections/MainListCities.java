import java.util.Scanner;

public class MainListCities {
	public static void main(String [] args) {
		ListCities listCities = new ListCities();
		int numberCity;
		String name,city;
		
		System.out.println("Enter cities number to add to the arrayList: ");
		Scanner scanner = new Scanner(System.in);
		numberCity = scanner.nextInt();		
		
		for(int i=0;i<numberCity;i++) {
			System.out.println("Enter city :");   
			name = scanner.nextLine();
			listCities.addingCitiesToTheList(name);
		}
		
		System.out.println("Enter city name for searching in the list :");    	
		city =  scanner.nextLine();
		if(listCities.searchingTheCityInTheList(city)) {
			System.out.println("City exists in the list");
		}else {
			System.out.println("City does not exist in the list");
		}
		
		listCities.printTheFistElementOfArrayList();
		
		System.out.println("Printing datas for stack and Queue :"); 		
		listCities.printStackPop();
		listCities.printStackPeek();
		listCities.printQueue();
	}
}
