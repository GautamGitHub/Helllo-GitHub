
 public class VarStringArg {
	 
	public static void main(String[] args) {
	 new VarStringArg().go(1,"hi");
	 new VarStringArg().go(2,"hi", "world");
	 }
	 public void go(int x , String... y) {
	 System.out.println(y[y.length - 1] + " " + x);
	 }
	 
 }
