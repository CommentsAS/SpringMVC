package lab.spring.youtube.model;

import java.util.Date;

public class UserVO{
	private String user_id;
	private String user_name;
	private String pwd;
	private String cid;
	private String category;
	
	private Date birth;
	private String year;
	private String month;
	private String day;
	
	private String gender;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDay() {
		return day;
	}
	
	
	public void setYear(String year) {
		this.year = year;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_name=" + user_name + ", pwd=" + pwd + ", cid=" + cid
				+ ", category=" + category + ", birth=" + birth + ", gender=" + gender + "]";
	}

	
}


//����
//public class UserVO {
//	private String userid;
//	private String userpwd;
//	private int age;
//	private String gender;
//	private String address;
//	private double height;
//	private double weight;
//	private double waist;
//	private double belly;
//	private String exercise1;
//	private String exercise2;
//	private String exercise3;
//	private String level1;
//	private String level2;
//	private String level3;
//	private String purpose;
//	
//
//	public UserVO() {
//		super();
//	}
//
//
//	public UserVO(String userid, String userpwd, int age, String gender, String address, double height, double weight,
//			double waist, double belly, String exercise1, String exercise2, String exercise3, String level1,
//			String level2, String level3, String purpose) {
//		super();
//		this.userid = userid;
//		this.userpwd = userpwd;
//		this.age = age;
//		this.gender = gender;
//		this.address = address;
//		this.height = height;
//		this.weight = weight;
//		this.waist = waist;
//		this.belly = belly;
//		this.exercise1 = exercise1;
//		this.exercise2 = exercise2;
//		this.exercise3 = exercise3;
//		this.level1 = level1;
//		this.level2 = level2;
//		this.level3 = level3;
//		this.purpose = purpose;
//	}
//
//
//	public String getUserid() {
//		return userid;
//	}
//
//
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}
//
//
//	public String getUserpwd() {
//		return userpwd;
//	}
//
//
//	public void setUserpwd(String userpwd) {
//		this.userpwd = userpwd;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getGender() {
//		return gender;
//	}
//
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//
//	public String getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//
//	public double getHeight() {
//		return height;
//	}
//
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//
//	public double getWeight() {
//		return weight;
//	}
//
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//
//
//	public double getWaist() {
//		return waist;
//	}
//
//
//	public void setWaist(double waist) {
//		this.waist = waist;
//	}
//
//
//	public double getBelly() {
//		return belly;
//	}
//
//
//	public void setBelly(double belly) {
//		this.belly = belly;
//	}
//
//
//	public String getExercise1() {
//		return exercise1;
//	}
//
//
//	public void setExercise1(String exercise1) {
//		this.exercise1 = exercise1;
//	}
//
//
//	public String getExercise2() {
//		return exercise2;
//	}
//
//
//	public void setExercise2(String exercise2) {
//		this.exercise2 = exercise2;
//	}
//
//
//	public String getExercise3() {
//		return exercise3;
//	}
//
//
//	public void setExercise3(String exercise3) {
//		this.exercise3 = exercise3;
//	}
//
//
//	public String getLevel1() {
//		return level1;
//	}
//
//
//	public void setLevel1(String level1) {
//		this.level1 = level1;
//	}
//
//
//	public String getLevel2() {
//		return level2;
//	}
//
//
//	public void setLevel2(String level2) {
//		this.level2 = level2;
//	}
//
//
//	public String getLevel3() {
//		return level3;
//	}
//
//
//	public void setLevel3(String level3) {
//		this.level3 = level3;
//	}
//
//
//	public String getPurpose() {
//		return purpose;
//	}
//
//
//	public void setPurpose(String purpose) {
//		this.purpose = purpose;
//	}
//
//
//	@Override
//	public String toString() {
//		return "UserVO [userid=" + userid + ", userpwd=" + userpwd + ", age=" + age + ", gender=" + gender
//				+ ", address=" + address + ", height=" + height + ", weight=" + weight + ", waist=" + waist + ", belly="
//				+ belly + ", exercise1=" + exercise1 + ", exercise2=" + exercise2 + ", exercise3=" + exercise3
//				+ ", level1=" + level1 + ", level2=" + level2 + ", level3=" + level3 + ", purpose=" + purpose + "]";
//	}
//
//}
