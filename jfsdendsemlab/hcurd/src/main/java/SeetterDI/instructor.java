package SeetterDI;

public class instructor {
	private int iid;
	private String iname;
	private String iemail;
	private String iphonenumber;
	@Override
	public String toString() {
		return "instructor [iid=" + iid + ", iname=" + iname + ", iemail=" + iemail + ", iphonenumber=" + iphonenumber
				+ "]";
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIemail() {
		return iemail;
	}
	public void setIemail(String iemail) {
		this.iemail = iemail;
	}
	public String getIphonenumber() {
		return iphonenumber;
	}
	public void setIphonenumber(String iphonenumber) {
		this.iphonenumber = iphonenumber;
	}
	

}
