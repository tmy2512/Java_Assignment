package entity;

public class Manager extends User{
    private int expInYear;

    public Manager(int id, String fullName, String email, String passWordU, String role, int projectId) {
        super(id, fullName, email, passWordU, role, projectId);

    }

    public Manager(int id, String fullName, String email, String role) {
        super(id, fullName, email, role);
    }

    public Manager(String email, String passWordU) {
        super(email, passWordU);
    }

    @Override
    public String listTable() {
        return super.listTable() ;
    }
}
