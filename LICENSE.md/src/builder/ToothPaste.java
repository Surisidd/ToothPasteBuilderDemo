package builder;
import java.util.*;
public class ToothPaste {

	String name;
	List<String> ingredients;
	public void addIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Tooth paste ingredients");
		for(String ingredient : ingredients) {
			System.out.println("     " +  ingredient);
		}

	}
	void weigh() {
		System.out.println("Weigh the ingredients to ensure proporation");
	}
	void mix() {
		System.out.println("All ingredients are mixed together in a mixing vat");
	}
	void fillTubes() {
		System.out.println("After ingredients are mixed the toothpaste is filled by filling machine");
	}

	void pack() {
		System.out.println("Packaging " + name + " and shipping");
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();

		display.append("-----" + this.name + "-----");
		for(String ingredient: ingredients) {
			display.append(ingredient + "\n");
		}
		return display.toString();
	}
}
