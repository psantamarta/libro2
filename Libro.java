
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
    private String datosLibro;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPag)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPag;
        datosLibro = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
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
    
    public void imprimeAutor(){
        System.out.println("el autor es " + autor);
    }
   
    public void imprimeTitulo(){
        System.out.println("el titulo es " + titulo);
    }
    
    public void imprimirDetalles(){
        System.out.println(datosLibro);
    }
    
    public String getDetalles(){
        return datosLibro;
    }
    
}
