            
package info.searchman;

public class HelloWorld {
  public static void main(String args[]){
    System.out.println("HelloWorld2");
	Box box = new Box();
	box.print(); // red  
  }
}

interface Printer { // インターフェース
	String MOJI = "red"; // 定数
	void print(); // 抽象メソッド
} 
class Box implements Printer{ //インターフェスを実装
	@Override
	public void print() { //オーバーライド
		System.out.println(MOJI);
	}
}
