package moto;

public class Account implements Comparable<Account> {
	private String type;
	private String reason;
	private String year;
	private String month;
	private String day;
	private float price;

	public Account(String type, String reason, String year, String month, String day, float price) {
		this.type = type;
		this.reason = reason;
		this.year = year;
		this.month = month;
		this.day = day;
		this.price = price;
	}

	@Override
	public String toString() {
		return "账目类型:" + type + "  账目原因:" + reason + "  账目时间:" + year + "-" + month + "-" + day + "   账目金额:" + price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int compareTo(Account o) {
		if (this.price > o.getPrice()) {
			return 1;
		} else if (this.price < o.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
