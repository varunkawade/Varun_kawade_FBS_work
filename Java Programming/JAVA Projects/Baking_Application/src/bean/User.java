package bean;

import java.util.Objects;

public class User 
{
	int accNo;
	String accType;
	float accbalance;
	
	
	public User(String accType, float accbalance) 
	{
		
		this.accType = accType;
		this.accbalance = accbalance;
	}
	public User(int accNo, String accType, float accbalance)
	{
	    this.accNo = accNo;
	    this.accType = accType;
	    this.accbalance = accbalance;
	}
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getAccbalance() {
		return accbalance;
	}

	public void setAccSal(float accbalance) {
		this.accbalance = accbalance;
	}

	public String toString() {
		
		return ("\n "+ "accNo=" + accNo + "\n "+
				"\n "+ "accType=" + accType +  "\n "+
				"\n "+ "accbalance=" + accbalance );
	}

	
	public int hashCode() {
		return Objects.hash(accNo, accbalance, accType);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return accNo == other.accNo && Float.floatToIntBits(accbalance) == Float.floatToIntBits(other.accbalance)
				&& Objects.equals(accType, other.accType);
	}
		
	
	
}
