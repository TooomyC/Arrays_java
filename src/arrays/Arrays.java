/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Berny
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estructura de vector:
        //tipoDeVariable[] nombreDeVariable = new tipoDeVariable[dimension];
        
        /**Bucle For Each: Muestra los elementos del array, desconociendo el tamaño del mismo.
        for(tipoDeVariable nombreGenerico: nombreArray){
            sentencias;
        }
        **/
        
        /**
        LEER 5 NUMEROS, ALMACENARLOS EN UN ARRAY Y A CONTINUACION, REALIZAR LA MEDIA DE LOS
        * POSITIVOS, LA DE LOS NEGATIVOS Y CONTAR LA CANTIDAD DE CEROS.
        */
        /**
        int cantPositivos = 0, cantNegativos = 0, cantCeros = 0;
        float numeros[] = new float[5], sumaPositivos = 0, sumaNegativos = 0;
        
        for(int i = 0; i < 5; i++){
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero en la posicion "+i+" : "));
            if(numeros[i]== 0)
                cantCeros ++;
            else{
                if(numeros[i] > 0){
                    sumaPositivos += numeros[i];
                    cantPositivos ++;
                }
                else{
                    sumaNegativos += numeros[i];
                    cantNegativos ++;
                }       
            }
            System.out.println("El vector en la posicion "+i+" es: "+numeros[i]);
        }
        
        if(cantPositivos != 0){
                System.out.printf("La media de los positivos es: "+String.format("%.3f", (sumaPositivos / cantPositivos)));
            }
            
        if(cantNegativos != 0){
                System.out.printf("La media de los negativos es: "+String.format("%.3f", (sumaNegativos / cantNegativos)));
            }
        System.out.println("La cantidad de ceros es: "+cantCeros);
        **/
        
        ///MEZCLAR DOS ARRAYS. INTERCALANDO SUS ELEMENTOS EN UN TERCER ARRAY.
        /**
        Scanner entrada = new Scanner(System.in);
        /**
        int a[] = {1,3,5,7,9,11,13,15,17,19}, 
            b[] = {2,4,6,8,10,12,14,16,18,20},
            c[];
        c = new int [20];
        **/
        /**
        int a[] = new int [10];
        int[] b = new int [10];
        int[] c = new int [20];
        
        System.out.println("Ingreso del primer array.");
        for(int i = 0; i < 10; i ++){
            System.out.println("Ingrese un numero: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Ingreso del segundo array.");
        for(int i = 0; i < 10; i ++){
            System.out.println("Ingrese un numero: ");
            b[i] = entrada.nextInt();
        }
        
        //Ahora, mezclamos los dos arrays en un tercero.
        int j = 0;
        for(int i = 0; i < 10; i ++){
            c[j] = a[i]; //Se copia el primer elemento del primer array.
            j ++;
            c[j] = b[i]; //Se copia el primer elemento del segundo array.
            j ++;
        }
        
        System.out.println("El tercer array es: ");
        for(int i = 0; i < 20; i ++){
            System.out.println(c[i]+" ");
        }
        
        System.out.println("\n");
        **/
        
        //MEZCLAR DOS ARRAYS. INTERCALANDO SUS ELEMENTOS CADA 3, EN UN TERCER ARRAY.
        /**
        int a[] = {1,3,5,7,9,11,13,15,17,19}, 
            b[] = {2,4,6,8,10,12,14,16,18,20},
            c[];
        c = new int [20];
        
        int j = 0;
        for(int i = 0; i < 10; i += 3){
            c[j] = a[i];
            j ++;
            c[j] = a[i+1];
            j ++;
            c[j] = a[i+2];
            j ++;
            c[j] = b[i];
            j ++;
            c[j] = b[i+1];
            j ++;
            c[j] = b[i+2];
            j ++;
        }
        
        System.out.println("El tercer array es: ");
        for(int i = 0; i < 20; i ++){
            System.out.println(c[i]+" ");
        }
        
        System.out.println("\n");
        * **/
        
        /**LEER POR TECLADO UNA SERIE DE 10 NUMEROS ENTEROS. LA APLICACION DEBE
         * INDICARNOS SI LOS NUMEROS ESTAN ORDENADOS DE FOMRA CRECIENTE,
         * DECRECIENTE O SI ESTAN DESORDENADOS.
        **/
        
        //1ra Situacion: El array este ordenado, decreciente.
        //2da Situacion: El array este ordenado, creciente.
        //3ra Situacion: El array esta desordenado.
        //4ta Situacion: Los elementos del array son iguales.
        /**
        int arreglo[] = {10,2,9,7,3,4,1,7,8,9};
        boolean creciente = false, decreciente = false;
        
        System.out.println("Llenar el arreglo.");
        for(int i = 0; i < 10; i ++){
            System.out.println("Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 9; i ++){ //Si lo dejo en i<10, me salgo del array por el if.
            
            if(arreglo[i] < arreglo [i+1]) //Valido si es Creciente.
                creciente = true;
            
            if(arreglo[i] > arreglo[i+1]) //Valido si es Decreciente.
                decreciente = true;
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("El array esta ordenado en forma creciente.");
        }
        else
            if(creciente == false && decreciente == true){
                System.out.println("El array esta ordenado en forma decreciente.");
            }
            else
                if(creciente == true && decreciente == true){
                    System.out.println("El array está desordenado.");
                }
                else{
                    System.out.println("Los elementos del array son iguales.");
                }
            **/
        /**DISEÑAR UNA APLICACION QUE DECLARE UN ARRAY DE 10 ELEMENTOS ENTEROS.
         * LEER MEDIANTE EL TECLADO 8 NUMEROS. DESPUES SE DEBE PEDIR UN NUMERO Y
         * UNA POSICION, INSERTARLO EN LA POSICION INDICADA, DESPLAZANDO LOS QUE
         * ESTE DETRAS.
        **/
        //tipoDeVariable[] nombreDeVariable = new tipoDeVariable[dimension];
        /**
        int[] vector = new int[10];
        int pos, num;
        
        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a guardar el numero: "));
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a guardar: "));
        
        pos--; //El vector comienza en la posicion 0. Si no, me pasaria de la posicion deseada.
        
        for(int i = 7; i >= pos; i--){
            vector[i] = vector[i+1]; //Desplazo los elementos para guardar el numero deseado.
        }
        vector[pos] = num; //Guardo el numero.
        
        for(int i: vector){ //for each
            System.out.println("i"); ///REVISAR
        }
        **/
        
        /**CREAR UN PROGRAMA QUE LEA UN ARRAY DE 10 NUMEROS ENTEROS Y DESPLACE
         * LOS ELEMENTOS UNA POSICION HACIA ABAJO. TENER EN CUENTA QUE EL
         * PRIMERO PASA A SER EL ULTIMO...
        **/
        /**
        int vector[] = {1,2,3,4,5,6,7,8,9,10};
        int aux = vector[0];
        
        for(int i = 0; i <= 8; i++){
            vector[i] = vector[i+1]; //Asigno la posicion siguiente en la anterior.
        }
        vector[9] = aux; //Ubico el primer elemento en el ultimo.
        
        for(int i = 0; i < 10; i++){
            System.out.println("Posicion "+i+"\tNumero: "+vector[i]);  
        }
        **/
        /**CREAR UN PROGRAMA QUE LEA UN ARRAY DE 10 NUMEROS ENTEROS Y DESPLACE
         * LOS ELEMENTOS N POSICIONES. TENER EN CUENTA QUE EL
         * PRIMERO PASA A SER EL ULTIMO...
        **/
        /**
        int vector[] = {1,2,3,4,5,6,7,8,9,10};
        int n, aux;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de posiciones a desplazar: "));
        
        for(int i = 0; i < n; i++){ //Este For sirve para realizar la cantidad de desplazamientos que se pida.
            aux = vector [0];
            for(int j = 0; j < 9; j++){ //Este for sirve para realizar los reemplazos, uno detras de otro.
                vector[j] = vector[j+1];
            }
            vector[9] = aux;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("Posicion "+i+"\tNumero: "+vector[i]);  
        }
        **/
        
        /**SE INTRODUCIRAN 5 ELEMENTOS (ORDENADOS CRECIENTEMENTE) EN UN ARRAY DE TAMAÑO 10. 
         * AL INSERTAR UN NUEVO ELEMENTO, DEBE INSERTARLO DE FORMA TAL, QUE QUEDE ORDENADO.
        **/
        /**
        int vector[];
        int num, j = 0, pos = 0;
        boolean creciente = false;
        
        vector = new int[10];
        JOptionPane.showMessageDialog(null, "--Ingrese numeros de forma ordenada(creciente)--");
        
        do{
            //CARGA DEL VECTOR.
            for(int i = 0; i < 5; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Cargue un numero en la posicion "+i+" :"));
            }
            
            for(int i = 0; i < 4; i ++){
                if(vector[i] < vector[i+1]){
                    creciente = true; //Valido si es Creciente.
                }
                if(vector[i] > vector[i+1]){
                    creciente = false;
                    break;
                }
            }
            //VALIDO SI EL VECTOR ESTA REALMENTE ORDENADO CRECIENTEMENTE.
            if(creciente == false){
                JOptionPane.showMessageDialog(null, "El vector no esta ordenado de forma creciente. Vuelva a insertar elementos de forma ordenada.");
            }
        } while(creciente == false); //Se vuelve a repetir hasta que el vector este ordenado.
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a insertar: "));
        //VOY RECORRIENDO EL VECTOR PARA SABER DONDE VOY A INSERTAR EL NUEVO ELEMENTO.
        while((vector[j] < num) && j < 5){
            pos ++;
            j ++;
        }
        //UNA VEZ QUE SÉ DONDE INSERTAR, DESPLAZO LOS ELEMENTOS.
        for(int i = 4; i >= pos; i--){
            vector[i+1] = vector [i];
        }
        vector[pos] = num; //INSERTO EL ELEMENTO EN LA POSICION.
        
        for(int i = 0; i < 9; i++){
            System.out.println("Posicion "+i+"\tNumero: "+vector[i]);
        }
        **/
        /**PROGRAMA QUE ELIMINE EL ELEMENTO DADO UNA POSICION N, SIN DEJAR HUECOS.
         * TENER EN CUENTA UN ARRAY DE 10 ELEMENTOS.
        **/
        int []primero = new int[10], segundo= new int[10], tercero= new int[10];
		int contp=0,conti=0;
		Scanner elemento= new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("Ingrese en la posicion "+(i+1)+" el numero = ");
			primero[i]=elemento.nextInt();
			if(primero[i]%2==0){
				segundo[contp]=primero[i];
				contp++;
				}
				else{
					tercero[conti]=primero[i];
					conti++;
					}
			}
		for(int k=0;k<10;k++){
			System.out.println(" "+segundo[k]+" "+tercero[k]);
		}
        
        /**
        int vector[] = {1,2,3,4,5,6,7,8,9,10};
        int pos, i = 9, j = 0;
        
        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del elemento a eliminar: "));
        pos --;
        
        while(i > pos){
            vector[pos+j] = vector[pos+j+1];
            j++;
            i--;
        }
        for(i = 0; i < 9; i++){
            System.out.println("Posicion "+i+": "+vector[i]);    
        }
        **/
        
        /** LEER 10 ENTEROS EN UN VECTOR. GUARDAR EN OTRO VECTOR LOS ELEMENTOS PARES DEL PRIMERO, Y
         * EN OTRO, LOS ELEMENTOS IMPARES.
        **/
        /**
        int vec[] = {1,2,8,3,95,4,66,23,13,20};
        int contPar = 0, contImpar = 0;
        
        for(int i = 0; i < 10; i++){
            if(vec[i] % 2 == 0){ //Es par.
                contPar ++;
            }
            else{ //Es impar.
                contImpar ++;
            }
        }
        
        int par[] = new int[contPar];
        int impar[] = new int[contImpar];
        
        contPar = 0;
        contImpar = 0; //Los reseteo.
        
        for(int i = 0; i < 10; i++){
            if(vec[i] % 2 == 0){
                par[contPar] = vec[i];
                contPar ++;
            }
            else{
                impar[contImpar] = vec[i];
                contImpar ++;
            }
        }
        
        
        System.out.println("Los nuevos vectores quedan conformados: \n");
        System.out.println("Pares: ");
        for(int i = 0; i < contPar; i++){ //Muestro los pares.
            System.out.println(" - "+par[i]);
        }
        
        System.out.println("Impares: ");
        for(int i = 0; i < contImpar; i++){ //Muestro los impares.
            System.out.println(" - "+impar[i]);
        }
        **/
        
        /**LEER DOS VECTORES DE 10 ENTEROS, QUE ESTARÁN ORDENADOS CRECIENTEMENTE.
         * COPIAR/FUSIONAR LOS DOS VECTORES EN UN TERCERO, DE FORMA QUE SIGAN ORDENADOS.
        **/
        /**
        int vec1[] = {1,3,5,7,9};
        int vec2[] = {2,4,6,8,10};
        int vec3[] = new int[10];
        
        ///ITERADORES
        int i = 0, j = 0, k = 0;
        
        while(i < 5 && j < 5){
            if(vec1[i] < vec2[j]){
                vec3[k]  = vec1[i];
                i ++;
                k ++;
            }
            else{
                vec3[k] = vec2[j];
                j ++;
                k ++;
            }
        }
        
        System.out.println("Tercer vector");
        for(i = 0; i < 10; i++){
            System.out.println(" - "+vec3[i]);
        }
        **/
        
        //MATRICES
        /**
        int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Ó
        int matriz2[][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas: "));
    
        matriz = new int[nFilas][nColumnas];
        **/
    }
    
}
