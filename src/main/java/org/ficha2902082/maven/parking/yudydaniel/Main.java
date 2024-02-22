package org.ficha2902082.maven.parking.yudydaniel;
//importar dependencias

import org.ficha2902082.maven.parking.yudydaniel.entities.Cupo;
import org.ficha2902082.maven.parking.yudydaniel.entities.TipoDocumento;
import org.ficha2902082.maven.parking.yudydaniel.entities.TipoVehiculo;

import java.util.List;
import java.util.ArrayList;
import java.time.*;

import org.ficha2902082.maven.parking.yudydaniel.entities.Carro;
import org.ficha2902082.maven.parking.yudydaniel.entities.Cliente;
import org.ficha2902082.maven.parking.yudydaniel.entities.Registro;
public class Main {
    public static void main(String[] args) {
        
    //crear dos cupos
    //instanciar dos cupos 
    Cupo cupito1 = new Cupo();
    cupito1.ancho = 1.0;
    cupito1.largo = 4.5;
    cupito1.letra = 'A';



    Cupo cupito2 = new Cupo('B',
                            5.0,
                            2.5 );
 
    Carro carrito1 =  new Carro("ASJ 456", 
                                     TipoVehiculo.MOTO);
    
    Carro carrito2 = new Carro("UYT 123", 
                            TipoVehiculo.CAMIONETA);


    //Instanciar una cliente
    Cliente clientecito1 = new Cliente("Daniel", "Zuñiga", TipoDocumento.TI, 1127615970L, 3166617088L);
    
    //Vincular carros al cliente
    clientecito1.addCar(carrito1);
    clientecito1.addCar(carrito2);
    clientecito1.addCar("FRD 432", TipoVehiculo.CAMION);

      //Declarar lista de registro
    List<Registro> misRegistros = new ArrayList<>();
    
    //Instanciar dos registros de E/S
    Registro registro1 = new Registro(
        LocalDate.of(2024 , Month.JANUARY , 23) ,
        LocalTime.of(15 , 30 , 35),
        LocalDate.of(2024 , Month.FEBRUARY, 23),
        LocalTime.of(6 , 30 , 21),
        50000.00,
        clientecito1.misCarros.get(0),
        cupito1
    );  
    Registro registro2 = new Registro(
        LocalDate.of(2024 , Month.APRIL , 7) ,
        LocalTime.of(18 , 20 , 28),
        LocalDate.of(2024 , Month.OCTOBER, 15),
        LocalTime.of(9, 28 , 30),
        70000.00,
        clientecito1.misCarros.get(0),
        cupito2
    );  

     //vincular los registros a la lista
     //de registros
     misRegistros.add(registro1);
     misRegistros.add(registro2);


     //Recorrer la lista de registros
     for( Registro r :misRegistros ){
        System.out.println("Placa: "  + 
                                   r.carro.placa +  "|" + 
                                  "Cupo: " + r.cupo.letra + "|" +
                                  "Valor: " + r.valor + "|" +  
                                  "Fecha Inicio: " + r.fechaInicio.toString() + "|" +
                                  "Hora Inicio: " + r.horaInicio.toString() + "|" +
                                  "Fecha Fin: " + r.fechaFin.toString() + "|" +
                                  "Hora Fin: " + r.horaFin.toString() + "|" );

     }
    }


}