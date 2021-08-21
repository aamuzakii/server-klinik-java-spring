package com.abdullah.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Patient {

<<<<<<< HEAD:src/main/java/com/bezkoder/spring/datajpa/model/Tutorial.java
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
=======
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
>>>>>>> 5ff4d5e9daaf711cd52ce752f6a8c7df94bc0143:src/main/java/com/abdullah/spring/datajpa/model/Patient.java

	@Column(name = "title")
	private String title;

<<<<<<< HEAD:src/main/java/com/bezkoder/spring/datajpa/model/Tutorial.java
	@Column(name = "description")
	private String description;
=======
    @Column(name = "phone_number")
    private String phone_number;
 
    public Patient() {
>>>>>>> 5ff4d5e9daaf711cd52ce752f6a8c7df94bc0143:src/main/java/com/abdullah/spring/datajpa/model/Patient.java

	@Column(name = "published")
	private boolean published;

<<<<<<< HEAD:src/main/java/com/bezkoder/spring/datajpa/model/Tutorial.java
	public Tutorial() {
=======
    public Patient(String patient_name, String birth_date, String phone_number) {
        this.patient_name = patient_name;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
    }
>>>>>>> 5ff4d5e9daaf711cd52ce752f6a8c7df94bc0143:src/main/java/com/abdullah/spring/datajpa/model/Patient.java

	}

	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

//	@Override
//	public String toString() {
//		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//	}
}