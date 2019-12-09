package ru.job4j.search;
import java.util.Queue;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (int count = 0; count < tasks.size(); count++) {
            if (task.getPriority() <= tasks.get(count).getPriority()) {
                index = count;
                break;
            }
        }
        tasks.add(index, task);
    }


    public Task take() {
        return this.tasks.poll();
    }
}
