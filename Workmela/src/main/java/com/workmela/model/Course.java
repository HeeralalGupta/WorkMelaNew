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
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int courseId;
		private String courseTitle;
		private String courseDescription;
		private String courseDuration;
		private String courseCategory;
		private String courseFees;
		private String courseSyllabus;
		private String courseCertification;
		private String paymentInformation;
		private String notes;
		@Lob
		private byte[] content;
		private String fileType;
		private String fileName;
		private String postDate;
		private String postTime;
	
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
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
		public byte[] getContent() {
			return content;
		}
		public void setContent(byte[] content) {
			this.content = content;
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
