package com.workmela.model;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "internships")
@AllArgsConstructor
@NoArgsConstructor
public class Internship {
	@Id
	private int internId;
	private String internTitle;
	private String internRole;
	private String interDescription;
	private String location;
	private String stipend;
	private String internCategory;
	private Blob image;
	private String opening;
	private String companyName;
	private String skillRequired;
	private Date postDate;
	private Date postTime;
	
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
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
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
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	
}
