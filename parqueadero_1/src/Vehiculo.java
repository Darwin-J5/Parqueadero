public abstract class Vehiculo {
    private String modelo;
    private String matricula;
    private String color;
    private boolean encendido;
    private boolean estadoLuces;

    public void avanzar() {
        System.out.println("El vehículo avanza...");
    }

    public void frenar() {
        System.out.println("El vehículo frena...");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEstadoLuces() {
        return estadoLuces;
    }

    public void setEstadoLuces(boolean estadoLuces) {
        this.estadoLuces = estadoLuces;
    }
}
