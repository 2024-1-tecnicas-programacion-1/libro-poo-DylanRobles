package com.mycompany.libropoo;

public class Libro {
    private String autor;
    private String titulo;
    private int anoPublicacion;
    private String genero;
    private boolean leido;
    

    Libro(String autor, String titulo, int anoPublicacion, String genero){
    this.autor = autor;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion;
    this.genero = genero;
    }

    public String mostrarInformacion(){
    String info = "Titulo:["+titulo+"], Autor:["+autor+"], Año de publicaciòn:["+anoPublicacion+"], Genero:["+genero+"]";


     return info;
    }
    public void marcarLeido(){
    leido = true;


    }

    
    public boolean esAntiguo(){
     return(2024 - anoPublicacion>=50);
        }
   

      }     

       
    


