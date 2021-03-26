import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date dateToEnd1 = new Date(System.currentTimeMillis() + 3600000);
        Date dateToEnd2 = new Date(System.currentTimeMillis() + 86400000);
        Date dateToEnd3 = new Date(System.currentTimeMillis() + 604800000);

        Object subtask1 = new Subtask("Sub Printing","Printing", "Printing documents", TaskCategory.IN_PROGRESS, dateToEnd1.toString());
        Object subtask2 = new Subtask("Sub Measuring","Measuring", "Measuring temperature", TaskCategory.NEW, dateToEnd2.toString());
        Object subtask3 = new Subtask("Sub Waiting", "Waiting", "Waiting for new tasks", TaskCategory.DONE, dateToEnd3.toString());

        Object task1 = new Task("Printing", "Printing documents", TaskCategory.IN_PROGRESS, dateToEnd1.toString());
        Object task2 = new Task("Measuring", "Measuring temperature", TaskCategory.NEW, dateToEnd2.toString());
        Object task3 = new Task("Waiting", "Waiting for new tasks", TaskCategory.DONE, dateToEnd3.toString());
    }
}
