<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BiblioNew - Cadastro</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/style.css"/>
    </head>
    <body class="bkg-body">
        <header class="container d-flex justify-content-between align-items-center">
            <h1><a href="#"><img src="../assets/img/Logo.png" alt="Logo Biblionew" class="my-4 logo-sm"></a></h1>
            <a href="../index.html" class="text-decoration-none my-4 text-black-2"><i data-feather="arrow-left"></i> Voltar para a página inicial</a>
        </header>
        <main class="container-md mx-auto register-padding mb-5">
            <section class="register-container personal-container mx-auto">
                <h1 class="ubuntu mb-5">Cadastro de Usuário</h1>
                <h4 class="ubuntu mb-3">Dados de usuário</h4>
                <form action="../register_user" method="POST">
                    <div class="col-md-12 mb-2">
                        <label for="idNome" class="form-label">Nome Completo</label>
                        <input type="text" id="idNome" name="nome" class="form-control" required=""/>
                    </div>
                    <div class="row mb-2">
                        <div class="col-md-6">
                            <label for="idEmail" class="form-label">Email</label>
                            <input type="email" name="email" id="idEmail" class="form-control" required=""/>
                        </div>
                        <div class="col-md-6">
                            <label for="idSenha" class="form-label">Senha</label>
                            <input type="password" id="idSenha" name="password" class="form-control" required=""/>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <div class="col-md-6">
                            <label for="idCpf" class="form-label">CPF</label>
                            <input type="text" id="idCpf" name="cpf" class="form-control" required=""/>
                        </div>
                        <div class="col-md-4">
                            <label for="idRg" class="form-label">RG</label>
                            <input type="text" id="idRg" name="rg" class="form-control" required=""/>
                        </div>
                        <div class="col-md-2">
                            <label for="idUf" class="form-label">UF</label>
                            <select name="uf" id="idUf" class="form-select">
                                <option value="AC">Acre</option>
                                <option value="AL">Alagoas</option>
                                <option value="AP">Amapá</option>
                                <option value="AM">Amazonas</option>
                                <option value="BA">Bahia</option>
                                <option value="CE">Ceará</option>
                                <option value="DF">Distrito Federal</option>
                                <option value="ES">Espírito Santo</option>
                                <option value="GO">Goiás</option>
                                <option value="MA">Mato Grosso</option>
                                <option value="MT">Mato Grosso do Sul</option>
                                <option value="MG">Minas Gerais</option>
                                <option value="PA">Pará</option>
                                <option value="PB">Paraíba</option>
                                <option value="PR">Paraná</option>
                                <option value="PE">Pernambuco</option>
                                <option value="PI">Piauí</option>
                                <option value="RJ">Rio de Janeiro</option>
                                <option value="RN">Rio Grande do Norte</option>
                                <option value="RS">Rio Grande do Sul</option>
                                <option value="RO">Rondônia</option>
                                <option value="RR">Roraima</option>
                                <option value="SC">Santa Catarina</option>
                                <option value="SP">São Paulo</option>
                                <option value="Se">Sergipe</option>
                                <option value="TO">Tocantins</option>
                                <option value=""></option>
                            </select>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <div class="col-md-6">
                            <label for="idEndereco" class="form-label">Endereco</label>
                            <input type="text" id="idEndereco" name="endereco" class="form-control" required=""/>
                        </div>
                        <div class="col-md-6">
                            <label for="idCidade" class="form-label">Cidade</label>
                            <input type="text" id="idCidade" name="cidade" class="form-control" required=""/>
                        </div>
                    </div>
                    <div class="col-md-6 mb-2">
                        <label for="idTel" class="form-label">Telefone</label>
                        <input type="tel" id="idTel" name="telefone" class="form-control" required=""/>
                    </div>
                    <div class="col-12 mt-4">
                        <button type="submit" class="btn btn-color ms-auto">Cadastrar Usuario</button>
                    </div>
                </form>
            </section>
        </main>
        <script src="../assets/js/feather.min.js"></script>
        <script>
            feather.replace();
        </script>
    </body>
</html>
