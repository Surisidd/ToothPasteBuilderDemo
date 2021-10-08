package builder;

public class SensodyneToothPasteBuilder extends ToothPasteBuilder {

	public SensodyneToothPasteBuilder() {
		this.name = "Sensodyne toothpaste";
	}
	public  ToothPasteBuilder addTriclosan() {
		//this.ingredients.add("Triclosan");
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
		this.ingredients.add("Silica");
		return this;
	}
	public  ToothPasteBuilder addGlycerine() {
		this.ingredients.add("Glycerine");
		return this;
	}
	public ToothPasteBuilder addSorbitol() {
		//this.ingredients.add("Sorbitol");
		return this;
	}

}