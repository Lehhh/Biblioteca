package model.bean;

import java.util.List;


public class Livros{

public int id_l;
private String titulo;
private String autor;
private String genero;
private String disp;
private boolean emprestado;

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }



    public int getId_l() {
        return id_l;
    }

    public void setId_l(int id_l) {
        this.id_l = id_l;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

   

public void Emprestar(){
     if(this.emprestado){
        System.out.println("Não é possível pegar o livro pois ele já está emprestado");        
    }
    else{
        System.out.println("Pode retirar o livro");
        this.emprestado=true;
        
}
}

  
    
    }


          
        
    





