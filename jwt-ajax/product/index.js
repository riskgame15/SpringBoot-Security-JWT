function showAllProduct() {
    let token = getToken();
    if (token==null) {
        window.location.href = "../login/login.html"
    }
    else {
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                "Authorization": "Bearer " + getToken(),
            },
            type: "GET",
            url: "http://localhost:8080/product",
            success: function (result) {
                let content = "";
                for (let i = 0; i < result.length; i++) {
                    content+=` <tr>
            <td>${result[i].id}</td>
            <td>${result[i].name}</td>
            <td>${result[i].description}</td>
            <td>${result[i].price}</td>
        </tr>`
                }
                document.getElementById("products").innerHTML = content;
                console.log(result);
            }
        })

    }

}

showAllProduct();

// viet lay du lieu tu ls
function getToken(){
    let token = localStorage.getItem('token');
    return token;
}
// localStorage.setItem("demo", token)
// function getName() {
//     let name = localStorage.getItem('name');
//     document.getElementById("name").innerText = name;
// }
//
// getName()
localStorage.setItem("test", value)
