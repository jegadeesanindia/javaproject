import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="tbl_permanentadrr")
public class Permanentaddress extends Basicprofile{
	@Column(name="door")
	private String pDoor_n;
	@Column(name="pname")
	private String pname;
	@Column(name="village")
	private String pvillage;
	@Column(name="ptaluk")
	private String ptaluk;
	@Column(name="pcity")
	private String pcity;
	@Column(name="pstate")
	private String pstate;
	@Column(name="pcountry")
	private String pcountry;
	public String getpDoor_n() {
		return pDoor_n;
	}
	public void setpDoor_n0(String pDoor_n) {
		this.pDoor_n = pDoor_n;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPvillage() {
		return pvillage;
	}
	public void setPvillage(String pvillage) {
		this.pvillage = pvillage;
	}
	public String getPtaluk() {
		return ptaluk;
	}
	public void setPtaluk(String ptaluk) {
		this.ptaluk = ptaluk;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	public String getPstate() {
		return pstate;
	}
	public void setPstate(String pstate) {
		this.pstate = pstate;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	}
