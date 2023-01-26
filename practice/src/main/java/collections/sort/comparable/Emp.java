package collections.sort.comparable;

public class Emp implements Comparable<Emp> {
    private int id;
    private String name;
    private int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmp{" + "id=" + id + ", name=" + name  + ", salary=" + salary + "}\n";
    }

     @Override
    public int compareTo(Emp e) {
//        return this.id-e.id;
//        return this.name.compareTo(e.name);
        return this.salary-e.salary;
    }
}
