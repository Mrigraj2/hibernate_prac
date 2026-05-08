package mapping.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Engineer {

    @Id
    private int eid;
    private String name;
    private String stack;

    @ManyToMany(mappedBy = "engineers")
    private List<Laptop> laptops;

    public Engineer(int eid, String name, String stack, List<Laptop> laptops) {
        this.eid = eid;
        this.name = name;
        this.stack = stack;
        this.laptops = laptops;
    }

    public Engineer() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", stack='" + stack + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
