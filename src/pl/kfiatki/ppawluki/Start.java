package pl.kfiatki.ppawluki;
import static pl.kfiatki.ppawluki.EnumPlants.*;

public class Start{

	public static void main(String[] args) {
		Field  poletko = new Field();
		poletko.setPatch(CARROT, 1, 1);
		Carrot carrot = new Carrot();
		poletko.printPatch();
		carrot.print();

	}

}
