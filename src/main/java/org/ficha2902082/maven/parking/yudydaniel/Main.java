package org.ficha2902082.maven.parking.yudydaniel;
//importar dependencias
import org.ficha2902082.maven.parking.yudydaniel.entities.carro;
import org.ficha2902082.maven.parking.yudydaniel.entities.Cliente;
import org.ficha2902082.maven.parking.yudydaniel.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.yudydaniel.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        //crear dos instancias 
        //de la clase carro
        carro carrito1 = new carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.BUS;
        
        carro carrito2 = new carro();
        carrito2.placa = "GFR 456";   
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;


        
        Cliente clientecito = new Cliente();
        clientecito.nombre = "Daniel";
        clientecito.apellidos = "Zuñiga";
        clientecito.tipoDocumento 
                    = TipoDocumento.TI;
        clientecito.numeroId = 1127615970L;
        clientecito.celular = 3166617088L;

        //añadir carros al cliente
        //invocar, llamar, ejecutar
        //el metodo addCar

        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("REF 578", TipoVehiculo.TAXI);

        System.out.println("Cliente:" + clientecito.nombre +" " +clientecito.apellidos);
        System.out.println("documento:" + clientecito.numeroId);
        System.out.println("Vehiculos:");
        for (carro c : clientecito.misCarros){
            System.out.println("placa" + " "+ c.placa);
            System.out.println("Tipo" + " "+ c.tipoVehiculo);
            System.out.println("_________");
        }


        System.out.println("Tipo de Documeto:" + clientecito.tipoDocumento);
        System.out.println("Celular:" + clientecito.celular);
        

    }
}