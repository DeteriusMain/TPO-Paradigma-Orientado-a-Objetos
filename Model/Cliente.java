package Model;

public class Cliente{

    private int presupuesto;

    private int idCliente;

    private boolean Tarjeta;

    public Cliente(int presupuesto, int idCliente, boolean Tarjeta){
        this.presupuesto = presupuesto;
        this.idCliente = idCliente;
        this.Tarjeta = Tarjeta;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        Tarjeta = tarjeta;
    }
}