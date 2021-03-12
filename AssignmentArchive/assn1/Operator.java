package assn1;
public abstract class Operator {
    private String name;
    private Operator next;
    public Operator(String name) {
        this.name = name;
    }
    public Operator setNext(Operator next) {
        this.next = next;
        return next;
    }
    public final void support(Problem problem) {
        if (resolve(problem)) {
            done(problem);
        } else if (next != null) {
        	System.out.println(this + " server passing " + problem.getOperator() +" operator to the next server.");
            next.support(problem);
        } else {
            fail(problem);
        }
    }
    public String toString() {
        return name;
    }
    protected abstract boolean resolve(Problem problem);
    protected abstract void calc(Problem problem);
    protected void done(Problem problem) {
    	System.out.println(this + " server Working . . .");
    	calc(problem);
    	System.out.println(this + " provided");
    }
    protected void fail(Problem trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}