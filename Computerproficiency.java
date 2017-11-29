import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="tbl_comp")
public class Computerproficiency {
@Column(name="skills")
private String skills;
@Column(name="tagid")
private int tagid;
@Column(name="value")
private String value;
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}
public int getTagid() {
	return tagid;
}
public void setTagid(int tagid) {
	this.tagid = tagid;
}
public void setValue(String value) {
	this.value = value;
}
public String getValue() {
	return value;
}
}
