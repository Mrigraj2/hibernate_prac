package mapping.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    private int lid;
    @Column(name = "Laptop Name")
    private String laptopName;
    @Column(name = "RAM")
    private int ram;

    public Laptop(int lid, String laptopName, int ram) {
        this.lid = lid;
        this.laptopName = laptopName;
        this.ram = ram;
    }

    public Laptop() {
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", laptopName=" + laptopName +
                ", ram=" + ram +
                '}';
    }
}
