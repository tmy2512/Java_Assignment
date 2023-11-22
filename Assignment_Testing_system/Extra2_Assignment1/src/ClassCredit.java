public class ClassCredit {
    private String id;
    private String className;
    private int quantityOfStudent;
    private Teacher teacher;
    private Subject subject;

    public ClassCredit(String id, String className, int quantityOfStudent, Teacher teacher, Subject subject) {
        this.id = id;
        this.className = className;
        this.quantityOfStudent = quantityOfStudent;
        this.teacher = teacher;
        this.subject = subject;
    }
}
