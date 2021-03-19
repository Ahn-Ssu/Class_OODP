class Rectangle {
    private int length;
    private int width;

    Rectangle(int l, int b) {
        length = l;
        width = b;
    }
    int RectLength() {return length;}
	int RectWidth() {return width;}
    void area(Rectangle r1) {
		r1.length += 5;
		r1.width += 5;
        int areaOfRectangle = r1.length * r1.width;
        System.out.println("Inside area method");
        System.out.println("length: " + r1.length);
        System.out.println("width: " + r1.width);
        System.out.println("Area of Rectangle : "
                                + areaOfRectangle);
    }
}

class ObjectChangeDemo {
    public static void main(String args[]) {

        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("Before Passing ");
        System.out.println("lenth: "+r1.RectLength());
        System.out.println("width: "+r1.RectWidth());
        r1.area(r1);
        System.out.println("After Passing ");
        System.out.println("lenth: "+r1.RectLength());
        System.out.println("width: "+r1.RectWidth());
    }
}