package com.abdullah.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @Column(name = "patient_name")
    private String patient_name;
 
    @Column(name = "birth_date")
    private String birth_date;

    @Column(name = "phone_number")
    private String phone_number;
 
    public Tutorial() {

    }

    public Tutorial(String patient_name, String birth_date, String phone_number) {
        this.patient_name = patient_name;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
    }

    public long getId() {
        return id;
    }

    public String getPatientName() {
        return patient_name;
    }

    public void setPatientName(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

//    @Override
//    public String toString() {
//        return "Tutorial [id=" + id + ", patient_name=" + patient_name + ", birth_date=" + birth_date + ", phone_number=" + phone_number + "]";
//    }

}