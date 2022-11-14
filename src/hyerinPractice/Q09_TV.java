package hyerinPractice;

public class Q09_TV {
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int resolution;
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	protected void printProperty() {
		System.out.println(getSize() + "인치 " + resolution + "컬러");
	}
}





