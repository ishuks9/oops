public class EmployeeWage{
        public static final int is_Part_Time = 1;
        public static final int is_Full_Time = 2;
	public static final int no_of_workingDays = 20;
	public static final int Max_hrs = 100;
	public int Calculate(){
		System.out.println("Employee screen displays here!!!");
		int totalEmpWage = 0;
		int wagePerhr = 20;
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
	        while(totalEmpHrs <= Max_hrs && totalWorkingDays < no_of_workingDays){
			totalWorkingDays++;
			int check =(int) Math.floor(Math.random()*10)%3;
			switch(check){
			case(is_Part_Time):
				empHrs = 4;
				break;
			case(is_Full_Time):
				empHrs = 8;
				break;
			default :
				empHrs = 0;
			}
			
			totalEmpHrs += empHrs;
	                System.out.println("Days: "+totalWorkingDays + " Emp Hrs: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * wagePerhr;
		System.out.println("Total EmpWage: "+totalEmpWage);
		return totalEmpWage;
	}
}
