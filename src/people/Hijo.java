
package people;

public class Hijo extends Persona {
    
    public String hobbits;
    public String Sh;
    public String Vd;
    
    public Hijo(String sexo, String cabelloco, String ojosco, int edad, float peso, float estatura, String hobbits, String Sh, String Vd){
        super(sexo, cabelloco, ojosco, edad, peso, estatura);
        this.hobbits = hobbits;
        this.Sh = Sh;
        this.Vd = Vd;
    }

    public void presentar(){
    System.out.println("El hijo es de sexo "+ getSexo() + ", el color de su cabello es " + getCabelloco() +  
                          ", sus ojos son de color " + getOjosco() + ", tiene una edad de "+ getEdad() + 
                          " además, su estatura es "+ getEstatura() + " m " + ", y su peso es de " + getPeso() + " Kg. Su hobbit favorito es "
                          + hobbits + ", le encanta el super heroe de " + Sh + " y su videojuego favorito es " + Vd);
   }
}

