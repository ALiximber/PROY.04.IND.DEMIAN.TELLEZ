public class clase {
    private String Nombre_A,Nombre_L,Nombre_E;
    private int Numero_P,Numero_E,Año_p;
    
    public clase(String Nombre_A,String Nombre_L,String Nombre_E, int Numero_P,int Numero_E,int Año_p){
        this.Año_p=0;
        this.Nombre_A=null;
        this.Nombre_E=null;
        this.Nombre_L=null;
        this.Numero_E=0;
        this.Numero_P=0;
    }

    public String getNombre_A() {
        return Nombre_A;
    }

    public void setNombre_A(String Nombre_A) {
        this.Nombre_A = Nombre_A;
    }

    public String getNombre_L() {
        return Nombre_L;
    }

    public void setNombre_L(String Nombre_L) {
        this.Nombre_L = Nombre_L;
    }

    public String getNombre_E() {
        return Nombre_E;
    }

    public void setNombre_E(String Nombre_E) {
        this.Nombre_E = Nombre_E;
    }

    public int getNumero_P() {
        return Numero_P;
    }

    public void setNumero_P(int Numero_P) {
        this.Numero_P = Numero_P;
    }

    public int getNumero_E() {
        return Numero_E;
    }

    public void setNumero_E(int Numero_E) {
        this.Numero_E = Numero_E;
    }

    public int getAño_p() {
        return Año_p;
    }

    public void setAño_p(int Año_p) {
        this.Año_p = Año_p;
    }

    
    
}
