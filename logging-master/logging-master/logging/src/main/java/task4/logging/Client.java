package task4.logging;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Client {
	final Logger logger= LogManager.getLogger(Client.class);
	public void housePrice(char st_materials,int sqft,char fully_automated_or_not)
	{
		float result=1;
	    char materials=st_materials;
		int square_feet=sqft;
		char automation=fully_automated_or_not;
		if(materials=='s')
		{
			if(automation=='n')
			{
			result=1200*square_feet;
			}
		}
		else if(materials=='a')
		{
			if(automation=='n')
			{
			result=1500*square_feet;
			}
		}
		else if(materials=='h')
		{
			if(automation=='n')
			{
			result=1800*square_feet;
			}
			else if(automation=='y')
			{
				result=2500*square_feet;
			}
		}
		logger.info("THE PRICE FOR CONSTRUCTING THE HOUES WITH THE MENTIONED SPECIFICATIONS IS:"+result);
	}
}
