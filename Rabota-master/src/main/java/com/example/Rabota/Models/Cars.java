package com.example.Rabota.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message = "Заполните поле Марка")
    @Pattern(regexp ="^[а-яА-ЯёЁa-zA-Z0-9]+$", message = " В марке используйте английские, русские буквы и цифры")
    private String carbrand;
    @NotEmpty(message = "Заполните поле Модель")
    private String carsmodel;
    @NotEmpty(message = "Заполните поле Год выпуска")
    @Pattern(regexp = "^[0-9]+$", message = "Год выпуска может состоять только из цифр")
    @Min(value = 1885, message = "Минимальный год выпуска - 1885")
    @Max(value = 2022, message = "Максимальный год выпуска - 2022")
    private String year_release;
    @NotEmpty(message = "Заполните поле Цвет")
    private String color;
    @NotEmpty(message = "Заполните поле VIN")
    @Size(min=17, max=17, message ="VIN должен состоять из 17 символов")
    private String VIN;

    @NotEmpty(message = "Заполните поле Л/С")
    @Max(value = 2022, message = "Максимальное значение - 2028")
    @Pattern(regexp = "^[0-9]+$", message = "Поле Л/С может содеражать только цифры")
    private String horsepower;
    @Size(min=1, max=4, message ="Поле Объем двигателя может содеражать до 4 символов")
    @Pattern(regexp = "^[0-9.]+$", message = "Объем двигателя может содержать только цифры и точку")
    private String engine_capacity;

    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;}

    public String getCarbrand() {return carbrand;}

    public void setCarbrand(String carbrand) {this.carbrand = carbrand;}

    public String getCarsmodel() {return carsmodel;}

    public void setCarsmodel(String carsmodel) {this.carsmodel = carsmodel;}

    public String getYear_release() {return year_release;}

    public void setYear_release(String year_release) {this.year_release = year_release;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getVIN() {return VIN;}

    public void setVIN(String VIN) {this.VIN = VIN;}

    public String getHorsepower() {return horsepower;}

    public void setHorsepower(String horsepower) {this.horsepower = horsepower;}

    public String getEngine_capacity() {return engine_capacity;}

    public void setEngine_capacity(String engine_capacity) {this.engine_capacity = engine_capacity;}

    public Cars() {}

    public Cars(String carbrand, String carsmodel, String year_release, String color, String VIN, String horsepower, String engine_capacity) {
        this.carbrand = carbrand;
        this.carsmodel = carsmodel;
        this.year_release = year_release;
        this.color = color;
        this.VIN = VIN;
        this.horsepower = horsepower;
        this.engine_capacity = engine_capacity;
    }
}
