package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 katotaro_chapter18 = new KatoTaro_Chapter18("加藤",  "東京都中野区〇×");
		Kato_Chapter18 katoichiro_chapter18 = new KatoIchiro_Chapter18("加藤", "東京都中野区〇×");
		Kato_Chapter18 katohanako_chapter18 = new KatoHanako_Chapter18("加藤", "東京都中野区〇×");
		
		katotaro_chapter18.execIntroduce();
		System.out.println();
		katoichiro_chapter18.execIntroduce();
		System.out.println();
		katohanako_chapter18.execIntroduce();
    }
}
