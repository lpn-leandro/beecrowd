var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

let valor;
let valores;
let codigoPeca = new Array(2);
let numeroPecas = new Array(2);
let valorPecas = new Array(2);

for(let i = 0; i < 2; i++){
    valor = lines.shift();
    valores = valor.split(' ');
    codigoPeca[i] = parseInt(valores[0]);
    numeroPecas[i] = parseInt(valores[1]);
    valorPecas[i] = parseFloat(valores[2]);    
}

function valorPagar(){
    return (valorPecas[0] * numeroPecas[0]) + (valorPecas[1] * numeroPecas[1]);
}

console.log('VALOR A PAGAR: R$ ' + valorPagar().toFixed(2));