import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gpaez on 15/8/2016.
 */
public class BusquedaBinariaTest {

    private final String ELEMENTO_ENCONTRADO="El elemento buscado se encuentra en la lista";
    private final String ELEMENTO_NO_ENCONTRADO="El elemento buscado no se encuentra en la lista.";
    private final String LISTA_NO_VACIA = "La lista no se encuentra vacia.";

    private List<Integer> elementos;
    private BusquedaBinaria bb;

    @BeforeMethod
    public void setup(){
        elementos  = new LinkedList();
        bb = new BusquedaBinaria();

        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);
    }

    @Test
    public void busquedaBinariaElementoEnLista(){
        Assert.assertTrue(bb.busquedaBinaria(elementos,2),ELEMENTO_NO_ENCONTRADO);
    }

    @Test
    public void busquedaBinariaNoElementoEnLista(){
        Assert.assertFalse(bb.busquedaBinaria(elementos,10),ELEMENTO_ENCONTRADO);
    }

    @Test
    public void busquedaBinariaPrimerElementoLista(){
        Assert.assertTrue(bb.busquedaBinaria(elementos,1),ELEMENTO_NO_ENCONTRADO);
    }

    @Test
    public void busquedaBinariaUltimoElementoLista(){
        Assert.assertTrue(bb.busquedaBinaria(elementos,7),ELEMENTO_NO_ENCONTRADO);
    }

    @Test
    public void busquedaBinariaListaVacia(){
        elementos = null;
        Assert.assertFalse(bb.busquedaBinaria(elementos,10),LISTA_NO_VACIA);
    }
}
