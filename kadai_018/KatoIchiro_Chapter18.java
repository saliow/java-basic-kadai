package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public KatoIchiro_Chapter18(String familyName, String address) {
		super(familyName, address);
		setGivenName("一郎");
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}