var input = require('fs').readFileSync('stdin', 'utf8');
var valoresStdin = input.split('\n');

let nome = valoresStdin.shift();
let salarioFixo = parseFloat(valoresStdin.shift());
let vendasNoMes = parseFloat(valoresStdin.shift());

function salarioFinal(){
    return salarioFixo + ( vendasNoMes * 0.15);
}

console.log('TOTAL = R$ ' + salarioFinal().toFixed(2));