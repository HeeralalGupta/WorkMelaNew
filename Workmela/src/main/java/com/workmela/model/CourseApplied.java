package com.workmela.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "course_applied")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseApplied {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int courseId;
	@Lob
	private byte[] govtId;
	private String fileType;
	private String fileName;
	private String name;
	private String email;
	private String mobile;
	private String dob;
	private String higestQualifiction;
	private String location;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public byte[] getGovtId() {
		return govtId;
	}
	public void setGovtId(byte[] govtId) {
		this.govtId = govtId;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getHigestQualifiction() {
		return higestQualifiction;
	}
	public void setHigestQualifiction(String higestQualifiction) {
		this.higestQualifiction = higestQualifiction;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
