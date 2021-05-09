
package people;
import java.util.Scanner;

  class Persona {
   protected String sexo, cabelloco, ojosco;
   protected float peso, estatura;
   protected int edad;
   
   Persona (String sexo, String cabelloco, String ojosco, int edad, float peso, float estatura){
   this.sexo = sexo;
   this.cabelloco = cabelloco;
   this.ojosco = ojosco;
   this.edad = edad;
   this.estatura = estatura;
   this.peso = peso;
  }
   public String getSexo(){return sexo;}
   public String getCabelloco(){return cabelloco;}
   public String getOjosco(){return ojosco;}
   public int getEdad(){return edad;}
   public float getPeso(){return peso;}
   public float getEstatura(){return estatura;}

   void presentar(){
       System.out.println("La persona es de sexo "+ getSexo() + ", el color de su cabello es "+ getCabelloco()+ 
                          ", sus ojos son de color "+ getOjosco()+ ", tiene una edad de "+ getEdad() + 
                          " además, su estatura es "+ getEstatura() + " m" + ", y su peso es de " + getPeso() + " Kg");
   }
  
}  
public class People {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String sexo, cabelloco, ojosco, hobbits, Sh, Vd;
       float peso, estatura;
       int edad;
       
       System.out.println("¿Cual es el sexo de la persona?");
       sexo = sc.nextLine();
       System.out.println("¿Cual es el color del cabello de la persona?");
       cabelloco = sc.nextLine();
       System.out.println("¿Cual es el color de los ojos de la persona?");
       ojosco = sc.nextLine();
       System.out.println("¿Cual es la edad de la persona?");
       edad = sc.nextInt();
       sc.nextLine();
       System.out.println("¿Cual es el peso de la persona en Kg?");
       peso = sc.nextFloat();
       sc.nextLine();
       System.out.println("¿Cual es la estatura de la persona en metros?");
       estatura = sc.nextFloat();
       sc.nextLine();
               
       Persona x;
       x = new Persona(sexo, cabelloco, ojosco, edad, peso, estatura);
       x.presentar();
       System.out.println("Ahora ingresa los datos del hij@");
      
       System.out.println("¿Cual es el sexo del hij@?");
       sexo = sc.nextLine();
       System.out.println("¿Cual es el color del cabello del hij@?");
       cabelloco = sc.nextLine();
       System.out.println("¿Cual es el color de los ojos del hij@?");
       ojosco = sc.nextLine();
       System.out.println("¿Cual es la edad del hij@?");
       edad = sc.nextInt();
       sc.nextLine();
       System.out.println("¿Cual es el peso del hij@ en Kg?");
       peso = sc.nextFloat();
       sc.nextLine();
       System.out.println("¿Cual es la estatura del hij@ en metros?");
       estatura = sc.nextFloat();
       sc.nextLine();
       System.out.println("¿Cual es el hobbit favorito del hij@");
       hobbits = sc.nextLine();
       System.out.println("¿Cual es el super heroe favorito del hij@?");
       Sh = sc.nextLine();
       System.out.println("¿Cual es el videojuego favorito del hij@?");
       Vd = sc.nextLine();
       
       Hijo h;
       h = new Hijo(sexo, cabelloco, ojosco, edad, peso, estatura, hobbits, Sh, Vd);
       h.presentar();
       
       
    }
    
}


