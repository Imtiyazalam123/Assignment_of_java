class BigException extends Throwable {
	String msg;
	public BigException() {
		String msg = new String();
	}
	public BigException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}