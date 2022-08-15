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

    public UI() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--------\nOptions\n--------");
            System.out.println("1 - Download latest Arcdps");
            System.out.println("0 - Close program");
            int input = Integer.parseInt(this.scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input == 1) {
                download();
            }
        }
    }

    public void download() {
        Downloader dl = new Downloader();
        if (dl.downloadFile()) {
            System.out.println("Download successful");
        } else {
            System.out.println("Error in downloading");
        }
    }
}
