function ocultarErro() {
  document.getElementsByTagName("h1")[0].style.display = "none";
}

function atualizarPreview() {
  const nome = document.getElementById("nome").value;
  const email = document.getElementById("email").value;
  const cargo = document.getElementById("cargo").value;
  const mensagem = document.getElementById("mensagem").value;

  document.getElementById("prev-nome").textContent = nome || "—";
  document.getElementById("prev-email").textContent = email || "—";
  document.getElementById("prev-cargo").textContent =
    cargo && cargo !== "Cargo" ? cargo : "—";
  document.getElementById("prev-mensagem").textContent =
    mensagem || "—";
}

function validarFormulario(event) {
  event.preventDefault(); 

  var nome = document.getElementById("nome");
  var email = document.getElementById("email");
  var cargo = document.getElementById("cargo");
  var mensagem = document.getElementById("mensagem");
  var exibirErro = document.getElementsByTagName("h1")[0];

  if (nome.value === "") {
    exibirErro.innerHTML = "O campo nome não pode estar vazio.";
    exibirErro.style.display = "block";
    nome.focus();
    return false;
  } else if (nome.value.length < 3) {
    exibirErro.innerHTML =
      "O campo nome deve ter pelo menos três letras.";
    exibirErro.style.display = "block";
    nome.focus();
    return false;
  } else if (email.value === "") {
    exibirErro.innerHTML = "O campo e-mail não pode estar vazio.";
    exibirErro.style.display = "block";
    email.focus();
    return false;
  } else if (email.value.indexOf("@") === -1) {
    exibirErro.innerHTML = "O campo e-mail deve ter @.";
    exibirErro.style.display = "block";
    email.focus();
    return false;
  } else if (email.value.indexOf(".") === -1) {
    exibirErro.innerHTML = "O campo e-mail deve ter ponto.";
    exibirErro.style.display = "block";
    email.focus();
    return false;
  } else if (cargo.value === "Cargo") {
    exibirErro.innerHTML = "Informe um cargo.";
    exibirErro.style.display = "block";
    cargo.focus();
    return false;
  } else if (mensagem.value === "") {
    exibirErro.innerHTML =
      "O campo mensagem não pode estar vazio.";
    exibirErro.style.display = "block";
    mensagem.focus();
    return false;
  } else if (mensagem.value.length < 10) {
    exibirErro.innerHTML =
      "O campo mensagem deve ter pelo menos 10 caracteres.";
    exibirErro.style.display = "block";
    mensagem.focus();
    return false;
  }

  exibirErro.style.display = "none";

  adicionarContatoNaTabela(
    nome.value,
    email.value,
    cargo.value,
    mensagem.value
  );

  nome.value = "";
  email.value = "";
  cargo.value = "Cargo";
  mensagem.value = "";
  atualizarPreview();
  nome.focus();

  return false;
}

function adicionarContatoNaTabela(nome, email, cargo, mensagem) {
  var tabela = document.getElementById("tabela-contatos");
  var tbody = tabela.getElementsByTagName("tbody")[0];

  var novaLinha = tbody.insertRow();

  var celulaNome = novaLinha.insertCell(0);
  var celulaEmail = novaLinha.insertCell(1);
  var celulaCargo = novaLinha.insertCell(2);
  var celulaMensagem = novaLinha.insertCell(3);
  var celulaAcoes = novaLinha.insertCell(4);

  celulaNome.textContent = nome;
  celulaEmail.textContent = email;
  celulaCargo.textContent = cargo;
  celulaMensagem.textContent = mensagem;

  var botaoRemover = document.createElement("button");
  botaoRemover.type = "button";
  botaoRemover.textContent = "Remover";
  botaoRemover.className = "btn-remover";

  botaoRemover.onclick = function () {
    tbody.removeChild(novaLinha);
  };

  celulaAcoes.appendChild(botaoRemover);
}

window.onload = function () {
  var form = document.getElementById("form-contato");
  form.onsubmit = validarFormulario;

  atualizarPreview();
};
