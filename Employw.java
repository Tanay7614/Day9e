package sampleE;


public class Employw {
		
		private final int isFullTime=2;
		private final int isPartTime=1;
		private final String company;
		private final int Working_days;
		private final int  Wage_per_hour;
		private int part_time=4;
		int daily_wage;
		int total_month_wage=0;
	   public Employw(String company,int Working_days, int Wage_per_hour)
	    {
	  	this.company=company;
	    this.Working_days= Working_days;
	    this.Wage_per_hour=Wage_per_hour;
	   }
	  private int calculate_month_wage_company(){
	    for(int day=1; day<= Working_days;day++)
	    { 	
		   int ran=(int) Math.floor(Math.random()*10)%3;
		   switch(ran)
		   {
		        case isPartTime : 
		            daily_wage=Wage_per_hour*part_time;
		            total_month_wage=total_month_wage +daily_wage;
		            System.out.println("Employ part time wage="+daily_wage);
		        	break;
		        case isFullTime :
		        	daily_wage=Wage_per_hour*(part_time* isFullTime);
		        	System.out.println("Employ fulltime wage="+ daily_wage);
		        	total_month_wage=total_month_wage +daily_wage;
		        	break;
		        default:
		        	System.out.println("Employed is absent");
		   }
		  
	    }
	   return total_month_wage;
	    }
		
		public static void main(String[] args) {
				
		  
			Employw emp = new Employw("reliance",2,20);
			
			int total_month_wage=emp.calculate_month_wage_company();
			
			System.out.println("Total month wage of "+emp.company+" is "+total_month_wage);
			Employw d = new Employw("demart",2,20);
		    total_month_wage=emp.calculate_month_wage_company();
		    System.out.println("Total month wage of "+d.company+" is "+total_month_wage);
			
			//System.out.println("Total month wage of reliance="+Monthwage);
			
			
	}
	}
