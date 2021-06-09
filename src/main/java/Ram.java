public class Ram {
    String marca;
    int capacidad;
    int frecuencia;

    public Ram(String marca, int capacidad, int frecuencia) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }



    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return  "Marca: "+marca+" / Capacidad(GB): "+capacidad+" / Frecuencia(MHZ): "+frecuencia;
    }
}
