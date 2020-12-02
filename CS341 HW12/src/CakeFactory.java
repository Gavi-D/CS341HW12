
public class CakeFactory {
	public Cake orderCake(String type) {
		if (type.equals("vanilla") || type.equals("Vanilla")) {
			return new VanillaCake();
		}
		
		else if (type.equals("chocolate") || type.equals("Chocolate")) {
			return new ChocolateCake();
		}
		
		else {
			return new LemonCake();
		}
	}
}
