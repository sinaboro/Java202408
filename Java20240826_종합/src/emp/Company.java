package emp;

public class Company {

	public static void main(String[] args) {
		
		Secretary secretary = new Secretary("Duke", 1, "Secretary", 800);
		Sales sales = new Sales("Tuxi", 2, "sales", 1200);
		
		Employee[] emp = {secretary, sales};			
		
		Company.printEmployee(emp, true);
		
		secretary.incentive(100);
		sales.incentive(100);
		Company.printEmployee(emp, false);
		
		
	}
	
	public static void printEmployee(Employee[] emps, boolean isTax ) {		
		
		if(isTax) {
			System.out.println("name     department        salary     extra pay");
			System.out.println("-----------------------------------------");
			
			for(Employee emp : emps) {
				System.out.printf("%s\t %8s\t %8d\t %.1f\n",
						emp.getName(), emp.getDepartment(), emp.getSalary(),emp.getExtraPay());				
			}
			
			System.out.println();
			
		}else {
			System.out.println("name     department          salary        tax            extra pay");
			System.out.println("-----------------------------------------");
			for(Employee emp : emps)
				System.out.printf("%s\t %8s\t %8d\t %8.1f\t %8.1f\n",
						emp.getName(), emp.getDepartment(),emp.getSalary(),emp.tax(),emp.getExtraPay());			
		}
	}

}
