package pro.sky.java.course2;

import pro.sky.java.course2.exceptions.WrongLoginException;
import pro.sky.java.course2.exceptions.WrongPasswordException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] login = {"S", "k", "y", "P", "r", "o", "_", "2", "0", "2", "3"};
        //используй для проверки исключения на длину {"S", "k", "y", "P", "r", "o", "_", "2", "0", "2", "3", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String [] password = {"g", "H", "j", "b", "r", "_", "7", "8", "T", "s"};
        String [] confirmPassword = {"g", "H", "j", "b", "r", "_", "7", "8", "T", "s"};


        changeUserExceptions(login, password, confirmPassword);
    }

    public static void changeUserExceptions(String[] login, String[] password, String[] confirmPassword) {

        String [] symbolUsed = {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_"};

        if (login.length > 20) {
            System.out.println("Превышена длина login");
            throw new WrongLoginException();
        }

        Boolean equalsAllSymbols = true;
        for (int i = 0; i < login.length; i++) {
            for (int j = 0; j < symbolUsed.length; j++) {
                if (login[i].equals(symbolUsed[j])) {
                    equalsAllSymbols = true;
                    break;
                } else equalsAllSymbols = false;
            }
            if (!equalsAllSymbols) {
                System.out.println("Ошибка в login, введите допустимый символ");
                throw new WrongLoginException();
            }
        }

        if (password.length > 20) {
            System.out.println("Превышена длина password");
            throw new WrongPasswordException();
        }

        for (int i = 0; i < password.length; i++) {
            for (int j = 0; j < symbolUsed.length; j++) {
                if (password[i].equals(symbolUsed[j])) {
                    equalsAllSymbols = true;
                    break;
                } else equalsAllSymbols = false;
            }
            if (!equalsAllSymbols) {
                System.out.println("Ошибка в password, введите допустимый символ");
                throw new WrongPasswordException();
            }
        }
        //сравнение password и confirmPassword
        if (Arrays.equals(password, confirmPassword)) {
        }
        else {
            System.out.println("Ошибка в confirmPassword, подтвердите правильный password");
            throw new WrongPasswordException();
        }

        System.out.println("login " + Arrays.toString(login) + " соответствует параметрам!");
        System.out.println("password " + " соответствует параметрам и подтверждён!");
    }
}