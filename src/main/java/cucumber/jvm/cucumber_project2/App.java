package cucumber.jvm.cucumber_project2;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @Dado("^me encuentro en la página de agregar contenido$")
    public void me_encuentro_en_la_página_de_agregar_contenido1() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Estoy en la página de agregar contenido");
        
    }
    
    @Dado("^que estoy autenticado como Autor$")
    public void que_estoy_autenticado_como_Autor() {
    	System.out.println("Estoy autenticado como autor");
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
    
    @Dado("^me encuentro en la página  de agregar contenido$")
    public void me_encuentro_en_la_página_de_agregar_contenido() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Me encuentro en la página de agregar contenido");
    }
    
    @Cuando("^ingrese el título del mensaje$")
    public void ingrese_el_título_del_mensaje()  {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Ingreso el título del mensaje");
    }

    @Cuando("^ingrese el contenido$")
    public void ingrese_el_contenido(){
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Ingreso contenidos");
    }

    @Cuando("^seleccione Publicar$")
    public void seleccione_Publicar()  {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Seleccione publicar");
    }
    @Entonces("^debe mostrarse \"([^\"]*)\"$")
    public void debe_mostrarse(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("debe mostrarse: Ya he publicadoooo");
    }
   
}
