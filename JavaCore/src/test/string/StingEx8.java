package test.string;

public class StingEx8 {
    public static void main(String[] args) {
        String s1 = "Як умру, то поховайте" +
                "Мене на могилі," +
                "Серед степу широкого," +
                "На Вкраїні милій," +
                "Щоб лани широкополі," +
                "І Дніпро, і кручі" +
                "Було видно, було чути," +
                "Як реве ревучий." +
                "Як понесе з України" +
                "У синєє море" +
                "Кров ворожу... отойді я" +
                "І лани, і гори —" +
                "Все покину і полину" +
                "До самого бога" +
                "Молитися... а до того" +
                "Я не знаю бога." +
                "Поховайте та вставайте," +
                "Кайдани порвіте" +
                "І вражою злою кров'ю" +
                "Волю окропіте." +
                "І мене в сем'ї великій," +
                "В сем'ї вольній, новій," +
                "Не забудьте пом'янути" +
                "Незлим тихим словом.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++){
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != '.' && c1 != ',' && c1 != ' ' && c1 != ':' &&c1 != '\'' && c1 != '-' && c1 == c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
