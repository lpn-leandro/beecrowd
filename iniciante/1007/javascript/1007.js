var input = require('fs').readFileSync('stdin', 'utf8');
var valoresStdin = input.split('\n');

let a = parseInt(valoresStdin.shift());
let b = parseInt(valoresStdin.shift());
let c = parseInt(valoresStdin.shift());
let d = parseInt(valoresStdin.shift());

function diferenca(){
    return a * b - c * d;
}

console.log('DIFERENCA = ' + diferenca());