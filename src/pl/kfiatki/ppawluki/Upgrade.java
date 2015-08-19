package pl.kfiatki.ppawluki;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Upgrade {
	private BigInteger baseCost;
	private BigInteger cost;
	private BigInteger baseDamage; 
	private BigInteger damagePs;
	private String name;
	private String desc;
	private String img;
	private Integer count;
	
	public Upgrade(EnumUpgrades upgrade) {
		this.baseCost = upgrade.getBaseCost();
		this.cost = upgrade.getBaseCost();
		this.baseDamage = upgrade.getBaseDmg();
		this.damagePs = BigInteger.ZERO;
		this.name = upgrade.getName();
		this.desc = upgrade.getDesc();
		this.img = upgrade.getImg();
		this.count = 0;
	}
	
	public void buyOne() {
		recalculateCost(1);
		recalculateDamagePs(1);
		this.count++;
		}	
	
	private void recalculateCost(int number) {
		BigDecimal gold = new BigDecimal(this.getCost().toString());
		gold = gold.multiply(BigDecimal.valueOf(1.07));
		MathContext mc = new MathContext(1);
		gold.round(mc);
		this.cost = gold.toBigInteger();		
	}

	private void recalculateDamagePs(int number) {
		this.damagePs = this.damagePs.add(this.baseDamage.multiply(BigInteger.valueOf(number)));
	}



	public BigInteger getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(BigInteger baseCost) {
		this.baseCost = baseCost;
	}

	public BigInteger getCost() {
		return cost;
	}

	public void setCost(BigInteger cost) {
		this.cost = cost;
	}

	public BigInteger getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(BigInteger damage) {
		this.baseDamage = damage;
	}

	public BigInteger getDamagePs() {
		return damagePs;
	}

	public void setDamagePs(BigInteger damagePs) {
		this.damagePs = damagePs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}


}