import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ListCities {
	protected Stack newsFeed = new Stack();
	ArrayList<String> listCities = new ArrayList();
	protected int count;
	protected boolean valueBool = false;
	protected String city;
	private static Scanner  scanner;

	
	public void printStackPop() {
		newsFeed.push("Vegetable");
		newsFeed.push("Animals");
		newsFeed.push("Books");
		newsFeed.push("Tourism");
		String breakingNews = (String) newsFeed.pop();
		System.out.println("stack pop"+breakingNews);
	}
	
	public void printStackPeek() {		
	String peekNews = (String) newsFeed.peek();
	System.out.println("stack peek"+peekNews);
	
	}
	
	public void printQueue() {
		Queue orders = new LinkedList<String>();
		orders.add("Order1");
		orders.add("Order2");
		orders.add("Order3");
		System.out.print("Queue"+orders.poll());
		System.out.print("Queue"+orders.poll());
		System.out.print("Queue"+orders.poll());
	}
	
	public void printTheFistElementOfArrayList() {
		
		String s = (String) listCities.get(0);
		System.out.print("First element:"+s);
	}
	
	public void addingCitiesToTheList(String city) {
		listCities.add(city);
	}

	public Boolean searchingTheCityInTheList(String searchCity) {
		for(String city : listCities){
			   if(city.equals(searchCity)){
				   valueBool = true;
			   }
			}
		return valueBool;
	}
	
	
}
