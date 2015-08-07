package pl.kfiatki.ppawluki;

import java.math.BigInteger;
import java.util.Date;

public class Game {

	private Date time;
	private int fpsMeasure;
	private Integer accumulatedDelay ;
	private Integer catchupLogic;

	private BigInteger dnaEarned;// all dna earned during gameplay
	private BigInteger dnaOverall;
	private BigInteger dna;// dna
	private StringBuilder dnaDisplayString; // dna displayed as "1.2e34" etc
	private BigInteger dnaPs;// dna per second (to recalculate with every new purchase)
	private BigInteger dnaReset;// dna lost to resetting
	private BigInteger ufoClicks;// +1 for each click on the UFO (this game only)
	private BigInteger supportClicks;// +1 for each support UFO clicked (time)
	private BigInteger supportClicksLocal;// +1 for each support UFOclicked (this game only)
	private BigInteger missedSupportClicks;// +1 for eachsupportUFOmissed
	private BigInteger handmadeDna;// all the dna takenfrom clicking the UFO
	private BigInteger greyCells;// multiplier, saves after reset
	private BigInteger resets;// reset counter
	private String bg;// background (grandmas and such)
	private boolean bgFade;// fading to background
	private BigInteger bgR;// ratio (0 - not faded, 1 - fully faded)
	private BigInteger bgRd;// ratio displayed
	private Date startDate;
	private Date fullDate;
	private Date lastDate; // last save date
	private Integer level;
	
	private Upgrade upgrades[];
	
	
	public Game() {
		super();
		this.time = new Date();
		this.startDate = new Date();
		this.fullDate = new Date();
		this.lastDate = new Date();
		this.fpsMeasure = 30;
//		this.accumulatedDelay = accumulatedDelay;
//		this.catchupLogic = catchupLogic;
		this.dnaEarned = new BigInteger("0");
		this.dnaOverall = new BigInteger("0");
		this.dna = new BigInteger("0");
		this.dnaDisplayString = new StringBuilder("0");
		this.dnaPs = new BigInteger("0");
		this.dnaReset = new BigInteger("0");
		this.ufoClicks = new BigInteger("0");
		this.supportClicks = new BigInteger("0");
		this.supportClicksLocal = new BigInteger("0");
		this.missedSupportClicks = new BigInteger("0");
		this.handmadeDna = new BigInteger("0");
		this.greyCells = new BigInteger("0");
		this.resets = new BigInteger("0");
		this.bg = new String("0");
		this.bgFade = false;
		this.bgR = new BigInteger("0");
		this.bgRd = new BigInteger("0");
		this.level = 1;		
	}

	
	class Upgrade {
		private BigInteger price;
		private BigInteger cost;
		private BigInteger damage;
		private BigInteger damagePs;
		private String name;
		private Integer count;

		public BigInteger getPrice() {
			return price;
		}
	}

	class Monster {
		private BigInteger progress;
		private BigInteger gold;
		private String name;
		private boolean isBoss = false;
		// private Integer levelInterval; << zrobiæ z tego 2D listê monsterów i na ka¿dym poziomie monstery, ktore moga sie pojawic
		
		public BigInteger getProgress() {
			return progress;
		}

		public void setProgress(BigInteger progress) {
			this.progress = progress;
		}

		public BigInteger getGold() {
			return gold;
		}

		public void setGold(BigInteger gold) {
			this.gold = gold;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isBoss() {
			return isBoss;
		}

		public void setBoss(boolean isBoss) {
			this.isBoss = isBoss;
		}

	}

	public void formatDna(){
		if(this.dna.compareTo(BigInteger.valueOf(99999L)) == -1) return;
		StringBuilder number = new StringBuilder(this.dna.toString());
		dnaDisplayString = new StringBuilder(number.charAt(0)+"."+number.subSequence(1,3)+"e"+number.length());
	}
	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getFpsMeasure() {
		return fpsMeasure;
	}

	public void setFpsMeasure(int fpsMeasure) {
		this.fpsMeasure = fpsMeasure;
	}

	public Integer getAccumulatedDelay() {
		return accumulatedDelay;
	}

	public void setAccumulatedDelay(Integer accumulatedDelay) {
		this.accumulatedDelay = accumulatedDelay;
	}

	public Integer getCatchupLogic() {
		return catchupLogic;
	}

	public void setCatchupLogic(Integer catchupLogic) {
		this.catchupLogic = catchupLogic;
	}

	public BigInteger getDnaEarned() {
		return dnaEarned;
	}

	public void setDnaEarned(BigInteger dnaEarned) {
		this.dnaEarned = dnaEarned;
	}

	public BigInteger getDna() {
		return dna;
	}

	public void setDna(BigInteger dna) {
		this.dna = dna;
	}

	public StringBuilder getDnaDisplay() {
		return dnaDisplayString;
	}

	public void setDnaDisplay(StringBuilder dnaDisplay) {
		this.dnaDisplayString = dnaDisplay;
	}

	public BigInteger getDnaPs() {
		return dnaPs;
	}

	public void setDnaPs(BigInteger dnaPs) {
		this.dnaPs = dnaPs;
	}

	public BigInteger getDnaReset() {
		return dnaReset;
	}

	public void setDnaReset(BigInteger dnaReset) {
		this.dnaReset = dnaReset;
	}

	public BigInteger getUfoClicks() {
		return ufoClicks;
	}

	public void setUfoClicks(BigInteger ufoClicks) {
		this.ufoClicks = ufoClicks;
	}

	public BigInteger getSupportClicks() {
		return supportClicks;
	}

	public void setSupportClicks(BigInteger supportClicks) {
		this.supportClicks = supportClicks;
	}

	public BigInteger getSupportClicksLocal() {
		return supportClicksLocal;
	}

	public void setSupportClicksLocal(BigInteger supportClicksLocal) {
		this.supportClicksLocal = supportClicksLocal;
	}

	public BigInteger getMissedSupportClicks() {
		return missedSupportClicks;
	}

	public void setMissedSupportClicks(BigInteger missedSupportClicks) {
		this.missedSupportClicks = missedSupportClicks;
	}

	public BigInteger getHandmadeDna() {
		return handmadeDna;
	}

	public void setHandmadeDna(BigInteger handmadeDna) {
		this.handmadeDna = handmadeDna;
	}

	public BigInteger getGreyCells() {
		return greyCells;
	}

	public void setGreyCells(BigInteger greyCells) {
		this.greyCells = greyCells;
	}

	public BigInteger getResets() {
		return resets;
	}

	public void setResets(BigInteger resets) {
		this.resets = resets;
	}

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}

	public boolean isBgFade() {
		return bgFade;
	}

	public void setBgFade(boolean bgFade) {
		this.bgFade = bgFade;
	}

	public BigInteger getBgR() {
		return bgR;
	}

	public void setBgR(BigInteger bgR) {
		this.bgR = bgR;
	}

	public BigInteger getBgRd() {
		return bgRd;
	}

	public void setBgRd(BigInteger bgRd) {
		this.bgRd = bgRd;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFullDate() {
		return fullDate;
	}

	public void setFullDate(Date fullDate) {
		this.fullDate = fullDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public BigInteger getDnaOverall() {
		return dnaOverall;
	}

	public void setDnaOverall(BigInteger dnaOverall) {
		this.dnaOverall = dnaOverall;
	}

	public StringBuilder getDnaDisplayString() {
		return dnaDisplayString;
	}

	public void setDnaDisplayString(StringBuilder dnaDisplayString) {
		this.dnaDisplayString = dnaDisplayString;
	}

	public Upgrade[] getUpgrades() {
		return upgrades;
	}

	public void setUpgrades(Upgrade[] upgrades) {
		this.upgrades = upgrades;
	}

	// private BigInteger frenzy=0;//as long as >0, cookie production is
	// multiplied by frenzyPower
	// private Integer frenzyMax=0;//how high was our initial burst
	// private Integer frenzyPower=1;
	// private Integer clickFrenzy=0;//as long as >0, mouse clicks get 777x more
	// dna
	// private Integer clickFrenzyMax=0;//how high was our initial burst
	// private Integer milkProgress=0;//you gain a little bit for each achievement.
	// Each increment of 1 is a different milk displayed.
	// private Integer milkH = milkProgress/2;//milk height, between 0 and 1
	// (although should never go above 0.5)
	// private Integer milkHd=0;//milk height display
	// private Integer milkType=-1;//custom milk : 0=plain, 1=chocolate...
	// private Integer backgroundType=-1;//custom background : 0=blue, 1=red...
	// private Integer elderWrath=0;
	// private Integer elderWrathOld=0;
	// private Integer elderWrathD=0;
	// private Integer pledges=0;
	// private Integer pledgeT=0;
	// private Integer researchT=0;
	// private Integer nextResearch=0;
	// private Integer dnaSucked=0;//dna sucked by wrinklers
	// private Integer cpsSucked=0;//percent of CpS being sucked by wrinklers
	// private Integer wrinklersPopped=0;
	// private Integer santaLevel=0;
	// private Integer reindeerClicked=0;
	// private Integer seasonT=0;
	// private Integer seasonUses=0;

}
