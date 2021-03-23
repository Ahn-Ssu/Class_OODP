class PassByValue {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
    public static void main(String args[]) {
        Integer a = Integer(1);
        Integer b = Integer(2);
        System.out.println("Before swapping");
        System.out.println("a: "+a+" b: "+b);
        swap(a, b);
        System.out.println("After swapping");
        System.out.println("a: "+a+" b: "+b);
    }
}