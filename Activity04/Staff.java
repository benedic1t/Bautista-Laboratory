package Activity04;

public class Staff extends Person {
    private String Department;

    public Staff(String name, int id, String Department) {
        super(name, id);
        this.Department = Department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + Department);
    }
}
