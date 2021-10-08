package builder;


public class ToothPasteBuilderDemo {

	public static void main(String[] args) {

		ToothPasteStateKeeper toothPaste = new ToothPasteStateKeeper();

		System.out.println(toothPaste);

		toothPaste.applyBrush();
		toothPaste.removePlague();
		toothPaste.removeTar();

		toothPaste.relieveSensitivity();
		toothPaste.cleanTeeth();
		toothPaste.polishTeeth();
		toothPaste.removeTar();



 



		System.out.println(toothPaste);


	}

}
