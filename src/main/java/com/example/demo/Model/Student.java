package com.example.demo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MyDetails")
public class Student 
{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="LearnerID")
    private Long learnerid;
	@Column(name="LearnerName")
    private String learnername;
	@Column(name="Courses")
    private String courses;
	@Column(name="LearnerFees")
    private int fees;
	public Student() {

	}
	public Student(Long id, String name, String course, int fee) {
	
		this.learnerid = id;
		this.learnername = name;
		this.courses = course;
		this.fees = fee;
	}
	public Long getId() {
		return learnerid;
	}
	public void setId(Long id) {
		this.learnerid = id;
	}
	public String getStudentname() {
		return learnername;
	}
	public void setStudentname(String studentname) {
		this.learnername = studentname;
	}
	public String getCourse() {
		return courses;
	}
	public void setCourse(String course) {
		this.courses = course;
	}
	public int getFee() {
		return fees;
	}
	public void setFee(int fee) {
		this.fees = fee;
	}

}