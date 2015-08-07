package pl.kfiatki.ppawluki;

import static pl.kfiatki.ppawluki.EnumPlants.CARROT;

public class Carrot extends Plants {
	private final int id = CARROT.ordinal();
	private final int growthTime = 2;
	private final int sellPrice = 1;
	private final int buyPrice = 1;
	private final int numberHarvest = 1;

	void print() {
		System.out.println("Siemanko! Jestem " + CARROT.toString()
				+ "\nMoje ID to: " + id + ",\nMój czas wzrostu to: "
				+ growthTime + " minut," + "\nSprzedasz mnie za: " + sellPrice
				+ " $$," + " a kupisz mnie za: " + buyPrice + " $$."
				+ "\nTo siê kalkuje w " + sellPrice * numberHarvest
				+ " $$ za jeden zbiór.");
	}
}
