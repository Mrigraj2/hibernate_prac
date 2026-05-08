package mapping.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Smartphone_user")
public class User {

    @Id
    private int index;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Mobile> mobiles;

    public User(int index, String name, List<Mobile> mobiles) {
        this.index = index;
        this.name = name;
        this.mobiles = mobiles;
    }

    public User() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", mobiles=" + mobiles +
                '}';
    }
}
