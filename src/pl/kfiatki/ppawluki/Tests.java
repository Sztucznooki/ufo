/**
 * 
 */
package pl.kfiatki.ppawluki;

import static org.junit.Assert.fail;

/**
 * @author ppawluki
 *
 */
public class Tests {

/*================================================
 *============== Upgrades section  ===============
 *================================================*/
	
	
	@org.junit.Test
	public void addUpgrades() {
		fail("Not yet implemented");
	}
	
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
		fail("Not yet implemented");
	}
	
/*================================================
 *============== Monsters section  ===============
 *================================================*/
	
	@org.junit.Test
	public void addMonster() {
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void deleteMonster(){
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void spawnBoss(){
		fail("Not yet implemented");
	}
		
	/*Should:
	- increase dna; 			- increase monsterKills;
	- increase dnaTotal;		- recalculate level;
	- increase dnaOverall;		- recalculate stage;
	 */
	@org.junit.Test
	public void killMonster(){
		fail("Not yet implemented");
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
