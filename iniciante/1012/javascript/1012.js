var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

const PI = 3.14159;

let a = parseFloat(lines.shift());
let b = parseFloat(lines.shift());
let c = parseFloat(lines.shift());

function areaTrianguloRetangulo(){
    return (a * c) / 2;
}

function areaCirculo(){
    return PI * Math.pow(c, 2);
}

function areaTrapezio(){
    return ((a + b) * c) / 2;
}

function areaQuadrado(){
    return Math.pow(b,2);
}

function areaRetangulo(){
    return a * b;
}

console.log(
    'TRIANGULO: ' + areaTrianguloRetangulo().toFixed(3) + 
    '\nCIRCULO: ' + areaCirculo().toFixed(3) +
    '\nTRAPEZIO: ' + areaTrapezio().toFixed(3) +
    '\nQUADRADO: ' + areaQuadrado().toFixed(3) +
    '\nRETANGULO: ' + areaRetangulo().toFixed(3)
    );