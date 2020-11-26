
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPag;
        numeroReferencia = "";
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String nuevaReferencia){
        
        if (nuevaReferencia.length() > 3){
            numeroReferencia = nuevaReferencia;
        }
        else{
            System.out.println("Introduzca una referencia con mas de 3 caracteres");
        }
    }
    
    public void imprimeAutor(){
        System.out.println("el autor es " + autor);
    }
   
    public void imprimeTitulo(){
        System.out.println("el titulo es " + titulo);
    }
    
    public void imprimirDetalles(){
        if(numeroReferencia != ""){
            System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Nº referencia: " + numeroReferencia);
        }
        else{
            System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Nº referencia: ZZZ");
        }
        
    }
    
    public String getDetalles(){
        String cadenaADevolver = "";
        if(numeroReferencia != ""){
            cadenaADevolver = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Nº referencia: " + numeroReferencia;
        }  
        else{
            cadenaADevolver = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Nº referencia: ZZZ";
        }    
        return cadenaADevolver;
    }
    
}
