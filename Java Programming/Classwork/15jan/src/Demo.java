import java.util.HashMap;
import java.util.TreeMap;
class Player{
	int jersyNumber;
	String Name;
	int runs;
	@Override
	public String toString() {
		return "Player \n [jersyNumber=" + jersyNumber + ", Name=" + Name + ", runs=" + runs + "]\n";
	}
	Player(int jersyNumber, String name, int runs) {
		super();
		this.jersyNumber = jersyNumber;
		Name = name;
		this.runs = runs;
	}
}
public class Demo {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
         TreeMap tm= new TreeMap();
         tm.put(new MyKey(111), new Player(10,"Sachin",100));
         tm.put(new MyKey(101), new Player(7,"Dhoni",99));
         tm.put(new MyKey(16), new Player(18,"virta",98));
         System.out.println(tm);
	}
public static void main(String[] args) {
	HashMap<MyKey,Player> hm=new HashMap<Player>();
	hm.put(new MyKey(10), new Player(10,"Sachin",2002));
	hm.put(new MyKey(7), new Player(10,"Dhoni",2000));
	
}
}

