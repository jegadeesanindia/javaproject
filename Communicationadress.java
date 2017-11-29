import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="tbl_comp")
@PrimaryKeyJoinColumn(name="R_ID")  
public class Communicationadress extends Basicprofile {
@Column(name="door")
private String Door_n0;
@Column(name="name")
private String name;
@Column(name="village")
private String village;
@Column(name="taluk")
private String taluk;
@Column(name="city")
private String city;
@Column(name="state")
private String state;
@Column(name="country")
private String country;
public String getDoor_n0() {
	return Door_n0;
}
public void setDoor_n0(String door_n0) {
	Door_n0 = door_n0;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getTaluk() {
	return taluk;
}
public void setTaluk(String taluk) {
	this.taluk = taluk;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
