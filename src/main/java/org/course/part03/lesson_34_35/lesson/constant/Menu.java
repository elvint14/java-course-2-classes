package org.course.part03.lesson_34_35.lesson.constant;

public enum Menu {
    LOGIN(1L, "Login"),
    REGISTER(2L, "Register"),
    EXIT(3L, "Exit"),
    UNKNOWN(-1L, "Unknown");

    private final Long id;
    private final String label;

    Menu(Long id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("%d. %s", id, label);
    }

    public static String getMenu() {
        StringBuilder result = new StringBuilder().append("**********\n");
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (!menu.equals(Menu.UNKNOWN)) result.append(menu.toString()).append("\n");
        }
        return result.append("**********\n").toString();
    }
}