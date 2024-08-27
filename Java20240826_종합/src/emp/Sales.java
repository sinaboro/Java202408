package emp;

public class Sales extends Employee implements Bonus{

	Sales() {}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	
	@Override
	public void incentive(int pay) {
		setSalary( (getSalary()+(int)(pay*1.2)));
	}

	@Override
	double tax() {
		return getSalary()*0.13;
	}

	double getExtraPay() {
		return getSalary()*0.03;
	}
}
