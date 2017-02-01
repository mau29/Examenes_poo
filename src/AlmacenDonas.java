/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class AlmacenDonas 
{
    FabricaDonas f;
    private String arregloDonas()
    {
        return null;
    }

    public FabricaDonas getF() {
        return f;
    }

    public void setF(FabricaDonas f) {
        this.f = f;
    }
    
    public FabricaDonas agregar()
    {
        f = new FabricaDonas();
        f.empaquetar();
        
        return f;
    }
    
    public static void main(String[] args) 
    {
        AlmacenDonas a = new AlmacenDonas();
        
        a.agregar();
    }
}
