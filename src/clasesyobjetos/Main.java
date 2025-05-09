package clasesyobjetos;

import clasesyobjetos.model.Auto;
import clasesyobjetos.model.Marca;

public class Main {
  public static void main(String[] args) {

    Marca marca1 = new Marca(1, "Citroen");
    Marca marca2 = new Marca(2, "Renault");
    Marca marca3 = new Marca();
    System.out.println(marca3.toString());
    marca3.setNomMarca("VM");
    marca3.setId(3);
    System.out.println(marca3.toString());

    //Crear obj instancia auto.
    //Uso el operado new para crear la instancia de ese objeto.
    //Cada vez que se usa el operador nwe, llamamos a un método constructor.
    //Son los que tienen el mismo nombre de la clase y se ejecutan cada vez que ejecuta.

    Auto auto1 = new Auto();
    //System.out.println(auto1.mostrarDatos());
    auto1.setId(1);
    auto1.setMarca(marca3);
    auto1.setModelo("Gol");
    auto1.setColor("Gris");
    auto1.setAnio(2018);
    auto1.setDominio("AC555MM");
    auto1.setValor(12000000);
    System.out.println(auto1.mostrarDatos());

    Auto auto2 = new Auto(marca1, "C4", "AG654MM");
    System.out.println(auto2.mostrarDatos());

    Auto auto3 = new Auto(1, marca2, "Master",
        2020, "Blanco", "AC654LL", 3000000);
    System.out.println(auto3.mostrarDatos());
  }
}