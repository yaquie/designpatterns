package pe.com.design.pattern.app.singleton;

public class Version {

	private final int major;
	private final int minor;
	private final int revision;
	
	private static Version instance;
	
	//crear una unica instancia
	private  Version() {
		this.major = 1;
		this.minor = 0;
		this.revision = 0;
	}
	
	public synchronized static Version getInstance() {
		if(null == instance) {
			return new Version();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Version [major=" + major + ", minor=" + minor + ", revision=" + revision + "]";
	}

}
