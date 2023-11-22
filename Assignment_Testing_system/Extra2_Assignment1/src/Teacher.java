public class Teacher extends People{
    private String level;
    private Float basicSalary;
    private double couefficentSalary;
    private String role;

    public Teacher(String level, Float basicSalary, double couefficentSalary, String role) {
        this.level = level;
        this.basicSalary = basicSalary;
        this.couefficentSalary = couefficentSalary;
        this.role = role;
    }
}
