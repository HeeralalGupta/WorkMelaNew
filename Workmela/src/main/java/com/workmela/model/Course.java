package com.workmela.model;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
public class Course {
		@Id
		private int courseId;
		private String courseTitle;
		private String courseDescription;
		private String courseDuration;
		private String courseCategory;
		private String courseFees;
		private String courseSyllabus;
		private String courseCertification;
		private String paymentInformation;
		private Blob courseImage;
		private Date postDate;
		private Date postTime;
		
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseTitle() {
			return courseTitle;
		}
		public void setCourseTitle(String courseTitle) {
			this.courseTitle = courseTitle;
		}
		public String getCourseDescription() {
			return courseDescription;
		}
		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}
		public String getCourseDuration() {
			return courseDuration;
		}
		public void setCourseDuration(String courseDuration) {
			this.courseDuration = courseDuration;
		}
		public String getCourseCategory() {
			return courseCategory;
		}
		public void setCourseCategory(String courseCategory) {
			this.courseCategory = courseCategory;
		}
		public String getCourseFees() {
			return courseFees;
		}
		public void setCourseFees(String courseFees) {
			this.courseFees = courseFees;
		}
		public String getCourseSyllabus() {
			return courseSyllabus;
		}
		public void setCourseSyllabus(String courseSyllabus) {
			this.courseSyllabus = courseSyllabus;
		}
		public String getCourseCertification() {
			return courseCertification;
		}
		public void setCourseCertification(String courseCertification) {
			this.courseCertification = courseCertification;
		}
		public String getPaymentInformation() {
			return paymentInformation;
		}
		public void setPaymentInformation(String paymentInformation) {
			this.paymentInformation = paymentInformation;
		}
		public Blob getCourseImage() {
			return courseImage;
		}
		public void setCourseImage(Blob courseImage) {
			this.courseImage = courseImage;
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
