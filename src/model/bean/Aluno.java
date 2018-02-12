package model.bean;


public class Aluno extends Pessoa{
    
    
    
            //esta com livro?\/
    private int id_a;
    private  int estLivro;
    //nome do livro que ele pegou
    private String titulo;
    private String ra;
    private String serie;
    private String turma;
    private String dataE;
    private String dataR;
    private String pendente;
    private int id_l;

    public String getTituloo() {
        return titulo;
    }

    public void setTituloo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_l() {
        return id_l;
    }

    public void setId_l(int id_l) {
        this.id_l = id_l;
    }
    
    
    
    public String getPendente() {
        return pendente;
    }

    public void setPendente(String pendente) {
        this.pendente = pendente;
    }
    
    public String getDataE() {
        return dataE;
    }

    public void setDataE(String dataeE) {
        this.dataE = dataeE;
    }

    public String getDataR() {
        return dataR;
    }

    public void setDataR(String dataR) {
        this.dataR = dataR;
    }

    
    
    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    


    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

 
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getEstLivro() {
        return estLivro;
    }

    public void setEstLivro(int estLivro) {
        this.estLivro = estLivro;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   

}
