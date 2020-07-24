package task4.logging;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Interest {
	final Logger logger = LogManager.getLogger(Interest.class);
	 public void simpleInterest(int p,int t,int r)
	 {
		 int principal=p;
		 int time=t;
		 int rate=r;
		 float simpleInterest;
		 simpleInterest=(principal*time*rate)/100;
		 logger.info("SIMPLE INTEREST FOR PRINCIPAL AMOUNT "+principal+" AT THE RATE "+rate+" FOR "+time+" YEARS IS "+simpleInterest);
		
	 }
	 public void compoundInterest(int pa,int n,float ra)
	 {
		 int principal_amount=pa;
		 int number_of_periods=n;
		 float rate=ra/100;
		 float compoundInterest;
		 float x=(float) Math.pow((1 + rate),number_of_periods);
		 //System.out.println("x:"+(x-1));
		 x=x-1;
		 x= principal_amount*(x);
		 //x=x-principal_amount;
		 compoundInterest=x;
		 logger.info("COMPOUND INTEREST FOR AMOUNT "+principal_amount+" AT THE RATE "+rate+" WHICH IS COMPOUNDED ANUALLY AT "+n+" TIMES IS "+compoundInterest);
	 }
}
