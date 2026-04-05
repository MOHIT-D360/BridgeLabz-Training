package org.example;

public class StudentDTO {
    private int id;
    private String name;
    private String email;
    private int age;
    private String grade;

    public StudentDTO(){

    }
    public StudentDTO(int id,String name,String email,int age,String grade){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.grade =grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
