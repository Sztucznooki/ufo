package pl.kfiatki.ppawluki;

public abstract class Plants {
	private int id;
	private int growthTime;
	private int sellPrice;
	private int buyPrice;
	private int numberHarvest;
	
	public int getId() {
		return id;
	}

	public int getGrowthTime() {
		return growthTime;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public int getNumberHarvest() {
		return numberHarvest;
	}

	abstract void print();
}
