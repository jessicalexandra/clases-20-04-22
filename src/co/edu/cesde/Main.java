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
        List<Cpu> cpus = new ArrayList<>();
        List<TV> tvs = new ArrayList<>();


        String respuesta = "s";
        while (respuesta.equals("s")) {
            System.out.println("Ingrese 1=monitor,2=cpu,3=tv,4=salir, 5=mostrar monitor,6=mostrar cpu,7=mostrar tv,8= Buscar monitor,9=Buscar cpu,10=Buscar tv");
            int opction = Integer.parseInt(inpuData.nextLine());
            if (opction == 1) {
                Monitor monitor = new Monitor();
                System.out.println("ingrese la marca");
                String brand = inpuData.nextLine();
                monitor.setBrand(brand);
                System.out.println("ingrese el nombre");
                String name = inpuData.nextLine();
                monitor.setName(name);
                System.out.println(" ingrese la referencia");
                String referencia = inpuData.nextLine();
                monitor.setReferencia(referencia);
                System.out.println("ingrese la resolucion de la pantalla");
                monitor.setResolucion(Double.parseDouble(inpuData.nextLine()));
                System.out.println("ingrese el tamaño de la pantalla");
                monitor.setScreensize(inpuData.nextLine());
                monitores.add(monitor);
            } else if (opction == 2) {
                Cpu cpu = new Cpu();
                System.out.println("ingrese la marca");
                String brand = inpuData.nextLine();
                cpu.setBrand(brand);
                System.out.println("ingrese el nombre");
                String name = inpuData.nextLine();
                cpu.setName(name);
                System.out.println(" ingrese la referencia");
                String referencia = inpuData.nextLine();
                cpu.setReferencia(referencia);
                System.out.println("ingrese el tamaño de la ram");
                cpu.setRam(inpuData.nextLine());
                System.out.println("ingrese el tamaño del disco");
                cpu.setHardDisk(inpuData.nextLine());
                cpus.add(cpu);
            } else if (opction == 3) {
                TV tv = new TV();
                System.out.println("ingrese la marca");
                String brand = inpuData.nextLine();
                tv.setBrand(brand);
                System.out.println("ingrese el nombre");
                String name = inpuData.nextLine();
                tv.setName(name);
                System.out.println(" ingrese la referencia");
                String referencia = inpuData.nextLine();
                tv.setReferencia(referencia);
                System.out.println("ingrese el tamaño del tv");
                tv.setScreensize(Double.parseDouble(inpuData.nextLine()));
                System.out.println("ingrese la resolucion");
                tv.setResolution(Double.parseDouble(inpuData.nextLine()));
            } else if (opction == 5) {
                for (int i = 0; i < monitores.size(); i++) {
                    System.out.println("nombre de monitores " + monitores.get(i).getName());

                }
            } else if (opction == 6) {
                for (int i = 0; i < cpus.size(); i++) {
                    System.out.println("nombre de cpu " + cpus.get(i).toString());
                }

            } else if (opction == 7) {
                for (TV T : tvs) {
                    System.out.println("nombre del tv " + T.getName());
                }

            } else if (opction == 8) {
                System.out.println("ingrese la referencia que desea buscar");
                String referencesearch = inpuData.nextLine();
                boolean flag = false;
                for (Monitor moni : monitores) {
                    if (moni.getReferencia().equals(referencesearch)) {
                        System.out.println("el nombre del es " + moni.getName());
                        flag = true;

                        break;
                    }
                }
                if (flag == false) {
                    System.out.println("registro no existe");
                }

            } else {
                break;
            }

         /*   System.out.println("Digite s para ingresar mas datos");
            respuesta = inpuData.nextLine();*/
        }

//        System.out.println(" Ingrese 1=monitor,2=cpu,3=tv para mostrar ");
////        String mostrar = inpuData.nextLine();
//        int mostrar =Integer.parseInt(inpuData.nextLine());

       /* if (mostrar==1){
            for (int i=0;i<monitores.size();i++){
                System.out.println("nombre de monitores "+monitores.get(i).getName());

            }

        }
        else if (mostrar==2){
            for (int i=0;i<cpus.size();i++){
                System.out.println("nombre de cpu "+cpus.get(i).toString());
            }
        }
        else {
            for (TV T:tvs){
                System.out.println("nombre del tv "+T.getName());
            }
        }*/


    }
}

