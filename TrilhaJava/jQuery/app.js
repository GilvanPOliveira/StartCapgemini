$(document).ready(function () {
  $('#form-contato').on('submit', function (event) {
    event.preventDefault(); 

    const nome = $('#nome').val().trim();
    const email = $('#email').val().trim();

    if (!nome || !email) {
      mostrarMensagem('Preencha todos os campos.', 'erro');
      return;
    }

    if (!validarEmail(email)) {
      mostrarMensagem('Digite um e-mail válido.', 'erro');
      return;
    }

    adicionarContato(nome, email);

    $('#nome').val('');
    $('#email').val('');
    $('#nome').focus();

    mostrarMensagem('Contato adicionado com sucesso!', 'sucesso');
  });

  $('#tabela-contatos tbody').on('click', '.btn-remover', function () {
    const linha = $(this).closest('tr');

    linha.fadeOut(300, function () {
      $(this).remove();
    });
  });

  $('#filtro').on('keyup', function () {
    const termo = $(this).val().toLowerCase();

    $('#tabela-contatos tbody tr').each(function () {
      const nome = $(this).find('td').eq(0).text().toLowerCase();

      if (nome.includes(termo)) {
        $(this).show();
      } else {
        $(this).hide();
      }
    });
  });

  function adicionarContato(nome, email) {
    const novaLinha = `
      <tr>
        <td>${nome}</td>
        <td>${email}</td>
        <td class="col-acao">
          <button type="button" class="btn-remover">Remover</button>
        </td>
      </tr>
    `;

    const $linha = $(novaLinha).hide();
    $('#tabela-contatos tbody').append($linha);
    $linha.fadeIn(300); 
  }

  function mostrarMensagem(texto, tipo) {
    const $msg = $('#mensagem');

    $msg.stop(true, true);

    $msg
      .removeClass('sucesso erro')
      .addClass(tipo)
      .text(texto)
      .fadeIn(200)
      .delay(1500)
      .fadeOut(400);
  }

  function validarEmail(email) {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
  }
});
