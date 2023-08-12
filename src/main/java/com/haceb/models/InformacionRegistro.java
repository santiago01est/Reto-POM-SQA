package com.haceb.models;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import com.haceb.utils.Excel;


public class InformacionRegistro {
    private static ArrayList<Map<String, String>> informacion= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            informacion = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return informacion;
    }
}
