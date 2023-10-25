package pro.sky.java.course2;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String login = "SkyPro_2023";
        String password = "gHjbr_78Ts";
        String confirmPassword = "gHjbr_78Ts";
        String [] symbolUsed = {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_"};

        changeUserExceptions(login, password, confirmPassword, symbolUsed);
    }

    public static void changeUserExceptions(String login, String password, String confirmPassword, String [] symbolUsed) {

        if ((login.length() > 20) || (password.length() > 20)) System.out.println("WrongLoginException()");
/*
        for (int i = 0; i < login.length(); i++) {
            for (int sym = 0; sym < symbolUsed.length; sym ++) {
                if (Arrays.equals(login[i],symbolUsed[sym])) {
                    continue;
                } else break;
 */
        for (int i = 0; i < login.length(); i++) {

            if (Arrays.equals(login[i], symbolUsed)) {
                System.out.println("Символ имеется");
            }
            else System.out.println("Введите допустимые символы");
        }
        System.out.println("Hello world!");
    }
}