import java.util.ArrayList;

public abstract class Cake {
	protected String name;
	protected String baseFlavor;
	protected ArrayList<String> Ingredients;
	
	public String getName() {
		return name;
	}
	
	public String getBaseFlavor() {
		return baseFlavor;
	}
	
	public String getIngredients() {
		String str = "";
		for (int i = 0; i < Ingredients.size(); i++) {
			str += "\n" + Ingredients.get(i);
		}
		
		return str;
	}
	
	public void prepare() {
		System.out.println("Preparing " + this.toString());
	}
	
	public void bake() {
		System.out.println("Baking " + this.toString());
	}
	
	public void box() {
		System.out.println("Boxing " + this.toString());
	}
	
	public String toString() {
		return name + " with a base flavor of " + baseFlavor;
	}
}
