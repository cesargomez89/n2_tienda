/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id$ 
 * Universidad de los Andes (Bogotá - Colombia) 
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 * 
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_tienda
 * Autor: Diana Puentes - Jun 20, 2005
 * Autor: Jorge Villalobos - Jul 08, 2005
 * Autor: Pablo Barvo - 23/08/2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.tienda.mundo;

/**
 * Esta clase representa una tienda que maneja 4 productos
 */
public class Tienda
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Primer producto que comercializa la tienda.  Llamelo p1
     */
    //TODO
	private int p1;
	
    /**
     * Segundo producto que comercializa la tienda. Llamelo p2
     */
    //TODO
	private int p2;
    /**
     * Tercero producto que comercializa la tienda.  Llamelo p3.
     */
    //TODO
	private int p3;
    /**
     * Cuarto producto que comercializa la tienda.  Llamelo p4.
     */
    //TODO
    private int p4;
    /**
     * Caja de la tienda: almacena el dinero recibido por las ventas
     */
    private double dineroEnCaja;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Crea una tienda con 4 productos.
     * @param p1P primer producto de la tienda. p1P != null.
     * @param p2P segundo producto de la tienda.p2P != null.
     * @param p3P tercer producto de la tienda. p3P != null.
     * @param p4P cuarto producto de la tienda. p4P != null.
     */
    public Tienda( int p1P,  int p2P, int p3P, int p4P )
    {
       //TODO
    	p1= p1P;
    	p2= p2P;
    	p3= p3P;
    	p4= p4P;
    	
    	
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Vende una cantidad de un producto de la tienda, dado el nombre del producto. <br>
     * <b>post: </b>se disminuye la cantidad de unidades del producto dado y se actualiza el valor total de dinero de la caja. <br>
     * @param nombreProducto El nombre del producto a vender. nombreProducto != null.
     * @param cantidad La cantidad de unidades de producto a vender. cantidad >= 0.
     * @return retorna la cantidad que fue efectivamente vendida. cantidad vendida >= 0.
     */
    public int venderProducto( String nombreProducto, int cantidad )
    {
        //TODO	
    	if (nombreProducto != null && cantidad >= 0);
    		
    		venderProducto = c;
    		
    		
    }

    /**
     * Hace el pedido de un producto, dado su nombre. <br>
     * <b>post: </b> Se aumenta la cantidad de unidades en bodega del producto dado <br>
     * @param nombreProducto El nombre del producto a pedir. nombreProducto != null.
     * @param cantidad La cantidad de unidades de producto a pedir. cantidad >= 0.
     * @return true si se pudo efectuar el pedido, false en caso contrario.
     */
    public boolean realizarPedido( String nombreProducto, int cantidad )
    {
        //TODO
    		
    	
    }

    /**
     * Retorna los ingresos recibidos por la venta de los productos.
     * @return monto total de las ventas de la tienda.
     */
    public double darGananciasTotales( )
    {
        return dineroEnCaja;
    }

    /**
     * Retorna el producto más vendido.
     * @return producto más vendido de la tienda. producto != null.
     */
    public Producto darProductoMasVendido( )
    {
        //TODO
    }

    /**
     * Retorna el producto menos vendido.
     * @return producto menos vendido de la tienda. producto != null.
     */
    public Producto darProductoMenosVendido( )
    {
        //TODO
    }

    /**
     * Retorna el promedio de las ventas.
     * @return valor promedio de las ventas en la tienda.
     */
    public double darPromedioVentas( )
    {
        //TODO
    }

    /**
     * Retorna el producto 1.
     * @return producto 1 de la tienda.
     */
    public Producto darProducto1( )
    {
        return p1;
    }

    /**
     * Retorna el producto 2.
     * @return producto 2 de la tienda.
     */
    public Producto darProducto2( )
    {
        return p2;
    }

    /**
     * Retorna el producto 3.
     * @return producto 3 de la tienda.
     */
    public Producto darProducto3( )
    {
        return p3;
    }

    /**
     * Retorna el producto 4.
     * @return producto 4 de la tienda.
     */
    public Producto darProducto4( )
    {
        return p4;
    }

    //-----------------------------------------------------------------
    // Puntos de Extensión
    //-----------------------------------------------------------------

    /**
     * Método para la extensión 1 del ejercicio
     * @return resultado
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Método para la extensión 2 del ejercicio.
     * @return resultado.
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}