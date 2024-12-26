
public class test {
    public static void main(String[] args) {
        // экземпляпы классов
        IUStudent iuStudent = new IUStudent("Михайлова Софья", 1, 4.9);
        MathStudent mathStudent = new MathStudent("Ядыкина Диана", 2, 5.0);

        //смотрим методы
        iuStudent.printInfo();
        iuStudent.writeExam();
        mathStudent.printInfo();
        mathStudent.writeExam();

        // экземпляр класса
        Sort Sort = new Sort();

        Sort.addStr("1343546");
        Sort.addStr("1");
        Sort.addStr("678765432435678908765455675776");
        Sort.addStr("0");
        Sort.addStr("88787878");;

        Sort.printStr();
        System.out.println(Sort.getMax());
        System.out.println(Sort.getLen());
    }
}