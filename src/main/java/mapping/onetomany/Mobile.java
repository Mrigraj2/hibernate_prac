package mapping.onetomany;

import jakarta.persistence.*;

@Entity
@Table(name = "Smart Phone")
public class Mobile {
    @Id
    @Column(name = "m_id")
    private int mid;
    private String brand;
    private int ram;
    @ManyToOne
    private User user;

    public Mobile(int mid, String brand, int ram) {
        this.mid = mid;
        this.brand = brand;
        this.ram = ram;
    }

    public Mobile() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mid=" + mid +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
