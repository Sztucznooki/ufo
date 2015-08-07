package pl.kfiatki.ppawluki;

public enum EnumPlants {
	WHEAT, CARROT, CABBAGE, RADDISH, TOMATOE, POTATOE;
	
	public String toString(){
		return name().charAt(0)+name().substring(1).toLowerCase();
	}
	
}
