document.getElementById('login-form').addEventListener('submit', function(event) {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMessage = document.getElementById('error-message');
    
    // Exemplo de validação básica no cliente (não substitui a validação do servidor)
    if (username === '' || password === '') {
        event.preventDefault(); // Impede o envio do formulário
        errorMessage.textContent = 'Por favor, preencha todos os campos.';
    } else {
        errorMessage.textContent = ''; // Limpa a mensagem de erro
    }
});
