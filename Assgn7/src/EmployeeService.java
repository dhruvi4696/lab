import java.util.HashMap;
import java.util.Collection;
public class EmployeeService 
{	
	public static void main(String[] args) 
	{
	HashMap<String,EmployeeDetails> map = new HashMap<String,EmployeeDetails>();
	EmployeeDetails e1 = new EmployeeDetails(2001, "john",9000.0F,"Manager");
	EmployeeDetails e2 = new EmployeeDetails(2003, "radha",8000.0F,"System Associate");
	EmployeeDetails e3 = new EmployeeDetails(2002, "amar",49000.0F,"Manager");
	EmployeeDetails e4 = new EmployeeDetails(2004, "mala",6700.0F,"Manager");
	
	map.put("1",e1);
	map.put("2", e2);
	map.put("3", e3);
	map.put("3", e4);
	
	Collection<EmployeeDetails> c= map.values();
	c.forEach(p->System.out.println(p.getEmpId()+" "+p.getEmpName()+" "+p.getEmpSal()+" "+p.getEmpDesign()));
	
	System.out.println("\n");
	c.remove(e3);
	c.forEach(p->System.out.println(p.getEmpId()));
	
	
	}
}
