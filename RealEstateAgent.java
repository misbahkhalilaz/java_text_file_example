import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateAgent{
	
	public ArrayList<String> final_list = new ArrayList<String>();
	public ArrayList<String> loaded_files_names = new ArrayList<String>();
	private ArrayList<String> loaded_files = new ArrayList<String>();
	
	public void listingsChosen() throws FileNotFoundException 
	{	
		String agency_selected = null;
		agency_selected = getAgenciesForTheExhibition();
		getFiles(agency_selected);
		getData();
	}
	
	private String getAgenciesForTheExhibition() //agencies selection
	{
		System.out.println("For this list of homes which real-estate agencies\r\n" + "would you like the home listings drawn from?\r\n" + "Please enter their numbers on one line:" + "\n1) Century 21\n2) ReMax\n3) McEnearney\n4) Long & Foster");
		Scanner scan = new Scanner(System.in);
		return (scan.nextLine());
	}
	
	private void getFiles(String a) throws FileNotFoundException //save selected agency names in loaded_files_names ArrayList & send their file paths to Agency.java
	{															//	Agency.java will load these files in loaded_files ArrayList		
		char i='1';
		String file_path = null;
		while(i<='4' && a!=null) {		
			
			
			if(a.indexOf(i)!=-1) {
				switch(i) {
				case '1': {
					file_path = "src/Century 21 Real-Estate Comapny.txt";
					loaded_files_names.add("Century 21");
					break;
				}
				case '2': {
					file_path = "src/ReMax Real-Estate Company.txt";
					loaded_files_names.add("ReMax");
					break;
				}
				case '3': {
					file_path = "src/McEnearney Real-Estate Company.txt";
					loaded_files_names.add("McEearney");
					break;
				}
				case '4': {
					file_path = "src/Long & Foster Real-Estate Comapny.txt";
					loaded_files_names.add("Long & Foster");
					break;
				}
				default:{
					final_list.add("Bad Selection");
					break;
				}
				}//switch
				if(final_list.isEmpty())
				{
					Agency load = new Agency(file_path);
					loaded_files.addAll(load.list);
				}
			}
			i++;
		}//while
	}//getFiles()
	
	private void getData() //ask RealEstateListing to load requested data in ArrayList final_list
	{
		int style, number_of_bedrooms, number_of_bathrooms, price, jurisdiction, age;
		float lot_size, distance_from_work;
		int home_criteria = pickHomeCriteria();
		
		RealEstateListing load_requested_data = new RealEstateListing(loaded_files);
		
		switch(home_criteria) 
		{
			case 1:{
				style = getStyle();
				load_requested_data.grabStyles(style);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 2:{
				number_of_bedrooms = getNumOfBedrooms();
				load_requested_data.grabNumOfBedroom(number_of_bedrooms);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 3:{
				number_of_bathrooms = getNumOfBathrooms();
				load_requested_data.grabNumOfBathroom(number_of_bathrooms);
				final_list = load_requested_data.grabed_data;
				break;
			}
		
			case 4:{
				lot_size = getLotSize();
				load_requested_data.grabLotSize(lot_size);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 5:{
				age = getAge();
				load_requested_data.grabAge(age);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 6:{
				price = getPrice();
				load_requested_data.grabPrice(price);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 7:{
				distance_from_work = getDistanceFromWork();
				load_requested_data.grabDistance(distance_from_work);
				final_list = load_requested_data.grabed_data;
				break;
			}
			case 8:{
				jurisdiction = getJurisdiction();
				load_requested_data.grabJurisdiction(jurisdiction);
				final_list = load_requested_data.grabed_data;
				break;
			}
			default:{
				final_list.add("Bad Selection");
				break;
			}
		}//switch
		
		
	}//getData()
	
	public int pickHomeCriteria() 
	{
		System.out.println("Please choose a home criteria:\r\n" + "and enter its number." + "\n1) Style\n2) Number Of Bedrooms\n3) Number Of Bathrooms\n4) Lot Size\n5) Age\n6) Price\n7) Distance From Work\n8) Jurisdiction");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//pickHomeCriteria()
	
	public int getStyle()
	{
		System.out.println("Please choose a Style:\n1) Colonial\n2) Condominium\n3) Georgian\n4) Townhouse\n5) Rambler\n6) Split Level\n7) Cape Cod");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getStyle
	
	public int getNumOfBedrooms() 
	{
		System.out.println("Please Enter Number of Bedrooms:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getNumberOfBedrooms()
	
	public int getNumOfBathrooms()
	{
		System.out.println("Please Enter Number of Bathrooms:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getNumberOfBathrooms()
	
	public float getLotSize()
	{
		System.out.println("Please Enter Lot Size:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextFloat());
	}//getLotSize()
	
	public int getAge()
	{
		System.out.println("Please Enter Age:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getAge()
	
	public int getPrice()
	{
		System.out.println("Please Choose Price Range:\n1) Under 100 Thousand\n2) 100 Thousand to 150 Thousand\n3 150 Thousand to 200 Thousand\n4) 200 Thousand to 300 Thousand\n5) 300 Thousand to 500 Thousand\n6) over 400 Thousand");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getPrice()
	
	public float getDistanceFromWork()
	{
		System.out.println("Please Enter Distance From Work:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextFloat());
	}//getDistanceFromWork()
	
	public int getJurisdiction()
	{
		System.out.println("Please Enter Jurisdiction:\n1) Alexandria\n2) Arlington\n3) Fairfax\n4) Falls Church\n5) District of Columbia");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}//getJurisdiction()
	
	
}















/*import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class RealEstateAgent //*** this is the largest class
{
	//*** ArrayLists that I used.
	//private ArrayList<Agency> agencyArray = new ArrayList<Agency>();	
	//private ArrayList<RealEstateListing> listingsFromOneAgency = new ArrayList<RealEstateListing>();
	//private ArrayList<RealEstateListing> finalArrayListOfRealEstateListings = new ArrayList<RealEstateListing>();
	//private String answerSoFar = "";
	//private Agency century21 = null;
	//private Agency reMax = null;
	//private Agency mcEnearney = null;
	//private Agency longAndFoster = null;

	public RealEstateAgent() throws IOException
	{	
      /* Create real-estate companies here.  
       Give them a name and pass in their text file. 
       Here is the code.*/
   /*    century21 = new Agency("Century 21","/EstateAgent/src/Century 21 Real-Estate Comapny.txt");
       reMax = new Agency("ReMax","/EstateAgent/src/ReMax Real-Estate Company.txt");
       mcEnearney = new Agency("McEnearney","/EstateAgent/src/McEnearney Real-Estate Company.txt");
       longAndFoster = new Agency("Long & Foster","/EstateAgent/src/Long & Foster Real-Estate Comapny.txt");
	}
	public String listingsChosen()
	{
		answerSoFar = getAgenciesForTheExhibition();
		int homeCriterion = pickHomeCriterion();
		switch (homeCriterion)
		{
		case 1:// Style
			int style = getStyle();
			finalArrayListOfRealEstateListings = style(style, agencyArray);
			break;
		
		case 2://Number of Bedrooms
			int numOfBedrooms = getNumOfBedrooms();
			finalArrayListOfRealEstateListings = bedrooms(numOfBedrooms, agencyArray);
			break;
			
		case 3://Number of Bathrooms
			int numOfBathrooms = getNumOfBathrooms();
			finalArrayListOfRealEstateListings = bathrooms(numOfBathrooms, agencyArray);
			break;
			
		case 4://Lot Size
			float lotSize = getLotSize();
			finalArrayListOfRealEstateListings = lotSize(lotSize, agencyArray);
			break;
			
		case 5://Age
			int age = getAge();
			finalArrayListOfRealEstateListings = age(age, agencyArray);
			break;
			
		case 6://Price
			int price = getPrice();
			finalArrayListOfRealEstateListings = price(price, agencyArray);
			break;
			
		case 7://Distance From Work
			float distanceFromWork = getDistanceFromWork();
			finalArrayListOfRealEstateListings = distance(distanceFromWork, agencyArray);
			break;
			
		case 8://Jurisdiction	
			int jurisdiction = getJurisdiction();
			finalArrayListOfRealEstateListings = jurisdiction(jurisdiction, agencyArray);
			break;
			
		default:
			System.out.println("bad topic Selection choice " + homeCriterion);
			System.exit(0);
		}// switch
	//*** I have a method that creates a string of the agencies used.
	//*** I have a method that takes the final list of homes  
	//*** and puts them in a string that is returned. 

	}
	public int getStyle()
	{
		System.out.println("Please choose a Style:\n1) Colonial\n2) Condominium\3) Georgian\n4) Townhouse\n5) Rambler\n6) Split Level\n7) Cape Cod");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> style(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public int getNumOfBedrooms() 
	{
		System.out.println("Please Enter Number of Bedrooms:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> bedrooms(int numberOfBedrooms, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public int getNumOfBathrooms()
	{
		System.out.println("Please Enter Number of Bathrooms:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> bathrooms(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public float getLotSize()
	{
		System.out.println("Please Enter Lot Size:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextFloat());
	}
	public ArrayList<RealEstateListing> lotSize(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public int getAge()
	{
		System.out.println("Please Enter Age:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> age(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public int getPrice()
	{
		System.out.println("Please Choose Price Range:\n1) Under 100 Thousand\n2) 100 Thousand to 150 Thousand\n3 150 Thousand to 200 Thousand\n4) 200 Thousand to 300 Thousand\n5) 300 Thousand to 500 Thousand\n6) over 400 Thousand");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> price(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public float getDistanceFromWork()
	{
		System.out.println("Please Enter Distance From Work:");
		Scanner scan = new Scanner(System.in);
		return (scan.nextFloat());
	}
	public ArrayList<RealEstateListing> distance(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}
	
	public int getJurisdiction()
	{
		System.out.println("Please Enter Jurisdiction:\n1) Alexandria\n2) Arlington\n3) Fairfax\n4) Falls Church\n5) District of Columbia");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	public ArrayList<RealEstateListing> jusrisdiction(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}

       //*** For each criteria there are similar pairs of methods.	
	//*** Work on each pair one pair at a time and make them 
       //*** work before you do the next pair.
	
	public String getAgenciesForTheExhibition() 
	{
		System.out.println("Select Agencies:\n1) Century 21\n2) ReMax\n3) McEnearney\n4) Long & Foster");
		Scanner scan = new Scanner(System.in);
		return (scan.nextLine());
	}
	
	
	public int pickHomeCriterion() 
	{
		System.out.println("Please Choose Home Criteria\n1) Style\n2) Number Of Bedrooms\n3) Number Of Bathrooms\n4) Lot Size\n5) Age\n6) Price\n7) Distance From Work\n8) Jurisdiction");
		Scanner scan = new Scanner(System.in);
		return (scan.nextInt());
	}
	
	
}*/