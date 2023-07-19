let input = require('fs').readFileSync('stdin', 'utf8');
let valoresStdin = input.split('\n');

let a = parseInt(valoresStdin.shift());
let b = parseInt(valoresStdin.shift());

function soma(){
    return a + b;
}

console.log('SOMA = ' + soma());