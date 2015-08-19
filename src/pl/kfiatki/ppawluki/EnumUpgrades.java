package pl.kfiatki.ppawluki;

import java.math.BigInteger;

public enum EnumUpgrades {
    FIRST	("FIRST",	"pic1", BigInteger.valueOf(10),	 	  BigInteger.valueOf(0),		
    		 "Simple description nr 1"),
    SECOND	("SECOND",	"pic2", BigInteger.valueOf(100),	  BigInteger.valueOf(7),		
   		 	 "Simple description nr 2"),
   	THIRD	("THIRD",	"pic3", BigInteger.valueOf(400),	  BigInteger.valueOf(25),		
   			 "Simple description nr 3"),
   	FOURTH	("FOURTH",	"pic4", BigInteger.valueOf(1100),	  BigInteger.valueOf(70),		
   			 "Simple description nr 4"),
   	FIFTH	("FIFTH",	"pic5", BigInteger.valueOf(4200),	  BigInteger.valueOf(277),		
   			 "Simple description nr 5"),
   	SIXTH	("SIXTH",	"pic6", BigInteger.valueOf(22500),	  BigInteger.valueOf(1337),		
   			 "Simple description nr 6"),
	SEVENTH	("SEVENTH",	"pic7", BigInteger.valueOf(115000),	  BigInteger.valueOf(3666),		
			 "Simple description nr 7"),
	EIGHT	("EIGHT",	"pic8", BigInteger.valueOf(400000),	  BigInteger.valueOf(14504),	
			 "Simple description nr 8"),
	NINTH	("NINTH",	"pic9", BigInteger.valueOf(2500000),  BigInteger.valueOf(56713),	
			 "Simple description nr 9"),
	TENTH	("TENTH",	"pic10",BigInteger.valueOf(15000000), BigInteger.valueOf(210987),	
			 "Simple description nr 10"),
	ELEVENTH("ELEVENTH","pic11",BigInteger.valueOf(100000000),BigInteger.valueOf(876543),	
			 "Simple description nr 11"),
	TWELFTH	("TWELFTH",	"pic12",BigInteger.valueOf(600000000),BigInteger.valueOf(40962048),	
			 "Simple description nr 12");
		
	    private final String name;
	    private final String img;
	    private final BigInteger baseCost;
	    private final BigInteger baseDmg;
	    private final String desc;
	    private EnumUpgrades(String name, String img, BigInteger baseCost, BigInteger baseDmg, String desc) {
			this.name = name;
			this.img = img;
			this.baseCost = baseCost;
			this.baseDmg = baseDmg;
			this.desc = desc;
		}

	    public String getName() {
			return name;
		}
		public String getImg() {
			return img;
		}
		public BigInteger getBaseCost() {
			return baseCost;
		}
		public BigInteger getBaseDmg() {
			return baseDmg;
		}
		public String getDesc() {
			return desc;
		}
}
