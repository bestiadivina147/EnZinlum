package enzinium;

public class ExceptioIllegalToken extends IllegalArgumentException {

    private double primerNumero;
    private double segundoNumero;

    
    public ExceptioIllegalToken(String s,double primerNumero, double segundoNumero) {
        super(s);
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
        
    }
    
    public double getPrimerNumero() {
        return primerNumero;
    }
    
    public double getSegundoNumero() {
        return segundoNumero;
    }

}
