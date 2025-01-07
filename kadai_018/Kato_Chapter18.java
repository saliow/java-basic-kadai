package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	
	public Kato_Chapter18() {
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
		System.out.println(address);
	}
	public abstract void setGivenName();
	
	public abstract void eachIntroduce();
}
