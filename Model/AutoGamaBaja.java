package Model;

public class AutoGamaBaja extends Auto {

    public AutoGamaBaja(int kilometraje, String marca, int modelo, int precioLista, Agencia agencia) {
        super(kilometraje, marca, modelo, precioLista, agencia);
    }

    public void intentarComprar(Cliente cliente) {
        double precioFinal = calcularPrecio();

        // Si el cliente tiene tarjeta y su presupuesto cubre el precio final
        if (cliente.isTarjeta() && cliente.getPresupuesto() >= precioFinal) {
            System.out.println("El cliente puede comprar el auto de gama baja usando tarjeta. Precio final: " + precioFinal);
            decidirComprar();
        }
        // Si el cliente no tiene tarjeta pero tiene el presupuesto suficiente para pagar en efectivo
        else if (cliente.getPresupuesto() >= this.getPrecioLista()) {
            System.out.println("El cliente puede comprar el auto de gama baja en efectivo. Precio: " + this.getPrecioLista());
            decidirComprar();
        }
        // Si el cliente no tiene suficiente presupuesto para comprar el auto
        else {
            System.out.println("El cliente no tiene suficiente presupuesto para este auto de gama baja.");
        }
    }

    @Override
    public double calcularPrecio() {
        double precioVerdadero = getPrecioLista();
        precioVerdadero *= 1.05;
        return precioVerdadero;
        // Se aplica un 5% extra al precio de lista
    }


}
