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