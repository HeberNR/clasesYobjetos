package clasesyobjetos.model;

public class Marca {
  private int id;
  private String nomMarca;

  public Marca(){}
  public Marca(int id, String nomMarca) {
    this.id = id;
    this.nomMarca = nomMarca;
  }

  // por cada atributo 2 metodos get: obtener el dato que guarda el atributo
  // set: darle valor al atributo


  public void setNomMarca(String nomMarca) {
    this.nomMarca = nomMarca;
  }

  public String getNomMarca(){
    return this.nomMarca;
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  //mostrar datos
  public String toString(){
    return "id " + this.id + " Marca " + this.nomMarca;
  }
}
