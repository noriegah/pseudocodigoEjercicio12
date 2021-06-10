import java.util.*;

public class Practica12 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int altura=0;
    int edad=0;
    int sex;
    int sumaltura=0;
    int sumaedad=0;
    int hombres=0;
    int mujeres=0;
    int i=0;
    int k=0;
    int j=0;
    while (altura>=0){
        System.out.println("Ingrese su altura");
        altura=scanner.nextInt();
        System.out.println("Ingrese su edad");
        edad=scanner.nextInt();
        System.out.println("Ingresse su sexo, Masculino=0, Femenino=1");
        sex=scanner.nextInt();
        j++;
        if (sex==0){
            hombres+=altura;
            i++;
        }else{
            mujeres+=altura;
            k++;
        }
        sumaedad+=edad;
    }
    double promMujeres=mujeres/k;
    double promhombres=hombres/i;
    double promedades=sumaedad/i;
    System.out.println("El promedio de la altura de las mujeres es "+promMujeres);
    System.out.println("El promedio de la altura de los hombres es "+promhombres);
    System.out.println("El promedio de las edades es "+promedades);
}
}