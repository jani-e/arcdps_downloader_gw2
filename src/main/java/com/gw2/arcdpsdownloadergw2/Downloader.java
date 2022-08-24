/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gw2.arcdpsdownloadergw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jani Eriksson <https://github.com/jani-e>
 */
public class Downloader {

    private URL url;
    private String filePath;

    public Downloader() {
        try {
            this.url = new URL("https://www.deltaconnected.com/arcdps/x64/d3d11.dll");
            this.filePath = "C:/Program Files/Guild Wars 2/d3d11.dll";
        } catch (MalformedURLException ex) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean downloadFile() {
        try {
            InputStream inputStream = this.url.openStream();
            Files.copy(inputStream, Paths.get(this.filePath), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
