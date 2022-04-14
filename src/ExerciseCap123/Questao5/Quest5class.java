package ExerciseCap123.Questao5;

public class Quest5class {
    
    String nomeProd;
    Double precoProd;
    int porce;

    public Quest5class(String nomeProd, Double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }
    
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    
    public Double getPrecoProd() {
        return precoProd;
    }
    
    public void setPrecoProd(Double precoProd) {
        this.precoProd = precoProd;
    }

    public int getPorce() {
        return porce;
    }

    public void setPorce(int porce) {
        this.porce = porce;
    }

    public void adicionarProd(String novoProd){
        novoProd = nomeProd;
    }

    public void adicionarPrec(Double novoPreco){
        novoPreco = precoProd;
    }


    @Override
    public String toString() {
        return "\nNome do Produto: [" + nomeProd + "] Preço do Produto: [" + precoProd + "] ";
    }

    

}
