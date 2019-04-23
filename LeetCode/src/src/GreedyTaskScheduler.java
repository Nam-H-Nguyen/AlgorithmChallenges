import java.util.Arrays;
import java.util.List;

class Solution {
    public static int leastInterval(char[] tasks, int n) {
        List<String> taskList = Arrays.asList(tasks);

        int i = 0;
        for (List task: taskList) {
            if (task.indexOf(i) % n == 0) {
                task.add("idle");
            }
            i++;
        }
        return taskList.size();
    }

    public static void main(String[] args) {
        char[] tasks = {"A","A","A","B","B","B"};
        System.out.println(leastInterval(tasks, 2));
    }
}