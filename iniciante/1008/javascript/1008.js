var input = require('fs').readFileSync('stdin', 'utf8');
var valoresStdin = input.split('\n');

let id = parseInt(valoresStdin.shift());
let horasTrabalhadas= parseInt(valoresStdin.shift());
let valorHora = parseFloat(valoresStdin.shift());

function salario(){
    return horasTrabalhadas * valorHora;   
}

console.log('NUMBER = ' + id + '\n'
 + 'SALARY = U$ ' + salario().toFixed(2));