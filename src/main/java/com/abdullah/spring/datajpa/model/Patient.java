package com.abdullah.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

	@Column(name = "title")
	private String title;

    @Column(name = "phone_number")
    private String phone_number;
 
    public Patient() {

	@Column(name = "published")
	private boolean published;

    public Patient(String patient_name, String birth_date, String phone_number) {
        this.patient_name = patient_name;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
    }

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