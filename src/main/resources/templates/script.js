function addRow() {

    let table =
        document.getElementById("itemTable")
                .getElementsByTagName('tbody')[0];

    let row = table.insertRow();

    row.innerHTML = `

        <td>
            <input type="text">
        </td>

        <td>
            <input type="text">
        </td>

        <td>
            <input type="number" class="qty">
        </td>

        <td>
            <input type="number" class="rate">
        </td>

        <td>
            <input type="number" class="gst">
        </td>

        <td>
            <input type="number"
                   class="total"
                   readonly>
        </td>

        <td>
            <button type="button"
                    onclick="removeRow(this)">
                Remove
            </button>
        </td>
    `;

    bindEvents();
}

function removeRow(button) {

    button.parentElement.parentElement.remove();

    calculateGrandTotal();
}

function bindEvents() {

    let qtys =
        document.querySelectorAll(".qty");

    let rates =
        document.querySelectorAll(".rate");

    let gsts =
        document.querySelectorAll(".gst");

    qtys.forEach((qty, index) => {

        qty.oninput =
            () => calculateRow(index);
    });

    rates.forEach((rate, index) => {

        rate.oninput =
            () => calculateRow(index);
    });

    gsts.forEach((gst, index) => {

        gst.oninput =
            () => calculateRow(index);
    });
}

function calculateRow(index) {

    let qty =
        document.querySelectorAll(".qty")[index]
                .value || 0;

    let rate =
        document.querySelectorAll(".rate")[index]
                .value || 0;

    let gst =
        document.querySelectorAll(".gst")[index]
                .value || 0;

    let total = qty * rate;

    let gstAmount =
        total * gst / 100;

    total = total + gstAmount;

    document.querySelectorAll(".total")[index]
            .value = total.toFixed(2);

    calculateGrandTotal();
}

function calculateGrandTotal() {

    let totals =
        document.querySelectorAll(".total");

    let grandTotal = 0;

    totals.forEach(total => {

        grandTotal +=
            Number(total.value || 0);
    });

    document.getElementById("grandTotal")
            .innerText =
            grandTotal.toFixed(2);
}

bindEvents();