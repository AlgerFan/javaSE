package cn.algerfan.student;

class Student {
	public String name;
	public String sex;
	public String age;
	public String stuno;
	
	public Student(){
		
	}
	
	public Student(String name, String sex, String age, String stuno) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.stuno = stuno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (stuno == null) {
			if (other.stuno != null)
				return false;
		} else if (!stuno.equals(other.stuno))
			return false;
		return true;
	}

	public String[] toArray() {
		return new String[] { name, sex, age, stuno };
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", stuno=" + stuno + "]";
	}
	
}
