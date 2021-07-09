public class Exception2 extends Exception {
	protected String msg;
	
	public Exception2(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
}
