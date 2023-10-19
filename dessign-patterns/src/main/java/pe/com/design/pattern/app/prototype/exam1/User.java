package pe.com.design.pattern.app.prototype.exam1;

import java.util.Objects;

public class User implements Cloneable{
	private String name;
	private String lastNme;
	private int age;
	private String maritalStatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNme() {
		return lastNme;
	}

	public void setLastNme(String lastNme) {
		this.lastNme = lastNme;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, lastNme, maritalStatus, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(lastNme, other.lastNme)
				&& Objects.equals(maritalStatus, other.maritalStatus) && Objects.equals(name, other.name);
	}
	
	
@Override
protected Object clone() {
	User cloneUser = new User();
	cloneUser.setAge(this.getAge());
	cloneUser.setLastNme(this.getLastNme());
	cloneUser.setMaritalStatus(this.getMaritalStatus());
	cloneUser.setName(this.getName());
	return cloneUser;
}

@Override
public String toString() {
	return "User [name=" + name + ", lastNme=" + lastNme + ", age=" + age + ", maritalStatus=" + maritalStatus + "]";
}

}
