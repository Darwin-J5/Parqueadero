public class Espacio {
    private int numeroEspacio;
    private boolean ocupado;
    private boolean espacioPreferencial;

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public void setNumeroEspacio(int numeroEspacio) {
        this.numeroEspacio = numeroEspacio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isEspacioPreferencial() {
        return espacioPreferencial;
    }

    public void setEspacioPreferencial(boolean espacioPreferencial) {
        this.espacioPreferencial = espacioPreferencial;
    }
}
