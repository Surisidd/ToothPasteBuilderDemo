package builder;
import java.util.*;
public abstract class ToothPasteBuilder {

	String name;
	List<String> ingredients = new ArrayList<String>();

	public abstract ToothPasteBuilder addTriclosan();
	public abstract ToothPasteBuilder addSodiumFlouride();
	public abstract ToothPasteBuilder addlaurySulphate();
	public abstract ToothPasteBuilder addSilica();
	public abstract ToothPasteBuilder addGlycerine();
	public abstract ToothPasteBuilder addSorbitol();

	public ToothPaste build() {
		ToothPaste toothPaste = new ToothPaste();
		toothPaste.setName(this.name);
		toothPaste.addIngredients(ingredients);
		return toothPaste;
	}


}
