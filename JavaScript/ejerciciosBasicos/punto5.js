
/*  Dado el siguiente arreglo:
    let numeros = [15, 9, 6, 8, 4, 2, 7, 10, 30, 5 ];
    Haga una impresión en consola así:
    1 es un número impar
    6 es un número par	 
*/

let numeros = [15, 9, 6, 8, 4, 2, 7, 10, 30, 5 ];
for (let i=0; i<=numeros.length; i++){
    let numero = numeros[i]
    if((numero % 2) == 0){
        console.log(numero + ' es par');
    }else{
        console.log(numero + ' es impar');
    }
}

/*
R//

Lo que imprimiria este arreglo seria:

15 es impar" - 9 es impar" - 6 es par" - 8 es par" - 4 es par"
2 es par" - 7 es impar" - 10 es par" - 30 es par" - 5 es impar" 

*/