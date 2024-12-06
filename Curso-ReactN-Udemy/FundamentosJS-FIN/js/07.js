// Unir 2 objetos
const producto = {
    nombre: "Tablet",
    precio: 300,
    disponible: true
}
const cliente = {
    nombre: 'Juan',
    premium : true
}

// const nuevoObjeto = Object.assign(producto, cliente) // No
const nuevoObjeto2 = { 
    producto: {...producto},
    cliente: {...cliente}
}

console.log(nuevoObjeto2)
console.log(cliente)
console.log(producto)