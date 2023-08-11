package com.haceb.utils;

public class CapturarInformacion {
    
    public static void guardarNombre(String nombreProducto) {

        Excel.escrituraExcel(
                "src/main/resources/Data/Data.xlsx",
                nombreProducto,0,0);
    }
}
