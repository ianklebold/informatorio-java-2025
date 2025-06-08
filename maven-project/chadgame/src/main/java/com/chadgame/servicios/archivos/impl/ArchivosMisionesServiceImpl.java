package com.chadgame.servicios.archivos.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.chadgame.dominio.Mision;
import com.chadgame.servicios.archivos.ArchivosMisionesService;
import com.opencsv.CSVWriter;

public class ArchivosMisionesServiceImpl implements ArchivosMisionesService{

    private final String UBICACION_ARCHIVO = "\\src\\main\\java\\com\\chadgame\\recursos\\";

    CSVWriter csvWriter;

    @Override
    public void exportarMisionesCSV(List<Mision> misiones) {
        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat("misiones-realizadas.csv");
        try{

            this.csvWriter = new CSVWriter(new FileWriter(ruta));

            String[] encabezado = {"NUMERO","PUNTAJE"};
            this.csvWriter.writeNext(encabezado);

            for (Mision mision : misiones) {
                String[] datos = {
                    Integer.toString( mision.getNumero() ),
                    Integer.toString( mision.getPuntaje() ),
                };
                this.csvWriter.writeNext(datos);
            }

            //Cerrar el csvWriter
            System.out.println("Exportacion exitosa");
            this.cerrarWriter();

        }catch (IOException e){
            System.out.println("Algo salio mal motivo :" + e.getMessage().concat(" Ubicacion archivo : " + ruta));
        }
    }

    private void cerrarWriter() {
        if (this.csvWriter != null){
            try{
                this.csvWriter.close();
            }catch (IOException e){
                System.out.println("Algo salio mal motivo :" + e.getMessage());
            }
        }
    }
}



