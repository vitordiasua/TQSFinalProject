package adress.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "dob", nullable = false, length = 50)
    private String dob;
    @Column(name = "snum", nullable = false, length = 50)
    private String snum;
    @Column(name = "sname", nullable = false, length = 50)
    private String sname;
    @Column(name = "pc1", nullable = false, length = 50)
    private int pc1;
    @Column(name = "pc2", nullable = false, length = 50)
    private int pc2;
    @Column(name = "city", nullable = false, length = 50)
    private String city;

    public Client() {
        // TODO constructor
    }

    public Client(String name, String dob, String snum, String sname, int pc1, int pc2, String city) {
        this.name = name;
        this.dob = dob;
        this.snum = snum;
        this.sname = sname;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.city = city;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob;
    }

    public String getSnum() {
        return this.snum;
    }

    public String getSname() {
        return this.sname;
    }

    public int getPc1() {
        return this.pc1;
    }

    public int getPc2() {
        return this.pc2;
    }

    public String getCity() {
        return this.city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
