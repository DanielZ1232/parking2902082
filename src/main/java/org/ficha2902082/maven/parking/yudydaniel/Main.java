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
import java.time.LocalDate;
import java.time.LocalTime;
import org.ficha2902082.maven.parking.yudydaniel.entities.Empleado;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {

                // crear dos cupos
                // instanciar dos cupos
                Cupo cupito1 = new Cupo();
                cupito1.ancho = 1.0;
                cupito1.largo = 4.5;
                cupito1.letra = 'A';

                Cupo cupito2 = new Cupo('B',
                                5.0,
                                2.5);

                Carro carrito1 = new Carro("ASJ 456",
                                TipoVehiculo.MOTO);

                Carro carrito2 = new Carro("UYT 123",
                                TipoVehiculo.CAMIONETA);

                // Instanciar una cliente
                Cliente clientecito1 = new Cliente("Daniel", "Zuñiga", TipoDocumento.TI, 1127615970L, 3166617088L);

                // Instanciar Empleado
                Empleado empleado1 = new Empleado("Luis", 54321L);
                Empleado empleado2 = new Empleado("Miguel", 65754L);
                Empleado empleado3 = new Empleado("Alex Calor", 76590987L);

                // Vincular carros al cliente
                clientecito1.addCar(carrito1);
                clientecito1.addCar(carrito2);
                clientecito1.addCar("FRD 432", TipoVehiculo.CAMION);

                // Declarar lista de registro
                List<Registro> misRegistros = new ArrayList<>();

                // Instanciar dos registros de E/S
                Registro registro1 = new Registro(
                                LocalDate.of(2024, Month.JANUARY, 23),
                                LocalTime.of(15, 28, 35),
                                LocalDate.of(2024, Month.FEBRUARY, 23),
                                LocalTime.of(6, 10, 21),
                                50000.00,
                                clientecito1.misCarros.get(0),
                                cupito1, empleado1);

                Registro registro2 = new Registro(
                                LocalDate.of(2024, Month.APRIL, 7),
                                LocalTime.of(18, 20, 28),
                                LocalDate.of(2024, Month.OCTOBER, 15),
                                LocalTime.of(9, 28, 30),
                                70000.00,
                                clientecito1.misCarros.get(0),
                                cupito2, empleado2);

                LocalDate fi1 = LocalDate.of(2023,
                                Month.DECEMBER,
                                24);

                LocalTime hi1 = LocalTime.of(11, 32, 0);

                LocalDate ff1 = LocalDate.of(2024,
                                Month.APRIL,
                                28);

                LocalTime hf1 = LocalTime.of(11, 22, 0);

                Double valorR2 = 50000.0;

                Registro registro3 = new Registro(fi1, hi1, ff1, hf1, valorR2, clientecito1.misCarros.get(0), cupito2,
                                empleado3);

                Registro registro4 = new Registro(
                                LocalDate.of(2024, Month.JULY, 9),
                                LocalTime.of(9, 10, 20),
                                LocalDate.of(2024, Month.JULY, 15),
                                LocalTime.of(5, 32, 30),
                                7000.00,
                                clientecito1.misCarros.get(0),
                                cupito2, empleado3);

                Registro registro5 = new Registro(
                                LocalDate.of(2024, Month.FEBRUARY, 10),
                                LocalTime.of(7, 43, 18),
                                LocalDate.of(2024, Month.JUNE, 23),
                                LocalTime.of(12, 20, 30),
                                90000.00,
                                clientecito1.misCarros.get(0),
                                cupito2, empleado2);

                // vincular los registros a la lista
                // de registros
                misRegistros.add(registro1);
                misRegistros.add(registro2);
                misRegistros.add(registro3);
                misRegistros.add(registro4);
                misRegistros.add(registro5);

                // Recorrer la lista de registros
                for (Registro r : misRegistros) {
                        System.out.println(
                                        "Placa: " + r.carro.placa + "|" +
                                                        "Cupo: " + r.cupo.letra + "|" +
                                                        "Valor: " + r.valor + "|" +
                                                        "Fecha Inicio: " + r.fechaInicio.toString() + "|" +
                                                        "Hora Inicio: " + r.horaInicio.toString() + "|" +
                                                        "Fecha Fin: " + r.fechaFin.toString() + "|" +
                                                        "Hora Fin: " + r.horaFin.toString() + "|" +
                                                        "Empleado: " + r.empleado.codigo + "|");

                }
        }

}