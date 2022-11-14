package hyerinPractice;

import java.util.Objects;

public class Q01_Student {
	private String studentNum;

	public Q01_Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q01_Student other = (Q01_Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}

//	@Override
//	public String toString() {
//		return "Student [studentNum=" + studentNum + "]";
//	}

}
