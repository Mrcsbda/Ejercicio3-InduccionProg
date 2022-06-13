package App;
public class App {
    public static int resultado;
    public static void main(String[] args) throws Exception {
        //Parte 1
        resultado = suma(4,67,90);
        System.out.println(resultado);
        //Parte 2
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }
    //Parte 1
    public static int suma(int a, int b, int c){
        return a + b + c;
    }      
}
//Parte 2 
class Coche {
    public int puertas = 4;

    public void SumarPuertas() {
        this.puertas++;
    }
}