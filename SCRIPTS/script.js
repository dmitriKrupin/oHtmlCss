//Скрипт для кнопок калькулятора
function outputUpdate(vol, name) {
    let output;
    if (name === 'number-of-cameras') {
        output = document.querySelector('#camerasId');
    } else if (name === 'number-of-cables') {
        output = document.querySelector('#cablesId');
    }
    output.value = vol;
    output.style.left = vol + 'px';
    if(output.value > 0) {
        output.style.left = vol - 10 + 'px';
    }
    if(output.value > 99) {
        output.style.left = vol - 40 + 'px';
    }
    if(output.value > 240) {
        output.style.left = vol - 45 + 'px';
    }
    if(output.value > 430) {
        output.style.left = vol - 50 + 'px';
    }
    if(output.value > 470) {
        output.style.left = vol - 55 + 'px';
    }
}

//Скрипт для меню личного кабинета
const wrapperLogin = document.querySelector('.wrapper-login');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register-link');
const btnPopup = document.querySelector('.header-content__log-in');
const iconClose = document.querySelector('.icon-close');

registerLink.addEventListener('click', () => {
    wrapperLogin.classList.add('active'); //добавляем active к тэгу wrapper-login
});

loginLink.addEventListener('click', () => {
    wrapperLogin.classList.remove('active'); //удаляем active к тэгу wrapper-login
}); 

btnPopup.addEventListener('click', () => {
    wrapperLogin.classList.add('active-popup'); //добавляем active-popup к тэгу wrapper-login 
});

iconClose.addEventListener('click', () => {
    wrapperLogin.classList.remove('active-popup'); //удаляем active-popup к тэгу wrapper-login 
});

//Скрипт для "гамбургера"
const btnShortMenu = document.querySelector('.header-content__short-menu');
const shortLinks = document.querySelector('.header-content__short-links');
const menuProjects = document.querySelector('.header-content__projects');
const menuNews = document.querySelector('.header-content__news');
const menuContacts = document.querySelector('.header-content__contacts');
const menuIconClose = document.querySelector('.header-content__icon-close');
const logIn = document.querySelector('.header-content__log-in');
const search = document.querySelector('.header-content__search');

btnShortMenu.addEventListener('click', () => {
    btnShortMenu.classList.add('chenge-on-exit');
    shortLinks.classList.add('active-short-menu');
    menuIconClose.classList.add('active-short-menu');
    menuProjects.classList.add('active-short-menu');
    menuNews.classList.add('active-short-menu');
    menuContacts.classList.add('active-short-menu');
    logIn.classList.add('active-short-menu');
    search.classList.add('active-short-menu');
})

menuIconClose.addEventListener('click', () => {
    btnShortMenu.classList.remove('chenge-on-exit');
    shortLinks.classList.remove('active-short-menu');
    menuIconClose.classList.remove('active-short-menu');
    menuProjects.classList.remove('active-short-menu');
    menuNews.classList.remove('active-short-menu');
    menuContacts.classList.remove('active-short-menu');
    logIn.classList.remove('active-short-menu');
    search.classList.remove('active-short-menu');
})