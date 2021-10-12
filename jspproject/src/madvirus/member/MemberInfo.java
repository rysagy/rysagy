// DTO(Data Transfer Object)

package madvirus.member;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MemberInfo {
    
    private String id;                    // 프로퍼티(Property),필드,맴버변수
    private String password;
    private String name;
    private String address;
    private Timestamp registerDate;
    private String email;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
  
}
