package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueues {
    private LinkedList<Tasks> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Tasks task) {
        int index = 0;
        for (Tasks element : tasks) {
            if (element.getPriority() == 1) {
                index = element.getPriority();
            }

        }

        this.tasks.add(index, task);
    }


    public Tasks take() {
        return tasks.poll();
    }
}
