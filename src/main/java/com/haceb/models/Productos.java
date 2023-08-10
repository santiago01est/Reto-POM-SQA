package com.haceb.models;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.haceb.utils.Excel;


public class Productos {
    private static ArrayList<Map<String, String>> productos= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            productos = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "productos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }
}
