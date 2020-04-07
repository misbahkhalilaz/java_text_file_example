import java.io.IOException;
import java.util.Scanner;
public class CreateHomeListMain
{
	public static void main(String[] args) throws IOException
	{
		
		//RealEstateAgent myAgent = new RealEstateAgent();
		Scanner scan = new Scanner(System.in);
		System.out.println("I am a Real Estate Agent. I can create a list of homes for sale.\r\n" + "Would you like to create such a list?");
		System.out.println("Enter yes or no:");
		String choice = scan.nextLine();
		while(choice.equalsIgnoreCase("yes"))
		{
			RealEstateAgent myAgent = new RealEstateAgent();
			myAgent.listingsChosen();
			System.out.println("\n\nThe list of realstate agencies used are:");
			
			for(String data:myAgent.loaded_files_names)
				System.out.println(data);
			//for(String data:myAgent.final_list)
				//System.out.println(data);
			if(myAgent.final_list.isEmpty())
			{
				System.out.println("\nRequested Data not Found\n");
			}
			else if(myAgent.final_list.size()==1) 
			{
				System.out.println(myAgent.final_list);
			}
			else {
				int i=0, j=1;
				System.out.println("\n\n");
				while(i<myAgent.final_list.size()) {
					System.out.println(j++ + ")\tStyle: " + myAgent.final_list.get(i++) + "\t\tBedrooms: " + myAgent.final_list.get(i++) + "\tBathrooms: " + myAgent.final_list.get(i++) + "\tLot Size: " + myAgent.final_list.get(i++) + " Square acre\n\tAge: " + myAgent.final_list.get(i++) + "\tPrice: $" + (int)Float.parseFloat(myAgent.final_list.get(i++)) + ",000.00 " + "\tDistance: " + myAgent.final_list.get(i++) + "\tJurisdiction: " + myAgent.final_list.get(i++) + "\n");
				}//while
				System.out.println("\n");
			}//else
			
			
			System.out.println("Would you like to create a new list");
			System.out.println("Enter yes or no.");
			choice = scan.nextLine();
		}// while
		System.out.println("Thank you for creating lists.");
	
	}
}