package mybean;

public class Person {
	private String name;
	private Dog dog;
	// 사람이 키우는 강아지 객체 추가
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
