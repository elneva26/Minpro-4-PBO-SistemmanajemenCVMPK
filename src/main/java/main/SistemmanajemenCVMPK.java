package main;

import controller.MenuController;
import java.util.Scanner;
import config.EntityManagerProvider;

public class SistemmanajemenCVMPK {

    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);

        Scanner scanner = new Scanner(System.in);

        new MenuController(scanner).jalankan();

        EntityManagerProvider.tutup();
        scanner.close();
    }
}