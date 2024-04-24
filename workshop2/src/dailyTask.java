import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class dailyTask {
    public static void main(String[] args) {
        // Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan
        // bir Arraylist oluşturunuz.ArrayList içinde bulunan görevleri güncelleyen,
        // tamamlanan görevleri ise silen algoritmayı yazınız.

        Scanner scanner = new Scanner(System.in);

        List<HashMap<String, Object>> dailyTasks = new ArrayList<>();


        HashMap<String, Object> task1 = new HashMap<>();
        task1.put("Task name", "Workshop1");
        task1.put("Completion", false);
        dailyTasks.add(task1);

        HashMap<String, Object> task2 = new HashMap<>();
        task2.put("Task name", "WorkShop2");
        task2.put("Completion", false);
        dailyTasks.add(task2);

        HashMap<String, Object> task3 = new HashMap<>();
        task3.put("Task name", "Workshop3");
        task3.put("Completion", false);
        dailyTasks.add(task3);


        for (var task : dailyTasks) {
            System.out.println(task.get("Task name"));
            boolean control = (boolean) task.get("Completion");
            if (control == false) {
                System.out.println("Task is not completed");
                System.out.println("----------------------");
            } else {
                System.out.println("Task is completed");
                System.out.println("----------------------");
            }
        }

        int iterate = 0;
        for (var task : dailyTasks) {
            System.out.print("Update" + (iterate + 1) + ".task complete?");
            String yesNo = scanner.next();
            yesNo.toLowerCase();
            if (yesNo.equals("yes")) {
                System.out.println("Task is completed.");
                task.put("Completion", true);

            } else {
                System.out.println("Task is not completed.");
            }

            iterate++;
            System.out.println("----------------------");
        }
        List<HashMap<String, Object>> deleted = new ArrayList<>();
        for (var task : dailyTasks) {
            var control = (boolean) task.get("Completion");
            if (control == true) {
                deleted.add(task);
                break;
            }
        }
        dailyTasks.removeAll(deleted);

        System.out.println("Uncompleted tasks");
        for (var task : dailyTasks) {
            var control = (boolean) task.get("Completion");
            if (control == false) {
                System.out.println(task.get("Task name"));
            }
            else{
                System.out.println("Task is completed");
                System.out.println("----------------------");
        }

    }
}}