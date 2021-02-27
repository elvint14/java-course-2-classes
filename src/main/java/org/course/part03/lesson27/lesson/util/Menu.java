package org.course.part03.lesson27.lesson.util;

public enum Menu {
    LOGIN(1, "Login"),
    REGISTER(2, "Register"),
    WRONG(-1, "Wrong");

    private final Integer id;
    private final String name;

    Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d. %s", id, name);
    }

    public static String getMenu() {
        Menu[] menus = Menu.values();
        StringBuilder menuString = new StringBuilder();
        for (Menu menu : menus) {
            if (!menu.equals(Menu.WRONG))
                menuString.append(menu.toString()).append("\n");
        }
        return menuString.toString();
    }
}