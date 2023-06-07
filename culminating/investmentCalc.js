//define the major points of contact in the DOM
const displayResultArea = document.querySelector(".secTwo")
const calculateBtn      = document.querySelector("#investmentCalcBtn");

//code to activate the button when clicked
calculateBtn.addEventListener("click", calculating);



//create the elements in which the answer will be stored
const calculateAnswerArea = document.createElement("div");
const calculatedAnswer    = document.createElement("h3");
calculateAnswerArea.setAttribute("id", "calculateAnswerArea");

//function that manipulates the DOM and adds the answer to the file.
function calculating(){
    
    let principal               = document.getElementById("usersPrincipalInvestment").value;
    let holdDuration            = document.getElementById("userHoldDuration").value;
    let rateOfReturn            = document.getElementById("userAvgRateOfReturn").value;
    
    let currentSum    = moneyMade(principal, rateOfReturn, holdDuration);
    let totalInvested = parseInt(principal);
    calculatedAnswer.textContent = `Your current balance is: ${currentSum} out of this compound interest made you
     ${Math.round((currentSum - totalInvested) * 100)/100}`;

    calculateAnswerArea.appendChild(calculatedAnswer);
    displayResultArea.appendChild(calculateAnswerArea);
    
}

//function that runs the compound interest calculation 
function moneyMade(principal, rateOfReturn, holdDuration){
    let P = principal;
    let R = rateOfReturn/100;
    let N = 1;
    let T = holdDuration;
    let p1 = 1 + (R/N);
    let p2 = Math.pow(p1, (N*T));
    let p3 = Math.round(P * p2 * 100);
    return p3/100;
}
