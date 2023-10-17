package com.workmela.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userEmail;
	private String userMobile;
	private String nationality;
	private String jobTitle;
	private String password;
	private String currentLocation;
	private String preferredLocation;
	private String expectedSalary;
	private String qualification;
	private String firstName;
	private String lastName;
	private String gender;
	private String passingYear;
	
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "UserId_fk", referencedColumnName = "userId")
	private List<Course> course;
	
	@OneToMany(targetEntity = Internship.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "UserId_fk", referencedColumnName = "userId")
	private List<Internship> internship;
	
	@OneToMany(targetEntity = Job.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "UserId_fk", referencedColumnName = "userId")
	private List<Job> job;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getPreferredLocation() {
		return preferredLocation;
	}

	public void setPreferredLocation(String preferredLocation) {
		this.preferredLocation = preferredLocation;
	}

	public String getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Internship> getInternship() {
		return internship;
	}

	public void setInternship(List<Internship> internship) {
		this.internship = internship;
	}

	public List<Job> getJob() {
		return job;
	}

	public void setJob(List<Job> job) {
		this.job = job;
	}
	
	
	
}
