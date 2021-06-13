public class Caracol{
    int filas;
    int columnas;
    int fila = 0;
    int columna = 0;
    int arreglo[][];
    int extremoup = 0;
    int extremoleft = -1;
    int dato = 1;
    public int[][] Recorridocaracol(int filas, int columnas){
       int arreglo [][] = new int [filas][columnas];
       int limite = (filas * columnas) + 1;
       int aux1 = filas;
       int aux2 = columnas;
      
       int dato = 1;
       for(; dato < limite; ){
            
            for(;columna < aux2 && dato < limite; ){
              arreglo[fila][columna] = dato;
              dato ++;
              columna ++;
             }
             columna = columna - 1;
             fila = fila + 1;
            for( ;fila < aux1 && dato < limite;){
               arreglo[fila][columna] = dato;
               dato ++;
               fila ++;
            }
            fila = fila - 1;
            columna = columna - 1;
            for(;columna > extremoleft && dato < limite;){
               arreglo[fila][columna] = dato;
               dato ++;
               columna = columna - 1;
            }
            extremoleft ++;
            columna ++;
            fila = fila -1;
            for(;fila > extremoup && dato < limite;){
               arreglo[fila][columna] = dato;
               dato ++;
               fila = fila - 1;
            }
            extremoup ++;
            fila ++;
            columna ++;
            aux1 = aux1 - 1;
            aux2 = aux2 - 1;
            
        }
        
       return arreglo ;
    }
    
    public void imprimir(int matriz[][]){
    for(int i = 0;i < matriz.length; i ++){
        
       for(int j = 0;j < matriz[0].length; j++){
        System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    }
    
    public int [][]diagonal(int filas, int columnas){
    int arreglo [][] = new int [filas][columnas];
    int aux = 1;
    int j = 0;
    int k = 0;
    int m = 0;
    int aux2 = columnas;
    for(int i = 0;i < filas;){
         if(aux2 == (columnas / 2) + 1){
         arreglo[i][j] = 1;
         i++;
         k= (columnas / 2);
         m = k;
           for(;i < filas;){
        j = m -1;
        arreglo[i][j] = 1;
        j = k +1;
        arreglo[i][j] = 1;
        m = k - 1;
        k++;
        i ++;
        }
         }else{
          for(;aux2 != (columnas / 2) + 1;){
        arreglo[i][j] = 1;
        j = aux2 - 1;
        arreglo[i][j] = 1;
        aux2 = aux2 - 1;
        k++;
        j = k;
        i++;
        }
       
        }
    
    }
    return arreglo;
}
}
