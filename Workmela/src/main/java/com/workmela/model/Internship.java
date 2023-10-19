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
@Table(name = "internships")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Internship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int internId;
	private String internTitle;
	private String internRole;
	private String interDescription;
	private String location;
	private String stipend;
	private String internCategory;
	@Lob
	private byte[] content;
	private String fileType;
	private String fileName;
	private String opening;
	private String companyName;
	private String skillRequired;
	private String postDate;
	private String postTime;
	
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
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	public String getInternTitle() {
		return internTitle;
	}
	public void setInternTitle(String internTitle) {
		this.internTitle = internTitle;
	}
	public String getInternRole() {
		return internRole;
	}
	public void setInternRole(String internRole) {
		this.internRole = internRole;
	}
	public String getInterDescription() {
		return interDescription;
	}
	public void setInterDescription(String interDescription) {
		this.interDescription = interDescription;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStipend() {
		return stipend;
	}
	public void setStipend(String stipend) {
		this.stipend = stipend;
	}
	public String getInternCategory() {
		return internCategory;
	}
	public void setInternCategory(String internCategory) {
		this.internCategory = internCategory;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] image) {
		this.content = image;
	}
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSkillRequired() {
		return skillRequired;
	}
	public void setSkillRequired(String skillRequired) {
		this.skillRequired = skillRequired;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	
	
}
