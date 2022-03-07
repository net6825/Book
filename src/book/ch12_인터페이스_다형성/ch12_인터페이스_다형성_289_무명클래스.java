package book.ch12_인터페이스_다형성;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

public class ch12_인터페이스_다형성_289_무명클래스 {
    public static void main (String []args){
        RemoteControl ac = new RemoteControl() {
            public void turnOn() {
                System.out.println("TV TurnOn");
            }

            public void turnOff() {
                System.out.println("TV TurnOff");
            }
        };
        ac.turnOff();
        ac.turnOn();
    }
}
//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=j931018&logNo=221142327190 &#xB2E4;&#xC2DC; &#xD5F7;&#xAC08;&#xB9AC;&#xBA74; &#xD655;&#xC778;&#xD558;&#xAE30;
/*

interface TV{
	void TVOn();
	void TVOff();
}
class SamSungTV implements TV{

	@Override
	public void TVOn() {
		System.out.println("삼성 TV가 켜졌습니다.");
	}

	@Override
	public void TVOff() {
		System.out.println("삼성 TV가 꺼졌습니다.");
	}
}
public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamSungTV samsungTV=new SamSungTV();
		samsungTV.TVOn();
		samsungTV.TVOff();
	}

}

================================================================================================================================================================================================================================================================

interface TV{
	void TVOn();
	void TVOff();
}

public class TVTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV samsungTV=new TV() {
			public void TVOn() {
				System.out.println("삼성TV가 켜졌습니다.");
			}
			public void TVOff() {
				System.out.println("삼성TV가 켜졌습니다.");
			}
		};
		samsungTV.TVOn();
		samsungTV.TVOff();
	}
}

*/