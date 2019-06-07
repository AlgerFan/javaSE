package user;

public interface UserInterface {
	public abstract boolean islogin(String userName, String passWord);
	public abstract void register(User user);
	public abstract boolean isloginOne(String em);
}
