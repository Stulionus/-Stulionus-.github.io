document.querySelectorAll(".carousel").forEach(carousel => {
    const items = carousel.querySelectorAll(".item");
    const buttonsHTML = Array.from(items, () => {
        return `<span class="car_button"></span>`;
    });

    carousel.insertAdjacentHTML("beforeend",`
        <div class="carousel_nav">
        ${buttonsHTML.join("")}
        </div>
    `)

    const buttons = carousel.querySelectorAll(".car_button");

    buttons.forEach((button, i) =>{

        button.addEventListener("click", () =>{
            items.forEach(item => item.classList.remove("item_selected"));
            buttons.forEach(button => button.classList.remove("car_button_active"));

            items[i].classList.add("item_selected");
            button.classList.add("car_button_active");
        });
    });

    items[0].classList.add("item_selected");
    buttons[0].classList.add("car_button_active");
}); 

var counter = 1;
setInterval(function(){
    document.getElementById('radio' + counter).checked = true;
    counter++;
    if(counter > 4){
        counter = 1;
    }
}, 5000);