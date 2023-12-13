package entity;

public class Employee extends User{
    private String proSkill;

    public Employee(int id, String fullName, String email, String role) {
        super(id, fullName, email, role);

    }

    public Employee(int id, String fullName, String email, String passWordU, String role, int projectId, String proSkill) {
        super(id, fullName, email, passWordU, role, projectId);
        this.proSkill = proSkill;
    }



    @Override
    public String listTable() {
        return super.listTable() ;
    }
}
