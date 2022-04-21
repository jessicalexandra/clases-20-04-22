package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inpuData = new Scanner(System.in);
       /* Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> data= new ArrayList<>();

        data.add(7);
        data.add(5);
        data.add(8);

        for (int i=0; i< data.size();i++){
            System.out.println(data.get(i));
        }*/

        List<Monitor> monitores = new ArrayList<>();
        Monitor monitor = new Monitor();

       String respuesta= "s";
        while (respuesta.equals("s")) {
            System.out.println("ingrese la marca");
            String brand = inpuData.nextLine();
            monitor.setBrand(brand);
            System.out.println("ingrese el nombre");
            String name= inpuData.nextLine();
            monitor.setName(name);
            System.out.println(" ingrese la referencia");
            String referencia = inpuData.nextLine();
            monitor.setReferencia(referencia);
            System.out.println("ingrese la resolucion de la pantalla");
            monitor.setResolucion(Double.parseDouble(inpuData.nextLine()));
            System.out.println("ingrese el tamaño de la pantalla");
            monitor.setScreensize(inpuData.nextLine());
            monitores.add(monitor);
            System.out.println("Digite s para ingresar mas datos");
             respuesta=inpuData.nextLine();
        }




    }
}

