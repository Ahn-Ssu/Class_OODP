package assn1;

public class SubOperator extends Operator{
	private String op = "sub";
	private String opChar = "-";

	public SubOperator(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Problem problem) {
		if(problem.getOperator().equals(this.op)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	protected void calc(Problem problem) {
		System.out.println("" + problem.getNumber1() + " "+ opChar +" " + problem.getNumber2() + " = " +(problem.getNumber1() - problem.getNumber2())); 
	}

}
