package serie.a;

public class Squadra {

    int posizione;
    String nome;
    int punti;
    int partite, vinte, perse, pareggiate;
    int fatti, subiti,differenza;
//

    public Squadra(int posizione, String nome, int punti, int partite, int vinte, int perse, int pareggiate, int fatti, int subiti, int differenza) {
        this.posizione = posizione;
        this.nome = nome;
        this.punti = punti;
        this.partite = partite;
        this.vinte = vinte;
        this.perse = perse;
        this.pareggiate = pareggiate;
        this.fatti = fatti;
        this.subiti = subiti;
        this.differenza = differenza;
    }

    

    @Override
    public String toString() {
        return posizione+"° \t"+ nome + " \t"+ punti +"pt \t"+ partite+ " \t"+ vinte+ " \t"+ pareggiate+ " \t"+ perse+ " \t"+ fatti+ " \t"+ subiti+ " \t"+ differenza;
    }

     public int getPosizione() { return posizione; }
    public void setPosizione(int posizione) { this.posizione = posizione; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getPunti() { return punti; }
    public void setPunti(int punti) { this.punti = punti; }

    public int getPartite() { return partite; }
    public void setPartite(int partite) { this.partite = partite; }

    public int getVinte() { return vinte; }
    public void setVinte(int vinte) { this.vinte = vinte; }

    public int getPerse() { return perse; }
    public void setPerse(int perse) { this.perse = perse; }

    public int getPareggiate() { return pareggiate; }
    public void setPareggiate(int pareggiate) { this.pareggiate = pareggiate; }

    public int getFatti() { return fatti; }
    public void setFatti(int fatti) { this.fatti = fatti; }

    public int getSubiti() { return subiti; }
    public void setSubiti(int subiti) { this.subiti = subiti; }

    public int getDifferenza() { return differenza; }
    public void setDifferenza(int differenza) { this.differenza = differenza; }


}
