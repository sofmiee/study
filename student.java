abstract class Student { //абстрактный класс student
    private String name;
    private int course;
    private double exam;

    public Student(String name, int course, double exam) { //конструктор, инициализирующий поля классов
        this.name = name;
        this.course = course;
        this.exam = exam;
    }

    public String getname() {
        return name;
    }
    public int getсourse() {
        return course;
    }
    public double getexam() {
        return exam;
    }

    public abstract void writeExam(); // абстрактный метод
    public void printInfo() { //вывод всех данных
        System.out.println("Ф.И.О.: " + name + ", Курс: " + course +
                ", Оценка за последний экзамен: " + exam);
    }
}

class IUStudent extends Student { //класс наследует - получает все поля и методы родительского класса
    public IUStudent(String name, int course, double exam) {
        super(name, course, exam);
    }
    public void writeExam() {
        System.out.println(getname() + " из ИУ пишет экзамен");
    }
}
class MathStudent extends Student {
    public MathStudent(String name, int course, double exam) {
        super(name, course, exam);
    }
    public void writeExam() {
        System.out.println(getname() + " из ФН пишет экзамен");
    }
}