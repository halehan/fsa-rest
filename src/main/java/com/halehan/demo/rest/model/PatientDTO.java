package com.halehan.demo.rest.model;

public class PatientDTO {

    private Integer id;
    private Integer studyId;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private String studyEye;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudyEye() {
        return studyEye;
    }

    public void setStudyEye(String studyEye) {
        this.studyEye = studyEye;
    }

   public PatientDTO() {}

    public PatientDTO(Integer id, Integer studyId, String firstName, String lastName, String email,
               String status, String studyEye) {
        this.id = id;
        this.studyId  = studyId;
        this.status  =status;
        this.firstName = firstName;
        this.lastName  =lastName;
        this.email = email;
        this.studyEye = studyEye;

    }
}
