package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName;
	public String givenName;
	public String address;
	
	public Kato_Chapter18(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getFullName() {
		return familyName + "" + givenName;
	}
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	public void commonIntroduce() {
		System.out.println("名前は" + getFullName() + "です");
		System.out.println("住所は" + address + "です");
	}
	public abstract void eachIntroduce();
}
