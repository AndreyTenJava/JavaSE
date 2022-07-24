package modal.Lesson1_Task7;

import java.util.ArrayList;

public class DBManager {
   private static ArrayList<Footballer> footballers = new ArrayList<>();

   private static Long id = 4L;

    static {
        footballers.add(new Footballer(1L, "Ivan", "Ivanov", 650000, "Real Madrid FC", 8000000));
        footballers.add(new Footballer(2L, "Petr", "Petrov", 710000, "Chelsea FC", 1200000));
        footballers.add(new Footballer(3L, "Akhmet", "Akhmetov", 35000, "Kairat FC", 100000));
    }

    public static void addFootballer(Footballer footballer){
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

    public static ArrayList<Footballer> getAllFootballers() {
        return footballers;
    }
}
