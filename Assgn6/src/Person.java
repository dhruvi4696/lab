
class InvalidNameException extends Exception{
	InvalidNameException()
	{
		System.out.println("Provide a valid name");
	}
}

public class Person {
	String firstName;
	String lastName;
	char gender;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String mergeName() throws InvalidNameException{
		if((firstName.equals(""))&&(lastName.equals("")))
		{
			System.out.println("\nfull name: "+""+"\nfullname can not be blank!");
			throw new InvalidNameException();
		}
		else
		{
		return ("Full Name: "+firstName+" "+lastName);
		}
	}
	
	public String dispPerDetails()
	{
		return "\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nGender: "+gender;
	}

}
