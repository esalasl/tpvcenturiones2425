
const saldo = 600
const pagar = 500
const tarjeta = true
/*
    || - Al menos una debe cumplirse
    && - Todas deben cumplirse
*/
if(saldo > pagar && tarjeta ) {
    console.log('puedes pagar')
}  else {
    console.log('No, no puedes pagar')
}