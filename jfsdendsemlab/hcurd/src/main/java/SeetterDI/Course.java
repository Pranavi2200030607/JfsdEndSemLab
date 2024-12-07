package SeetterDI;

public class Course {
	private int cid;
	private String cname;
	private String ccredits;
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ccredits=" + ccredits + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcredits() {
		return ccredits;
	}
	public void setCcredits(String ccredits) {
		this.ccredits = ccredits;
	}
	

}
