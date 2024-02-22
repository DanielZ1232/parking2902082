package org.ficha2902082.maven.parking.yudydaniel.entities;


import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
  //atributos intrinsecos:
  public LocalDate fechaInicio;
  public LocalTime horaInicio;
  public LocalDate fechaFin;
  public LocalTime horaFin;
  public Double valor;

  //atrbutos de relacion
  public Carro carro;
  public Cupo cupo;

  //Constructor por defecto
  public Registro() {
  }

  //Constructor con parametros
  public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
      Carro carro, Cupo cupo) {
    this.fechaInicio = fechaInicio;
    this.horaInicio = horaInicio;
    this.fechaFin = fechaFin;
    this.horaFin = horaFin;
    this.valor = valor;
    this.carro = carro;
    this.cupo = cupo;
  }

  
  

}
