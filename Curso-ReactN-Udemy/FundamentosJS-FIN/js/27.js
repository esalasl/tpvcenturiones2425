
const formulario = document.querySelector('#formulario')
formulario.addEventListener('submit', e => {
    e.preventDefault()

    const nombre = document.querySelector('.nombre').value
    const password = document.querySelector('.password').value

    const alertaPrevia = document.querySelector('.alerta')
    if(alertaPrevia) {
        alertaPrevia.remove()
    }

    const alerta = document.createElement('DIV')
    alerta.classList.add('alerta')

    if(nombre === '' || password === '') {
        alerta.textContent = 'Todos los campos son obligatorios'
        alerta.classList.add('error')
    } else {
        alerta.textContent = 'Todo bien..'
        alerta.classList.add('exito')
    }

    formulario.appendChild(alerta)
})