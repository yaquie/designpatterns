package pe.com.design.pattern.app.singleton;

public class UserService {
	private Version version;

	public UserService(Version version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "UserService [version=" + version + "]";
	}
	

}
