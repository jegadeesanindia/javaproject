import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="TBL_jobex")
@PrimaryKeyJoinColumn(name="R_ID")  
public class Jobexperience extends Basicprofile{
@Column(name="name")
private String name;
@Column(name="job")
private String job;
@Column(name="experience")
private String experience;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
}
