package org.efmb;

// Clase Direccion
class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    // Constructor
    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    // Metodo toString para representar la dirección como un String
    @Override
    public String toString() {
        return "Calle: " + calle + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Código Postal: " + codigoPostal;
    }
}


class Empresa {
    private String nombreEmpresa;
    private Direccion direccion;

    // Constructor
    public Empresa(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    // Metodo para mostrar los detalles completos de la empresa
    public void mostrarDetalles() {
        String detalles = "Nombre de la Empresa: " + nombreEmpresa + "\n" +
                "Dirección:\n" + direccion.toString();
        System.out.println(detalles);
    }

    // Metodo main para probar las clases
    public static void main(String[] args) {
        // Crear una instancia de Direccion
        Direccion direccion = new Direccion("Camino de Oriente", "Managua", "505");

        // Crear una instancia de Empresa con la dirección
        Empresa empresa = new Empresa("Compañía KAEF", direccion);

        // Mostrar los detalles de la empresa
        empresa.mostrarDetalles();
    }
}
