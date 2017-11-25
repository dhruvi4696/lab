

public class PersonMain{

	public static void main(String[] args) {
		try{
		Person perInfo=new Person("Dhruvi","Doshi",'F');
		Person perInfo1=new Person("","",'F');
		System.out.println(perInfo.mergeName());
		System.out.println(perInfo.dispPerDetails());
		
		System.out.println(perInfo1.mergeName());
		System.out.println(perInfo1.dispPerDetails());
		}
		catch(InvalidNameException in)
		{
			System.out.println(in);
		}
	}
}
	