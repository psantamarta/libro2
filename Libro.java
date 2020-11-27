
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPag, boolean esDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPag;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esDeTexto;
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

    public int getVecesPrestado(){
        return vecesPrestado;
    }

    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
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
        String esDeTextoONo ="";
        if (esLibroDeTexto == true){
            esDeTextoONo ="si";
        }
        if(esLibroDeTexto == false){
            esDeTextoONo ="no";
        }
        if(numeroReferencia != ""){
            System.out.println("T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N� referencia: " + numeroReferencia + ", Veces prestado: " + vecesPrestado + ", Es libro de texto: " + esDeTextoONo);
        }
        else{
            System.out.println("T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N� referencia: ZZZ" + ", Veces prestado: " + vecesPrestado + ", Es libro de texto: " + esDeTextoONo);
        }

    }

    public String getDetalles(){
        String cadenaADevolver = "";
        String esDeTextoONo ="";
        if (esLibroDeTexto == true){
            esDeTextoONo ="si";
        }
        if (esLibroDeTexto == false){
            esDeTextoONo ="no";
        }
        if(numeroReferencia != ""){
            cadenaADevolver = "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N� referencia: " + numeroReferencia + ", Veces prestado: " + vecesPrestado + ", Es libro de texto: " + esDeTextoONo;
        }  
        else{
            cadenaADevolver = "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N� referencia: ZZZ" + ", Veces prestado: " + vecesPrestado + ", Es libro de texto: " + esDeTextoONo;
        }    
        return cadenaADevolver;
    }

    public void prestar(){
        vecesPrestado += 1;
    }
}
