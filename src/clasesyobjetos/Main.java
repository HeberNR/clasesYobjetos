package clasesyobjetos;

import clasesyobjetos.model.Auto;
import clasesyobjetos.model.Marca;

public class Main {
  public static void main(String[] args) {

    Marca marca1 = new Marca(1, "Citroen");
    Marca marca2 = new Marca(2, "Renault");

    //crear obj instacia de Auto
    // uso el operador new para crear el obj. Importar el obj
    Auto auto1 = new Auto();

    //System.out.println(auto1.mostrarDatos());

    Auto auto2 = new Auto(marca1, "C4", "AG654MM");
    System.out.println(auto2.mostrarDatos());

    Auto auto3 = new Auto(1, marca2, "Master",
        2020, "Blanco", "AC654LL", 3000000);
    System.out.println(auto3.mostrarDatos());
  }
}