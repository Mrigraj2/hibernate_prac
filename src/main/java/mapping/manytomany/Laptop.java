package mapping.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String laptop_name;
    private String brand;

    @ManyToMany
    private List<Engineer> engineers;

    public Laptop(int lid, String laptop_name, String brand, List<Engineer> engineers) {
        this.lid = lid;
        this.laptop_name = laptop_name;
        this.brand = brand;
        this.engineers = engineers;
    }

    public Laptop() {
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Engineer> engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", laptop_name='" + laptop_name + '\'' +
                ", brand='" + brand + '\'' +
                ", engineers=" + engineers +
                '}';
    }
}
