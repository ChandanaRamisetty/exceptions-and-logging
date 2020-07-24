package task4.logging;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Houseconstruction {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		final Logger logger= LogManager.getLogger(Houseconstruction.class);
		logger.info("Provide required inputs for house construction:\n1:materials standard\ns or a or h\ns-standard materials as-above standard h-high standard");
		char st_materials = s.next().charAt(0);
		logger.info("Enter the squarefeet of house:");
		int sqft=s.nextInt();
		logger.info("Enter whether fully automated house or not\ny-if yes n-if no");
		char fully_automated_or_not = s.next().charAt(0);
		Client c=new Client();
		c.housePrice(st_materials,sqft,fully_automated_or_not);	
	}
}
