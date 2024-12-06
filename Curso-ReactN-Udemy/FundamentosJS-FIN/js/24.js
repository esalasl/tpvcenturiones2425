// Eventos del DOM - Clicks

const heading = document.querySelector('.heading')
heading.addEventListener('click', () =>  {
    heading.textContent = 'Nuevo Heading al dar click'
})



const enlaces = document.querySelectorAll('.navegacion a')
enlaces.forEach( enlace => {
    enlace.addEventListener('click', () => {
        console.log('Diste click en un enlace')
    })
})
