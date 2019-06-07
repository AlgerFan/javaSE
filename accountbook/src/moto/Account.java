package moto;

public class Account {
	public String name;
	public String psw;
    private String type;  
    private String reason;  
    private String time;
    private float price;      //声明私有数据成员
	public Account(String type,String reason,String time,float price) {
		this.type=type;
		this.reason=reason;
		this.time=time;
		this.price=price;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setAccount(String type,String reason,String time,float price) {
		this.type=type;
		this.reason=reason;
		this.time=time;
		this.price=price;
	}
}
