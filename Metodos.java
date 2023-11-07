
/**
 *
 * @author HPSPECTRE-ROBERTO
 */
public class Metodos {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean cotangente;
    private boolean secante;
    private boolean cosecante;
    private boolean alcuadrado;
    private boolean alapotencia;
    
    
            
   public Metodos(){
       
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       cotangente=false;
       secante=false;
       cosecante=false;
       alcuadrado=false;
       alapotencia=false;
              
               
   } 
   
   public String concatenamiento (String cadena){
       this.cadena=this.cadena+cadena;
       return this.cadena;
       
      
   }
   
   public void suma (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       suma=true;
       this.cadena="";
       
       
   }
   
   
   public void resta (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       resta=true;
       this.cadena="";
       
       
   }
   public void multiplicacion (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       multiplicacion=true;
       this.cadena="";
       
       
   }
   public void division (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       division=true;
       this.cadena="";
       
       
   }
   public void raiz (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       raiz=true;
       this.cadena="";
       
       
   }
   public void seno(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       seno=true;
       this.cadena="";
       
       
   }
   public void coseno (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       coseno=true;
       this.cadena="";
       
       
   }
   public void tangente(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       tangente=true;
       this.cadena="";
       
       
   }
   public void cotangente(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       cotangente=true;
       this.cadena="";
       
       
   }

   public void secante (String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       secante=true;
       this.cadena="";
       
       
   }
   public void cosecante(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       cosecante=true;
       this.cadena="";
       
       
   }
   public void alcuadrado(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       alcuadrado=true;
       this.cadena="";
       
       
   }
   public void alapotencia(String cadena){
       
       this.resultado=Double.parseDouble(cadena);
       alapotencia=true;
       this.cadena="";
       
       
   }
///////////////////////////////////////////////////////////////////7
   
   public double  resultado(String numero){
       
       if(suma==true){
           resultado=resultado+Double.parseDouble(numero);
           
       }
       else if(resta==true){
           resultado=resultado-Double.parseDouble(numero);
           
       }
        else if(multiplicacion==true){
           resultado=resultado*Double.parseDouble(numero);
           
       }
        else if(division==true){
           resultado=resultado/Double.parseDouble(numero);
           
       }
        else if(raiz==true){
           resultado=Math.sqrt(Double.parseDouble(numero));
           
       }
        else if(seno==true){
            double seno=Math.toRadians(resultado);
            resultado=Math.sin(seno);
                 
        }
       else if(coseno==true){
            double coseno=Math.toRadians(resultado);
            resultado=Math.cos(coseno);
    }
       else if(tangente==true){
            double tangente=Math.toRadians(resultado);
            resultado=Math.tan(tangente);
    }
       else if(cotangente==true){
            double cotangente=Math.toRadians(resultado);
            resultado=1/Math.tan(cotangente);
    }
       else if(secante==true){
            double secante=Math.toRadians(resultado);
            resultado=1/Math.cos(secante);
            
    }
       else if(cosecante==true){
            double cosecante=Math.toRadians(resultado);
            resultado=1/Math.sin(cosecante);
    }
       else if(alcuadrado==true){
           resultado=Math.pow(resultado,2);
       }
       else if(alapotencia==true){
           resultado=Math.pow(resultado,Double.parseDouble(numero));
       }
       
    
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       seno=false;
       coseno=false;
       tangente=false;
       cotangente=false;
       secante=false;
       cosecante=false;
       alcuadrado=false;
       alapotencia=false;
       
       return resultado;
   }  
}