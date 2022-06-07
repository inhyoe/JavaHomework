public class P_34_Comparable인터페이스 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(120, 30);
		Rectangle1 r2 = new Rectangle1(100, 10);
        System.out.println(r1);
        System.out.println(r2);
		int result = r1.compareTo(r2);
        System.out.println("결과는 " +result);
	}

    
}


class Rectangle1 implements Comparable {
    public int width = 0;
    public int height = 0;

    public String toString() {
        return "Rectangle1 [ width = " + width + ", height = " + height + " ]";
    }

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int compareTo(Object other) {
		Rectangle1 otherRect = (Rectangle1) other;
		if (this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}

}