package org.course.part03.lesson27.lesson;

import org.course.part03.lesson27.lesson.controller.AppController;
import org.course.part03.lesson27.lesson.db.Database;
import org.course.part03.lesson27.lesson.db.FileDb;
import org.course.part03.lesson27.lesson.db.InMemoryDb;
import org.course.part03.lesson27.lesson.model.User;
import org.course.part03.lesson27.lesson.service.AppService;
import org.course.part03.lesson27.lesson.util.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Database database =
                new FileDb();
//                new InMemoryDb();
        AppService appService = new AppService(database);
        AppController appController = new AppController(appService);
        Scanner sc = new Scanner(System.in);

        String menu = Menu.getMenu();
        System.out.println(menu);

        int id = getMenuNumber();
        if (id == 1) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            boolean isOk = appController.login(username, password);
            if (isOk) System.out.println("Logged in successfully...");
            else System.out.println("Username or password is incorrect!");
        } else if (id == 2) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            appController.register(new User(username, password));
        }
    }

    private static int getMenuNumber() {
        int num = -1;
        boolean isValid = false;
        while (!isValid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter menu number: ");
                num = sc.nextInt();
                if (num < 1 || num > 2)
                    throw new IllegalArgumentException(String.format("Please, choose correct menu number. You chose: %d", num));
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Your input is wrong. Please, try again!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return num;
    }
}