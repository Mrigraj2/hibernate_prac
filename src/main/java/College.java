import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
    @Id
    private int age;
    private String name;
    private int rollNo;

    public College(){}

    public College(int age, String name, int rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
