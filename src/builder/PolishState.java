package builder;



public class PolishState implements State {
	ToothPasteStateKeeper toothPaste;
	public PolishState(ToothPasteStateKeeper toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("Tooth Paste on brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Plague removed");

	}

	@Override
	public void removeTar() {
		System.out.println("Tar removed");

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Sensitivity eased");

	}

	@Override
	public void cleanTeeth() {
		System.out.println("Teeth cleaned");

	}

	@Override
	public void polishTeeth() {
		System.out.println("Teeth Polished");


		ToothPasteBuilder colgateBuilder = new ColgateToothPasteBuilder();
		ToothPaste colgate = colgateBuilder
				.addGlycerine()
				.addlaurySulphate()
				.addSilica()
				.addSodiumFlouride()
				.addSorbitol()
				.addTriclosan()
				.build();

		colgate.prepare();
		colgate.weigh();
		colgate.mix();
		colgate.fillTubes();
		colgate.pack();


		System.out.println(colgate);
	}
	public String toString() {
		return " polishing teeth state";
	}

}
