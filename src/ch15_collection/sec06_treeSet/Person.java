package ch15_collection.sec06_treeSet;

public class Person implements Comparable{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Person))
			return 0;
		Person p = (Person) o;
//		return age - p.age;		// 나이순 오름차순 정렬
//		return p.age - age;		// 나이순 내림차순 정렬
//		return name.compareTo(p.name); 	// 이름 오름차순 정렬
//		return name.compareTo(name); 	// 이름 내림차순 정렬
		
		// 나이, 이름 오름차순 정렬
		return (age == p.age) ? name.compareTo(p.name) : age - p.age;
	}
}
