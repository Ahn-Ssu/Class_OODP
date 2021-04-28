package assn1;

public class Problem {
	private String operator;
	private int number1;
	private int number2;
    
    public Problem(String operator, int n1, int n2) {
        this.number1 = n1;
        this.number2 = n2;
        this.operator = operator;
    }
    public String getOperator() {
    	return this.operator;
    }
    public int getNumber1() {
        return number1;
    }
	public int getNumber2() {
		return number2;
	}
	public String toString() {
        return ""+ number1 + " "+ operator + " "+ number2;
    }
}