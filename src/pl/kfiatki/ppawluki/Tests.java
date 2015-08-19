/**
 * 
 */
package pl.kfiatki.ppawluki;

import static org.junit.Assert.fail;
import java.math.BigInteger;

/**
 * @author ppawluki
 *
 */
public class Tests {

/*================================================
 *============== Upgrades section  ===============
 *================================================*/
	
	@org.junit.Test
	public void deleteUpgrades(){
		fail("Not yet implemented");
	}
	
	/*Buys an upgrade. Should:
	- subtract dna; 			- recalculate local dnaPs;
	- increase upgrade count;	- recalculate global dnaPS;
	 */
	@org.junit.Test
	public void buyUpgrades() {
		Game g = new Game();
		g.setDna(BigInteger.valueOf(1000000));
		g.buyUpgrade(EnumUpgrades.EIGHT);
		g.buyUpgrade(EnumUpgrades.FIRST);
	}
	
/*================================================
 *============== Monsters section  ===============
 *================================================*/
	
	@org.junit.Test
	public void addMonster() {
		Game g = new Game();
		System.out.println("First monster\n");
		g.setLevel(22);
		Game.Monster m = g.spawnMonster();
		System.out.println("Progress: "+m.getProgress()+
							"\nGold: "+m.getGold().toString()+
							"\nname: "+m.getName());
		System.out.println("Progress: "+g.formatString(m.getProgress())+
				"\nGold: "+g.formatString(m.getGold())+
				"\nname: "+m.getName());

		System.out.println("\nSecond monster\n");
		g.setLevel(222);
		m = g.spawnMonster();
		System.out.println("Progress: "+g.formatString(m.getProgress())+
							"\nGold: "+g.formatString(m.getGold())+
							"\nname: "+m.getName());
	}
	
	@org.junit.Test
	public void deleteMonster(){
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void spawnBoss(){
		Game g = new Game();
		g.setLevel(25);
		Game.Monster m = g.spawnMonster();
		if(!m.isBoss()) fail("Nie jest bossem");
		g.setLevel(222);
		m = g.spawnMonster();
		if(m.isBoss()) fail("Jest bossem a nie powinien");

	}
		
	/*Should:
	- increase dna; 			- increase monsterKills;
	- increase dnaTotal;		- recalculate level;
	- increase dnaOverall;		- recalculate stage;
	 */
	@org.junit.Test
	public void scanMonster(){
		Game g = new Game();
		g.setLevel(25);
		
		g.setDnaPs(BigInteger.valueOf(100000000));
		Game.Monster m = g.spawnMonster();
		g.scanMonster();
		System.out.println(m.toString()+"\nZ kolei dna = "+g.getDna().toString());
		
		g.setDnaPs(BigInteger.valueOf(710));
		m = g.spawnMonster();
		g.scanMonster();
	}
	
	/*Should:
	- like above;
	- increase greyCells;	 
	 */
	@org.junit.Test
	public void killBoss(){
		fail("Not yet implemented");
	}

/*================================================
 *================ Miscellaneous  ================
 *================================================*/

	/*Should:
	- reset all world-lifespan variables to default;
	- increase amount of greyCells;
	 */
	@org.junit.Test
	public void resetGame(){
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void hardResetGame(){
		fail("Not yet implemented");
	}
	
}
