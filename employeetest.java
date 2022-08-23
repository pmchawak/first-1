public class employeetest{
	public static void main(String[] args){
		employee emp = new employee();
		emp.setId(11);
		emp.setSalary(50000.00f);
		emp.setName("Atharva");
	
		System.out.println("Details are : ");
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		System.out.println(emp.getName());
	}
}