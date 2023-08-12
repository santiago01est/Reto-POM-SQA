package com.haceb.utils;

public class CapturarInformacion {
    
    public static void guardarNombre(String nombreProducto) {

        Excel.escrituraExcel(
                "src/test/resources/data/Data.xlsx",
                nombreProducto,2,0);
    }
}
