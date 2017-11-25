import java.util.HashMap;

public class EmployeeDetails implements Comparable
{
	int empId;
	String empName;
	float empSal;
	String empDesign;
	
	public EmployeeDetails() 
	{
		super();
	}

	public EmployeeDetails(int empId, String empName, float empSal, String empDesign) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesign = empDesign;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}

	public String dispInfo() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", empDesign=" + empDesign + "]";
	}

	@Override
	public int compareTo(Object obj) 
	{
		EmployeeDetails emp= (EmployeeDetails) obj;
		int n=(int) (this.empSal-emp.empSal);
		return n;
	}


}
