public class Student extends People{
    private EducationLevel  educationLevel;
    private String status;
    private ClassCredit[] registeredClass;

    public Student(EducationLevel educationLevel, String status, ClassCredit[] registeredClass) {
        this.educationLevel = educationLevel;
        this.status = status;
        this.registeredClass = registeredClass;
    }
}
