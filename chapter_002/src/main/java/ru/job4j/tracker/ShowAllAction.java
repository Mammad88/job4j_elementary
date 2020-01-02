package ru.job4j.tracker;

/**
 * @author Bruki Mammad (bruki_mammd@mail.ru)
 * @version $Id$
 * @since 02.01.2020
 */

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    /**
     * class ShowAllAction - отображает все созданные заявки.
     *
     * @param input   - ввод данных.
     * @param tracker - хранилище заявок.
     */

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        String name = input.askStr("Enter name: ");
        Item[] targetItem = tracker.findAll();
        for (Item items : targetItem) {
            System.out.println("Список всех заявок: " + items.getName());
        }
        return true;
    }
}
