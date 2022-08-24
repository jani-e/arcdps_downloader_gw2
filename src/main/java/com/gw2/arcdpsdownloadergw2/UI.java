/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gw2.arcdpsdownloadergw2;

import java.util.Scanner;

/**
 *
 * @author Jani Eriksson <https://github.com/jani-e>
 */
public class UI {

    private Scanner scanner;
    private FileHandler fileHandler;

    public UI() {
        this.scanner = new Scanner(System.in);
        this.fileHandler = new FileHandler();
    }

    public void start() {
        while (true) {
            System.out.println("\n--------\nOptions\n--------");
            System.out.println("1 - Download latest Arcdps");
            System.out.println("2 - Remove Arcdps");
            System.out.println("0 - Close program");
            System.out.print("\nOption: ");
            int input = Integer.parseInt(this.scanner.nextLine());
            switch (input) {
                case 1:
                    this.fileHandler.download();
                    break;
                case 2:
                    this.fileHandler.removeFile();
                    break;
                default:
                    return;
            }
        }
    }
}
