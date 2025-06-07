package ec.edu.espol.Adapter

public class Gpay_acc{
  /*
    Codigo 
  */
  
}
public interface I_Cliente{
  /*
  Codigo
  */

  public void pagar(Gpay_acc acct);
  
}
public class ImplementacionPagos implements I_Cliente{
  /*
    Codigo de ImplementacionPagos
  */
  public void pagar(Gpay_acc acct){
    /*
    Codigo de pagar con Gpay_acc
    */
  }
}
public class Pagos {
    public void pagar(String Datos) {
        /*
    Codigo de pagar
    */
    }
}

public aspect Aspecto_adapter_pagos {
  /*
    Codigo del aspect
    */
}

public class Cliente{
/*
    Codigo del cliente
    */
  
}
