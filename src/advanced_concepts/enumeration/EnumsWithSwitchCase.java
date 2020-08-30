package advanced_concepts.enumeration;

enum Restaurants {
	dominos, kfc, pizzahut, lapinos, burgerking
}
public class EnumsWithSwitchCase {
	public static void main(String[] args) {
		Restaurants r;
		r = Restaurants.burgerking;
		switch(r) {
		case dominos:
			System.out.println("choice is : " + r.dominos);
			break;
		case kfc:
			System.out.println("choice is : " + r.kfc);
			break;
		case pizzahut:
			System.out.println("choice is : " + r.pizzahut);
			break;
		case lapinos:
			System.out.println("choice is : " + r.lapinos);
			break;
		case burgerking:
			System.out.println("choice is : " + r.burgerking);
			break;
		default:
			System.out.println("default : nothing selected from the choices");
		}
	}
}
