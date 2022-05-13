package com.example.democ12jwt.model.DTO;

import com.example.democ12jwt.model.Address;
import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.AppStatus;
import com.example.democ12jwt.model.Gender;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public class SupplierForm {
    private Long id;

    private String name;

    private String email;

    private String hobby;

    private int age;

    private String personal;

    private String note;

    private double height;

    private double weight;

    private MultipartFile image;

    private String phone;

    private Address address;

    private Gender gender;

    private Set<AppService> serviceSet;

    private AppStatus status;

    public SupplierForm(Long id, String name, String email, String hobby, int age, String personal, String note, double height, double weight, MultipartFile image, String phone, Address address, Gender gender, Set<AppService> serviceSet, AppStatus status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobby = hobby;
        this.age = age;
        this.personal = personal;
        this.note = note;
        this.height = height;
        this.weight = weight;
        this.image = image;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.serviceSet = serviceSet;
        this.status = status;
    }



    public SupplierForm() {
    }

    public SupplierForm(String name, String email, String hobby, int age, String personal, String note, double height, double weight, MultipartFile image, String phone, Address address, Gender gender, Set<AppService> serviceSet, AppStatus status) {
        this.name = name;
        this.email = email;
        this.hobby = hobby;
        this.age = age;
        this.personal = personal;
        this.note = note;
        this.height = height;
        this.weight = weight;
        this.image = image;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.serviceSet = serviceSet;
        this.status = status;
    }

    public SupplierForm(String name, String email, String hobby, int age, String personal, String note, double height, double weight, MultipartFile image, String phone, Address address, Gender gender, AppStatus status) {
        this.name = name;
        this.email = email;
        this.hobby = hobby;
        this.age = age;
        this.personal = personal;
        this.note = note;
        this.height = height;
        this.weight = weight;
        this.image = image;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<AppService> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<AppService> serviceSet) {
        this.serviceSet = serviceSet;
    }

    public AppStatus getStatus() {
        return status;
    }

    public void setStatus(AppStatus status) {
        this.status = status;
    }
}
