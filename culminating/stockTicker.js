

//define the major points of contact in the DOM
const displayResultArea = document.querySelector(".secTwo")
const calculateBtn      = document.querySelector("#stockTickerSearch");

//code to activate the button when clicked
calculateBtn.addEventListener("click", calculating);



//create the elements in which the answer will be stored
const calculateAnswerArea = document.createElement("div");
const calculatedAnswer    = document.createElement("h3");
calculateAnswerArea.setAttribute("id", "calculateAnswerArea");

//function that manipulates the DOM and adds the answer to the file.
function calculating(){

    let ticker               = document.getElementById("tickerSmbl").value;
    calculatedAnswer.textContent = ticker + ": this feature has not yet been implemented "

    calculateAnswerArea.appendChild(calculatedAnswer);
    displayResultArea.appendChild(calculateAnswerArea);
}
