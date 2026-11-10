package PACKAGE_NAME;

public abstract class EmpresaEntrega {
    protected double tarifaBase;
    protected double costoKilometro;
    protected double recorridoMaximo;

    public EmpresaEntrega(double tarifaBase, double costoKilometro, double recorridoMaximo) {
        this.tarifaBase = tarifaBase;
        this.costoKilometro = costoKilometro;
        this.recorridoMaximo = recorridoMaximo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getCostoKilometro() {
        return costoKilometro;
    }

    public void setCostoKilometro(double costoKilometro) {
        this.costoKilometro = costoKilometro;
    }

    public double getRecorridoMaximo() {
        return recorridoMaximo;
    }

    public void setRecorridoMaximo(double recorridoMaximo) {
        this.recorridoMaximo = recorridoMaximo;
    }
}
