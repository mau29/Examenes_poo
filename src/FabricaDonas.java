/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FabricaDonas 
{
    Dona D;
    
    private void combinarIngredientes()
    {
        System.out.println("Recibi ingredientes para: Una dona de " + D.getDonaCanela() );
        System.out.println("Recibi ingredientes para: Dos donas de " + D.getDonaChispas());
        System.out.println("Recibi ingredientes para: Tres donas de " + D.getDonaChocolate());
        System.out.println("Reicbi ingredientes para: Siete donas de " + D.getDonaGlaseada());
        System.out.println("Recibi ingredientes para: Ocho donas de " + D.getDonaVainilla());
    }
    
    private void amasar()
    {
        System.out.println("Preparando la masa");
    }
    
    private void hornear()
    {
        System.out.println("Las donas se están horneando");
        System.out.println("Las donas estan listas y calientes para empaquetar");
    }
    
    public void empaquetar()
    {
        System.out.println("Se empaquetaron:");
        System.out.println("Una docena,");
        System.out.println("Dos docenas y ");
        System.out.println("Tres docenas de donas en total");
        System.out.println("Donas listas para entregar");
    }
    
    public Dona crearDona(String canela, String chispas, String chocolate, String glaseada, String vainilla)
    {
        D = new Dona();
        D.setDonaCanela(canela);
        D.setDonaChispas(chispas);
        D.setDonaChocolate(chocolate);
        D.setDonaGlaseada(glaseada);
        D.setDonaVainilla(vainilla);
        
        combinarIngredientes();
        amasar();
        hornear();
        
        return D;
    }

    public Dona getD() {
        return D;
    }

    public void setD(Dona D) {
        this.D = D;
    }
    
    private Dona almacenarDonas ()
    {
        System.out.println("Estoy almacenando las Donas");
        return D;
    }
    
    public static void main(String[] args) 
    {
        FabricaDonas f = new FabricaDonas();
        
        f.crearDona("canela", "chispas", "chocolate", "glaseado", "vainilla");
    }
}
