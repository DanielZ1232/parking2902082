package org.ficha2902082.maven.parking.yudydaniel.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroId;
    public Long celular;
    public List<Carro> misCarros;

//metodo 1: Añadir carros al cliente
//definir metodo(firma del metodo - signature):
// - modificar acceso
// -tipo de dato de retorno
// -nombre del metodo
//parametros(entradas, inputs):
// 1. tipo de dato del parametro
// 2. nombre del paramentro

public void addCar(Carro c){
    this.misCarros.add(c);
}

public Cliente(String nombre, String apellidos, TipoDocumento tipoDocumento, Long numeroId, Long celular) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.tipoDocumento = tipoDocumento;
    this.numeroId = numeroId;
    this.celular = celular;
    this.misCarros = new ArrayList<Carro>();
}



    //sobrecarga del metodo addCar
public void addCar(String placa, TipoVehiculo tipoVehiculo){
        //construir (instanciar)
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);
}

    //sobrecarga del metodo:
    //En una clase se permiten metodos con el mismo nombre
    //Pero con diferente firma


}
