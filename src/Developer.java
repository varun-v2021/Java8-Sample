import java.math.BigDecimal;

public class Developer {
	private String str;
	private BigDecimal bigD;
	private int no;
	
	Developer(String str, BigDecimal bigD, int no){
		this.str = str;
		this.bigD = bigD;
		this.no = no;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public BigDecimal getBigD() {
		return bigD;
	}

	public void setBigD(BigDecimal bigD) {
		this.bigD = bigD;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
