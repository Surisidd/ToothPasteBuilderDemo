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



//		System.out.println(toothPaste);
//
//
//		toothPaste = new ToothPasteStateKeeper();
//
//		System.out.println(toothPaste);
//
//		toothPaste.applyBrush();
//
//		toothPaste.polishTeeth();
//		toothPaste.removeTar();
//		toothPaste.relieveSensitivity();
//		toothPaste.cleanTeeth();
//
//		toothPaste.removePlague();
//		toothPaste.removeTar();
//		toothPaste.cleanTeeth();
//		toothPaste.relieveSensitivity();
//		toothPaste.cleanTeeth();
//



		System.out.println(toothPaste);


	}

}
