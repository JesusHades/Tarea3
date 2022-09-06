
package EMP;

import java.io.*;
import ADT.Arreglo;

public class Nomina {
    
String nombreEmpresa;
Arreglo<Empleados> nomina;
String rutaArchivo;

    
public Nomina (){
    
}

public Nomina(String ruta){
   this.rutaArchivo = ruta;
}

public void leerArchivo(){
    
int contador = 1;
int max= 0;
int min = 299999;
String nomCom = null;
String nomC = null;
Empleados m;

try {
    FileReader fr = new FileReader("\\D:\\junio.dat");
    BufferedReader br = new BufferedReader(fr);
    String linea, n[];
    
    while((linea = br.readLine()) != null){
        n = linea.split(",");
    if (contador != 1){
      m = new Empleados(Integer.parseInt(n[0]), n[1], n[2], n[3],Double.parseDouble(n[5]), Integer.parseInt(n[4]), Integer.parseInt(n[6]));
      System.out.println(m.toString());
      System.out.println("Sueldo total: "+m.calcularSueldo()); 
    }
    if(Integer.parseInt(n[6])>max){
    max = Integer.parseInt(n[6]);
    nomCom =n[1]+ " " + n[2]+ " " + n[3];
    } 
    if (Integer.parseInt(n[6])<min){
    min =Integer.parseInt(n[6]);
    nomC = n[1]+ " " + n[2]+ " " + n[3];
    }
  contador++;  
}
    
System.out.println("El empleado con mayor antiguedad es: "+ nomC + " " + min );
System.out.println("El empleado con menor antiguedad es: "+ nomCom + " " +max);  

} catch (Exception ex){
    System.out.println(ex); 
}

} 

}    
    
      

