
// Dado el siguiente arreglo:
// let numeros = [1, 6, 8, 4, 2, 7, 10, 3, 5 ];
// Utilizando un ciclo FOR, barra todo el arreglo y determine ¿Cuál es el número mayor?

let numeros = [1, 6, 8, 4, 2, 7, 10, 3, 5, 40 ]
let num = -99999

for (let i=0; i<=numeros.length; i++){
    if(numeros [i] >= num){
        num = numeros [i]
    }
} console.log(num)

/*

R//
El numero mayor que imprimiria este arreglo es 40 

*/