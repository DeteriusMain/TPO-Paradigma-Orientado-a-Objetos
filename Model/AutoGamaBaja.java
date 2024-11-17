public class AutoGamaBaja extends Auto {

    public AutoGamaBaja(int kilometraje, String marca, int modelo, int precioLista) {
        super(kilometraje, marca, modelo, precioLista);
    }


    public void intentarComprar(Cliente cliente) {
        double precioFinal = this.getPrecioLista() * 1.05;
        // Si el cliente tiene tarjeta y su presupuesto cubre el precio final
        if (cliente.isTarjeta() && cliente.getPresupuesto() >= precioFinal) {
            System.out.println("El cliente puede comprar el auto de gama baja usando tarjeta. Precio final: " + precioFinal);
            this.setEstadoDeCompra(EstadosDelAuto.VENDIDO); // Cambia el estado a vendido
        }
        // Si el cliente no tiene tarjeta pero tiene el presupuesto suficiente para pagar en efectivo
        else if (!cliente.isTarjeta() && cliente.getPresupuesto() >= this.getPrecioLista()) {
            System.out.println("El cliente puede comprar el auto de gama baja en efectivo. Precio: " + this.getPrecioLista());
            this.setEstadoDeCompra(EstadosDelAuto.VENDIDO); // Cambia el estado a vendido
        }

        else {
            System.out.println("El cliente no tiene suficiente presupuesto para este auto de gama baja.");
        }
    }


    public boolean es0KM() {
        // Determina si el auto es 0 KM
        return this.getKilometraje() < 100;
    }
}
