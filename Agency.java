import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agency //load files in ArrayList
{	
	public ArrayList<String> list = new ArrayList<String>();
	
	Agency(String file_path) throws FileNotFoundException{
		if(file_path!=null) {
			Scanner scan = new Scanner(new File(file_path));
			while (scan.hasNextLine()){
			    this.list.add(scan.nextLine());
			}
			scan.close();
			this.list.remove(0);
			for(int i=0; i<this.list.size(); i+=8) {
				this.list.remove(i);
			}
		}
			
		else
			this.list.add("Wrong Selection");
			
		}
	}
	









/*import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Agency
{
	private String agency;
	private ArrayList<RealEstateListing> realEstateListingArray = new ArrayList<RealEstateListing>();
	RealEstateListing list = new RealEstateListing();
	public Agency(String agency, String agencyFile)
	{
	//***	Constructor reads its file into an ArrayList
	//*** don’t forget to close the Scanner
//*** Here is the code to read a file
		this.agency = agency; 
		Scanner scanAgencyFile = new Scanner(new File(agencyFile));
	//Scanner scanAgencyFile = TextFileIO.createTextRead(agencyFile);
		readFile(scanAgencyFile);
		scanAgencyFile.close();
       }
	public void readFile(Scanner read)
	{	
		list.readRealEstateListing(read);
	}
	
	//*** The first number in the file is the number of listings.
	//*** This sets the for loop
	//***	A RealEstateListing can read itself. 		
	
		
	public ArrayList<RealEstateListing> style(String desiredStyle)
	{
	//*** Creates an ArrayList of for this criteria. 	
	//*** Each criteria creates a list.	
	}*/