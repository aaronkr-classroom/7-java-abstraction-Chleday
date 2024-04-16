public class Car extends FourWheeler {
	
		// FourWheeler 추상 클래스의 메서드
	public void printPrice() {
		System.out.println("가격 : 50,000,000");
		}
		// TwoWheeler 추상 클래스의 메서드
	public void printType() {
		System.out.println("이것은 자동차입니다.");
		}
		// Car 일반 클래스의 메서드
	public void printBrand() {
		System.out.println("브랜드 : BMW");
		}
}
