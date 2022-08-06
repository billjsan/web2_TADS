function cadastraDonatario(){
    event.preventDefault()
    let url = 'http://localhost:8080/donatario'
    let nome = document.getElementById("nome_donatario").value
    let descricao = document.getElementById("desc_donatario").value
    let telefone = document.getElementById("tel_donatario").value
    let endereco = document.getElementById("end_donatario").value
    let horafuncionamento = document.getElementById("hor_donatario").value

    body = {
        "nome": nome,
        "descricao": descricao,
        "telefone": telefone,
        "endereco": endereco,
        "horarioFuncionamento": horafuncionamento
    }

    post(url, body)
}

function post(url, body){
    let request = new XMLHttpRequest()
    request.open("POST", url, true)
    request.setRequestHeader("Content-type", "application/json")
    request.send(JSON.stringify(body))

    request.onload = function() {
        alert(this.responseText)
        window.location.reload();
    }
}