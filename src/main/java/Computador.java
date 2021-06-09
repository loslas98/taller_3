import java.util.InputMismatchException;
import java.util.Scanner;
public class Computador {
    String marca;
    String modelo;
    Ram memoria;


    public Computador(String marca, String modelo, Ram memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        inicializar();
    }

    public Computador() {
    }

    public void menu(){
        System.out.println("Bienvenido a su computador");
        System.out.println("1. Mostrar datos");
        System.out.println("2. Editar datos");
        System.out.println("3. Salir");

    }

    public void inicializar(){
        out:
        while(true){
            menu();
            switch (elegirOpcion()){
                case 1:
                    mostrarDatos();
                    break;
                case 2:
                    editardatos();
                    break;
                case 3:
                    if(salir()){
                        break out;
                    }
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
                    break;

            }

        }
    }

    public void mostrarDatos(){
        System.out.println(toString());

    }

    public int elegirOpcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija una opcion: ");
        return teclado.nextInt();


    }

    public void editardatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre de la nueva marca: ");
        setMarca(teclado.nextLine());
        System.out.println("Escriba el nombre del nuevo modelo: ");
        setModelo(teclado.nextLine());
        System.out.println("Escriba los datos de la nueva RAM");
        System.out.println("Escriba la marca: ");
        memoria.setMarca(teclado.nextLine());
        System.out.println("Escriba la capacidad(en GB): ");
        memoria.setCapacidad(verificarNumero());
        System.out.println("Escriba la frecuencia(en MHZ): ");
        memoria.setFrecuencia(verificarNumero());
        System.out.println("Los datos se han editado exitosamente");

    }

    public boolean salir(){
        System.out.println("Esta seguro que desea salir?");
        System.out.println("1. Si, 2.No ");
        switch (elegirOpcion()){
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("Elija una opcion correcta");
                return false;
        }
    }
    public int verificarNumero(){
        int i = 0;
        while (i==0){
            try{
                int opcion = ingresarNumeros();
                return opcion;

            }catch (InputMismatchException e){
                System.out.println("Por favor ingrese un numero");


            }

        }

        return 0;
    }

    public int ingresarNumeros(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();

    }





    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Ram getMemoria() {
        return memoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoria(Ram memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "\n"+
                "DATOS DEL COMPUTADOR " +"\n"+
                "Marca: " + marca + "\n"+
                "Modelo: "+ modelo +"\n"+
                "Ram: "+ memoria+"\n"+
                "---------------------------------------------";
    }
}
