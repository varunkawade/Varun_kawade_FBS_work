
public class MyKey implements Comparable 
{
      int key;

	  MyKey(int key) {
		super();
		this.key = key;
	  }

	  @Override
	  public int compareTo(Object o) {
		// TODO Auto-generated method stub
		  MyKey mk=(MyKey)o;
		return this.key-mk.key;
	  }

	  @Override
	  public String toString() {
		return "" +this.key;
	  }
}
