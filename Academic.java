import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ACADEMIC")
@PrimaryKeyJoinColumn(name="R_ID")  
public class Academic extends Basicprofile{
	@Column(name="COURSES")
	private String courses;
	@Column(name="INSTITUTION")
	private String institution;
	@Column(name="GRADUATE_YEAR")
	private String graduate_year;
	@Column(name="PERCENTAGE")
	private String percentage;
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getCourses() {
		return courses;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getInstitution() {
		return institution;
	}
	public void setGraduate_year(String graduate_year) {
		this.graduate_year = graduate_year;
	}
	public String getGraduate_year() {
		return graduate_year;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getPercentage() {
		return percentage;
	}
	

}
