import java.util.ArrayList;

public class RealEstateListing //get ArrayList to grab data
{
	public ArrayList<String> grabed_data = new ArrayList<String>();
	private ArrayList<String> data_list = new ArrayList<String>();

	RealEstateListing(ArrayList<String> loaded_files)
	{
		data_list = loaded_files;
	}
	
	public void grabStyles(int style)
	{
		String search_style = null;
		switch(style) {
			case 1:{
				search_style = "Colonial";
				break;
			}
			case 2:{
				search_style = "Condominium";
				break;
			}
			case 3:{
				search_style = "Georgian";
				break;
			}
			case 4:{
				search_style = "Townhouse";
				break;
			}
			case 5:{
				search_style = "Rambler";
				break;
			}
			case 6:{
				search_style = "Split Level";
				break;
			}
			case 7:{
				search_style = "Cape Cod";
				break;
			}
			
			default:{
				grabed_data.add("bad topic Selection choice");
				break;
			}
		}//switch
		
		int i=0;
		while(i<data_list.size() && search_style!=null)
		{
			if(data_list.get(i).equalsIgnoreCase(search_style))
			{
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
			}
			else
				i+=8;
		}//while
	}//grabStyle()
	
	public void grabNumOfBedroom(int number)
	{
		
		int i=1;
		while(i<data_list.size() && number!=0)
		{
			if(Integer.parseInt(data_list.get(i))==number)
			{
				i-=1;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i++;
			}
			else
				i+=8;
		}//while
	}//grabNumOfBedroom()
	
	public void grabNumOfBathroom(int number)
	{
		
		int i=2;
		while(i<data_list.size() && number!=0)
		{
			if((int)Float.parseFloat(data_list.get(i))==number)
			{
				i-=2;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=2;
			}
			else
				i+=8;
		}//while
	}//grabNumOfBedroom()
		
	public void grabLotSize(float size)
	{
		int i=3;
		while(i<data_list.size() && size!=0)
		{
			if((int)Float.parseFloat(data_list.get(i))==size)
			{
				i-=3;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=3;
			}
			else
				i+=8;
		}//while
	}//grabLotSize()
	
	public void grabAge(int age)
	{
		int i=4;
		while(i<data_list.size() && age!=0)
		{
			if((int)Float.parseFloat(data_list.get(i))==age)
			{
				i-=4;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=4;
			}
			else
				i+=8;
		}//while	
	}//grabAge()
	
	public void grabPrice(int price)
	{
		int lb=0,ub=0;
		switch(price) {
		case 1:{
			lb=0;
			ub=100;
			break;
		}
		case 2:{
			lb=100;
			ub=150;
			break;
		}
		case 3:{
			lb=150;
			ub=200;
			break;
		}
		case 4:{
			lb=200;
			ub=300;
			break;
		}
		case 5:{
			lb=300;
			ub=400;
			break;
		}
		case 6:{
			lb=400;
			ub=0;
			break;
		}
		
		default:{
			grabed_data.add("Bad Selection");
			break;
		}
		}//switch
		
		int i=5;
		while(i<data_list.size() && (ub+lb)!=0)
		{
			if((int)Float.parseFloat(data_list.get(i))>=lb && (int)Float.parseFloat(data_list.get(i))<=ub)
			{
				i-=5;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=5;
			}
			else
				i+=8;
		}//while
		
	}//grabPrice();
	
	public void grabDistance(float distance)
	{
		int i=6;
		while(i<data_list.size())
		{
			if((int)Float.parseFloat(data_list.get(i))==(int)distance)
			{
				i-=6;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=6;
			}
			else
				i+=8;
		}//while
	}//grabDistance()
	
	public void grabJurisdiction(int jurisdiction)
	{
		String find_jurisdiction=null;
		switch(jurisdiction) {
		case 1:{
			find_jurisdiction = "Alexandria";
			break;
		}
		case 2:{
			find_jurisdiction = "Arlington";
			break;
		}
		case 3:{
			find_jurisdiction = "FairFax";
			break;
		}
		case 4:{
			find_jurisdiction = "Falls Church";
			break;
		}
		case 5:{
			find_jurisdiction = "District of columbia";
			break;
		}
		
		default:{
			break;
		}
		}//switch
		
		int i=7;
		while(i<data_list.size() && find_jurisdiction!=null)
		{
			if(data_list.get(i).equalsIgnoreCase(find_jurisdiction))
			{
				i-=7;
				int j=i+8;
				while(i<j) {
					grabed_data.add(data_list.get(i));
					i++;
				}
				i+=7;
			}
			else
				i+=8;
		}//while
		
	}//grabJurisdiction()
}