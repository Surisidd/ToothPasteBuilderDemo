package builder;

public class ColgateToothPasteBuilder extends ToothPasteBuilder {

	public ColgateToothPasteBuilder() {
		this.name = "Colgate toothpaste";
	}
	public  ToothPasteBuilder addTriclosan() {
		this.ingredients.add("Triclosan");
		return this;
	}
	public  ToothPasteBuilder addSodiumFlouride() {
		this.ingredients.add("Sodium Flouride");
		return this;
	}
	public ToothPasteBuilder addlaurySulphate() {
		this.ingredients.add("LaurylSulphate");
		return this;
	}
	public ToothPasteBuilder addSilica() {
		//this.ingredients.add("Silica");
		return this;
	}
	public  ToothPasteBuilder addGlycerine() {
		//this.ingredients.add("Glycerine");
		return this;
	}
	public ToothPasteBuilder addSorbitol() {
		//this.ingredients.add("Sorbitol");
		return this;
	}

}
