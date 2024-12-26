import java.util.ArrayList; //динамический массив
import java.util.Comparator; //сортировка

public class Sort{
    private ArrayList<String> strings;

    public Sort() { //конструктор для новых объектов
        this.strings = new ArrayList<>();
    }

    public void addStr(String str) { //добавляем строки
        strings.add(str);
        strings.sort(Comparator.comparingInt(String::length)); //сортируем
    }

    public String getMax() { //получаем строку максимальной длины
        if (strings.isEmpty()) { //проаверка на пустоту
            return null;
        }
        return strings.get(strings.size() - 1); // возвращает последний элемент
    }

    public double getLen() { //вычисляем среднюю длину
        if (strings.isEmpty()) { //проверка на пустоту
            return 0.0;
        }
        int totalLen = strings.stream().mapToInt(String::length).sum(); //суммируем все длины
        return (double) totalLen / strings.size(); //получаем среднюю длину
    }


    public void printStr() { //выводим
        System.out.println("Строки в массиве: " + strings);
    }
}


