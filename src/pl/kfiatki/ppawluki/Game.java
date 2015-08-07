package pl.kfiatki.ppawluki;

import java.math.BigInteger;
import java.util.Date;

public class Game {

	private Date time;
	private Date fpsMeasure;
	private Integer accumulatedDelay = 0;
	private Integer catchupLogic = 0;

	private BigInteger dnaEarned = new BigInteger("0");// all cookies earned during gameplay
	private BigInteger dna = new BigInteger("0");// cookies
	private BigInteger dnaDisplay = new BigInteger("0");// cookies display
	private BigInteger dnaPs = new BigInteger("0");// cookies per second (to recalculate with every new purchase)
	private BigInteger dnaReset = new BigInteger("0");// cookies lost to resetting
	private BigInteger ufoClicks = new BigInteger("0");// +1 for each click on the UFO (this game only)
	private BigInteger supportClicks = new BigInteger("0");// +1 for each support UFO clicked (time)
	private BigInteger supportClicksLocal = new BigInteger("0");// +1 for each support UFOclicked (this game only)
	private BigInteger missedSupportClicks = new BigInteger("0");// +1 for eachsupportUFOmissed
	private BigInteger handmadeDna = new BigInteger("0");// all the dna takenfrom clicking the UFO
	private BigInteger greyCells = new BigInteger("0");// multiplier, saves after reset
	private BigInteger resets = new BigInteger("0");// reset counter
	private String bg = new String("");// background (grandmas and such)
	private boolean bgFade = false;// fading to background
	private BigInteger bgR = new BigInteger("0");// ratio (0 - not faded, 1 - fully faded)
	private BigInteger bgRd = new BigInteger("0");// ratio displayed
	private Date startDate;
	private Date fullDate;
	private Date lastDate; // last save date
	private Integer level;

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

		public void setPrice(BigInteger price) {
			this.price = price;
		}

		public BigInteger getCost() {
			return cost;
		}

		public void setCost(BigInteger cost) {
			this.cost = cost;
		}

		public BigInteger getDamage() {
			return damage;
		}

		public void setDamage(BigInteger damage) {
			this.damage = damage;
		}

		public BigInteger getDamagePs() {
			return damagePs;
		}

		public void setDamagePs(BigInteger damage, Integer count) {
			this.damagePs = damage.multiply(BigInteger.valueOf(count.intValue()));
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getFpsMeasure() {
		return fpsMeasure;
	}

	public void setFpsMeasure(Date fpsMeasure) {
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

	public BigInteger getDnaDisplay() {
		return dnaDisplay;
	}

	public void setDnaDisplay(BigInteger dnaDisplay) {
		this.dnaDisplay = dnaDisplay;
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

	// private BigInteger frenzy=0;//as long as >0, cookie production is
	// multiplied by frenzyPower
	// private Integer frenzyMax=0;//how high was our initial burst
	// private Integer frenzyPower=1;
	// private Integer clickFrenzy=0;//as long as >0, mouse clicks get 777x more
	// cookies
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
	// private Integer cookiesSucked=0;//cookies sucked by wrinklers
	// private Integer cpsSucked=0;//percent of CpS being sucked by wrinklers
	// private Integer wrinklersPopped=0;
	// private Integer santaLevel=0;
	// private Integer reindeerClicked=0;
	// private Integer seasonT=0;
	// private Integer seasonUses=0;

}
