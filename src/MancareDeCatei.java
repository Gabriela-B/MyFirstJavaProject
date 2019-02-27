public class MancareDeCatei {

    private String talie;
    private int varsta;
    private float greutate;
    private String nivelDeEnergie;
    private String stareFizica;

    MancareDeCatei(String talie, int varsta, float greutate, String nivelDeEnergie, String stareFizica){
        System.out.println("Initializat");
        this.talie=talie;
        this.varsta=varsta;
        this.greutate=greutate;
        this.nivelDeEnergie=nivelDeEnergie;
        this.stareFizica=stareFizica;
    }

    public void setTalie(String talie){
        this.talie=talie;
    }
    public String getTalie(String talie){
        return this.talie;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public int getVarsta(int varsta){
        return this.varsta;
    }
    public void setGreutate(float greutate){
        this.greutate=greutate;
    }
    public float getGreutate(float greutate){
        return this.greutate;
    }
    public void setNivelDeEnergie(String nivelDeEnergie){
        this.nivelDeEnergie=nivelDeEnergie;
    }
    public String getNivelDeEnergie(String nivelDeEnergie){
        return this.nivelDeEnergie;
    }
    public void setStareFizica(String stareFizica){
        this.stareFizica = stareFizica;
    }
    public String getStareFizica(String stareFizica){
        return this.stareFizica;
    }

}
