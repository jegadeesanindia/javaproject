
import javax.persistence.*;
@Entity
@Table(name="TBL_Basicprofile")
@Inheritance(strategy=InheritanceType.JOINED)
public class Basicprofile
{
	@Id
	@Column(name="R_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	@Column(name="FirstName")
	private String Firstname;
	@Column(name="LastName")
	private String lastname;
	@Column(name="FatherName")
	private String Fathername;
	@Column(name="age")
	private int age;
	@Column(name="Email_id")
	private String emailid;
	@Column(name="DOB")
	private String DOB;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
}
