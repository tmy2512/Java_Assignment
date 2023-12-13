package entity;

public class User {
    private  int id;
    private  String fullName;
    private String email;
    private  String passWordU;
    private String role;
    private int projectId;

    public User(int id, String fullName, String email, String passWordU, String role, int projectId) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.passWordU = passWordU;
        this.role = role;
        this.projectId = projectId;
    }

    public User(int id, String fullName, String email, String role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }

    public User(String email, String passWordU) {
        this.email = email;
        this.passWordU = passWordU;
    }

    public String  listTable() {
        return ""+id+"   "+fullName + "        " +email + "      "+role  ;
    }
}
