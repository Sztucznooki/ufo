package pl.kfiatki.ppawluki;

import java.util.Arrays;

public class Field {

	private int patch[][] = new int[3][3];

	public Field(int[][] patch) {
		super();
		this.patch = patch;
	}

	public Field() {
		super();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				patch[i][j] = -1;
			}
	}

	public void setPatch(int type, int x, int y) {
		patch[x][y] = type;
	}

	public void setPatch(EnumPlants type, int x, int y) {
		patch[x][y] = type.ordinal();
	}
	
	public int[][] getPatch() {
		return patch;
	}

	public int getSinglePatch(int x, int y) {
		return patch[x][y];
	}

	public void printPatch() {
		System.out.println(Arrays.deepToString(patch));
	}
	
	public void growPlant(Plants plant, int x, int y){
		
	}
	

}
