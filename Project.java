import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TBL_project")
@PrimaryKeyJoinColumn(name="ID")  
public class Project {
@Column(name="title")
private String Title;
@Column(name="status")
private String Status;
@Column(name="descripton")
private String Description;
public void setStatus(String status) {
	Status = status;
}
public String getStatus() {
	return Status;
}
public void setDescription(String description) {
	Description = description;
}
public String getDescription() {
	return Description;
}
public void setTitle(String title) {
	Title = title;
}
public String getTitle() {
	return Title;
}
}
