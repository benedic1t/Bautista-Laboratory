package Activity02;

public class Person{
    private String name;
    private int Id;

    public Person(String name, int Id){
        this.name = name;
        this.Id = Id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return Id;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
    }
        public static class SchoolTest {
            public static void main(String [] args){
            
            Students stundents = new Students("Benedict Bautista", 12345, "College Student");
            Teacher teacher = new Teacher("Archie Menisis", 67890, "Object Oriented Programming");
            Staff staff = new Staff("Rafael Requizo", 54321, "IT Department");
            System.out.println("Student Information:");
            stundents.displayInfo();
            System.out.println("\n");


            System.out.println("Teacher Information:");
            teacher.displayInfo();
            System.out.println("\n");

            System.out.println("Staff Information:");
            staff.displayInfo();
            System.out.println("\n");
            
            
}
        
    }
}
    
    
