package Test1;

import java.util.Date;

public class Account {
    private int id;
    private String email;
    private String fullname;
    private String username;
    private Department department;
    private Position position;
    private Date createDate;
    private Group[] groups;

    public Account() {
    }

    public Account(int id, String email, String fullname, String username, Department department, Position position, Date createDate, Group[] groups) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.username = username;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }
//
}
