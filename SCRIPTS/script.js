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