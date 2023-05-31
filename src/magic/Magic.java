package magic;

public class Magic {
	int magicPower;
	String magicName;
	
	public Magic(String magicName, int magicPower) {
		this.magicName = magicName;
		this.magicPower = magicPower;
	}

	public int computedPower(int age) {
		if(age >= 80) {
			magicPower += 100;
		} else if(age == 32) {
			magicPower = 0;
		} else if(age >= 20 && age != 32) {
			magicPower += 20;
		}
		return magicPower;
	};

}
