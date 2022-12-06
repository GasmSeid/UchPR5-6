package com.example.Rabota.Models;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Size(min=2, max=20, message ="Фамилия не может быть меньше 2 и не больше 20")
    @Pattern(regexp = "^[а-яА-Я]+$", message = "Разрешены только буквы кириллицы")
    private String surname;
    @Size(min=2, max=20, message ="Имя не может быть меньше 2 и не больше 20")
    @Pattern(regexp = "^[а-яА-Я]+$", message = "Разрешены только буквы кириллицы")
    private String name;
    @Pattern(regexp = "^[а-яА-Я]+$", message = "Разрешены только буквы кириллицы")
    private String middlename;
    @Min(value = 1957, message = "Минимальная дата рождения - 1957 (65 лет)")
    @Max(value = 2006, message = "Минимальная дата рождения - 2006 (16 лет)")
    @Pattern(regexp = "^[0-9]+$", message = "Дата рождения может состоять только из цифр")
    private String bthday;
    @Size(min=4, max=4, message ="Серия паспорта - 4 символа")
    @Pattern(regexp = "^[0-9]+$", message = "Серия паспорта может состоять только из цифр")
    private String SeriaPass;
    @Size(min=6, max=6, message ="Номер паспорта - 6 символов")
    @Pattern(regexp = "^[0-9]+$", message = "Номер паспорта может состоять только из цифр")
    private String NomPass;
    @NotEmpty(message = "Заполните поле Адрес регистрации")
    private String AdresReg;
    @NotEmpty(message = "Заполните поле Email")
    @Email(message = "Электронная почта должна включать в себя символы @ и .")
    private String Email;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBthday() {
        return bthday;
    }

    public void setBthday(String bthday) {
        this.bthday = bthday;
    }

    public String getSeriaPass() {
        return SeriaPass;
    }

    public void setSeriaPass(String SeriaPass) {
        this.SeriaPass = SeriaPass;
    }

    public String getNomPass() {
        return NomPass;
    }

    public void setNomPass(String NomPass) {this.NomPass = NomPass;}

    public String getAdresReg() {
        return AdresReg;
    }
    public void setAdresReg(String AdresReg) {
        this.AdresReg = AdresReg;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Manager(String surname, String name, String middlename, String bthday, String SeriaPass, String NomPass, String AdresReg, String Email) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.bthday = bthday;
        this.SeriaPass = SeriaPass;
        this.NomPass = NomPass;
        this.AdresReg = AdresReg;
        this.Email = Email;
    }

    public Manager() {
    }
}
