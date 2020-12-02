
public class main {

	public static void main(String[] args) {
		CakeFactory cakeFactory = new CakeFactory();
		CakeStore store = new CakeStore(cakeFactory);
		
		Cake cake1 = store.onlineOrder("lemon");
		System.out.println("\n");
		Cake cake2 = store.onlineOrder("chocolate");
		System.out.println("\n");
		Cake cake3 = store.onlineOrder("Vanilla");
		System.out.println("\n");
		
		System.out.println("Completed order: " + cake1.getName());
		System.out.println("Completed order: " + cake2.getName());
		System.out.println("Completed order: " + cake3.getName());
	}

}
