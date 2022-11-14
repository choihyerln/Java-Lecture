package ch15_collection.question;

import java.util.Objects;

public class Q03Student {
	public int studentNum;
	public String name;
	
	public Q03Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Q03Student))
			return false;
		Q03Student target = (Q03Student) obj;
			return (studentNum ==target.studentNum);
	}
}
