package p1;

public class voter {
	int age;
	public voter(int age) {
		this.age=age;
	}
public void validate() throws InvalidaAgeExcpetion
{
	if (this.age<18) 
	{
		
			throw new InvalidaAgeExcpetion();
			
		
	}else {
		System.out.println("you Can Vote");
	}
}
}
