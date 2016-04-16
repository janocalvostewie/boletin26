package boletin26;

/**
 *
 * @author jano
 */
public class Bonoloto {
    
     public static int num1;
     public static int num2;
     public static int num3;
     public static int num4;
     public static int num5;
     public static int num6;
    
    public  void generarNumeros(){
    num1 = (int) (Math.random() * 49 + 1);
    num2 = (int) (Math.random() * 49 + 1);
    num3 = (int) (Math.random() * 49 + 1);
    num4 = (int) (Math.random() * 49 + 1);
    num5 = (int) (Math.random() * 49 + 1);
    num6 = (int) (Math.random() * 49 + 1);
    }
    
    public void limpiarNumeros(){
    num1=0;
    num2=0;
    num3=0;
    num4=0;
    num5=0;
    num6=0;
    
    }
    
    public  int[] jugar( int[] numeros){
    int[] numAcertados = new int[6];
    
    for(int i=0;i<numAcertados.length;i++){
    if(num1==numeros[i]){numAcertados[i]=num1;}
    else if(num2==numeros[i]){numAcertados[i]=num2;}
    else if(num3==numeros[i]){numAcertados[i]=num3;}
    else if(num4==numeros[i]){numAcertados[i]=num4;}
    else if(num5==numeros[i]){numAcertados[i]=num5;}
    else if(num6==numeros[i]){numAcertados[i]=num6;}
    else{numAcertados[i]=00;}
    
    
    }
    return numAcertados;
    }
    
}
