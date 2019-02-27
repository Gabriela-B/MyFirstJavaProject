public class Fata {
    private String nume;
    private int varsta;
    private String adresa;
    private int telefon;
    private String email;

    Fata( String nume, int varsta, String adresa, int telefon, String email){
        System.out.println(" Initializat ");
        this.nume=nume;
        this.varsta=varsta;
        this.adresa=adresa;
        this.telefon=telefon;
        this.email=email;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public String getNume(String nume){
        return this.nume;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public int getVarsta(int varsta){
        return this.varsta;
    }
    public void setAdresa(String adresa){
        this.adresa=adresa;
    }
    public void setTelefon(int telefon){
        this.telefon=telefon;
    }
    public int getTelefon(int telefon){
        return this.telefon;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(String email){
        return this.email;
    }


}
