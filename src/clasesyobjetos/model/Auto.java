package clasesyobjetos.model;


/*@author Heber
 * Auto class
 * @date
 */
public class Auto {

  //atributos
  private int id;
  private Marca marca;
  private String modelo;
  private int anio;
  private String color;
  private String dominio;
  private double valor;


  //constructores, siempre son publicos por defecto
  public Auto() {
    this.marca = new Marca();
  }

  public Auto(Marca marca, String modelo, String dominio) {
    this.marca = marca;
    this.modelo = modelo;
    this.dominio = dominio;
  }

  public Auto(int id, Marca marca, String modelo, int anio,
              String color, String dominio, double valor) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
    this.dominio = dominio;
    this.valor = valor;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

  public Marca getMarca() {
    return this.marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public int getAnio() {
    return this.anio;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setDominio(String dominio) {
    this.dominio = dominio;
  }

  public String getDominio() {
    return this.dominio;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }


  //métodos
  public String mostrarDatos() {
    return "ID: " + id + "\n"
        + "Marca: " + marca.toString() + "\n"
        + "Modelo: " + modelo + "\n"
        + "Año: " + anio + "\n"
        + "Color: " + color + "\n"
        + "Dominio: " + dominio + "\n"
        + "Valor: " + valor;

  }
}
