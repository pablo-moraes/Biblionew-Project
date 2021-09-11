<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BiblioNew - Cadastrar Livro</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/style.css" />
    </head>

    <body class="bkg-body">
        <header class="container d-flex justify-content-between align-items-center">
            <h1><a href="#"><img src="../assets/img/Logo.png" alt="Logo BiblioNew" class="my-4 logo-sm"></a></h1>
            <a href="../home/home.jsp" class="text-decoration-none my-4 text-black-2">
                <i data-feather="arrow-left"></i> Voltar para a página inicial</a>
            </a>
        </header>
        <main class="container-md mx-auto register-padding mb-5">
            <section class="register-container personal-container mx-auto">
                <h1 class="ubuntu mb-5">Cadastro de Livros</h1>
                <h4 class="ubuntu mb-3">Dados do livro</h4>
                <form action="../register_book" method="POST">
                    <div class="row mb-2">
                        <div class="col-md-10">
                            <label for="idNome" class="form-label">Nome do Livro</label>
                            <input type="text" name="nome" id="idNome" class="form-control" required="" />
                        </div>

                        <div class="col-md-2">
                            <label for="idEdicao" class="form-label">Edição</label>
                            <input type="number" name="edicao" id="idEdicao" class="form-control" min="1" max="25">
                        </div>
                    </div>

                    <div class="row mb-2">
                        <div class="col-md-10">
                            <label for="idAutor" class="form-label">Nome do Autor</label>
                            <input type="text" id="idAutor" class="form-control" name="autor" />
                        </div>
                        <div class="col-md-2">
                            <label for="idIdioma" class="form-label">Idioma</label>
                            <select class="form-select" name="lang" id="idIdioma">
                                <option valeu=""></option>
                                <option value="pt">Português</option>
                                <option value="en">Inglês</option>
                                <option value="es">Espanhol</option>
                            </select>
                        </div>
                    </div>

                    <div class="row mb-2">
                        <div class="col-md-3">
                            <label for="idISBN10" class="form-label">ISBN10</label>
                            <input type="text" name="isbn10" id="idISBN10" class="form-control" />
                        </div>

                        <div class="col-md-3">
                            <label for="idISBN13" class="form-label">ISBN10</label>
                            <input type="text" name="isbn13" id="idISBN13" class="form-control" />
                        </div>

                        <div class="col-md-3">
                            <label for="idNumeroPaginas" class="form-label">Número de Páginas</label>
                            <input type="number" name="numpaginas" id="idNumeroPaginas" class="form-control" min="1"
                                max="8000" />
                        </div>
                        <div class="col-md-3"></div>
                    </div>

                    <div class="row mb-2">
                        <div class="col-md-3">
                            <label for="" class="form-label">Altura Centímetros</label>
                            <input type="number" class="form-control" name="altura" min="10" max="60" />
                        </div>

                        <div class="col-md-3">
                            <label for="" class="form-label">Largura Centímetros</label>
                            <input type="number" class="form-control" name="largura" min="10" max="60" />
                        </div>

                        <div class="col-md-6"></div>
                    </div>

                    <h4 class="ubuntu mt-5 mb-3">Dados da Editora</h4>

                    <div class="row mb-2">
                        <div class="col-md-6">
                            <label for="idNameEditora" class="form-label">Nome</label>
                            <input type="text" class="form-control" id="idNameEditora" name="nomeEdit" required="" />
                        </div>

                        <div class="col-md-6">
                            <label for="idCNPJ" class="form-label">CNPJ</label>
                            <input type="text" name="cnpj" class="form-control" id="idCNPJ" />
                        </div>
                    </div>

                    <div class="row mb-2">
                        <div class="col-md-6">
                            <label for="idRepresentante" class="form-label">Nome do Representante</label>
                            <input type="text" class="form-control" id="idRepresentante" name="nomeRepresentante" />
                        </div>

                        <div class="col-md-6">

                        </div>
                    </div>

                    <div class="row mb-2">
                        <div class="col-md-5">
                            <label for="idEndereco" class="form-label">Endereço</label>
                            <input type="text" name="endereco" class="form-control" id="idEndereco" />
                        </div>

                        <div class="col-md-5">
                            <label for="idCidade" class="form-label">Cidade</label>
                            <input type="text" name="cidade" class="form-control" id="idCidade" />
                        </div>

                        <div class="col-md-2">
                            <label for="idUf" class="form-label">UF</label>
                            <select name="uf" id="idUf" class="form-select">
                                <option value=""></option>
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
                        <div class="col-md-4">
                            <label for="idTel" class="form-label">Telefone</label>
                            <input type="tel" name="tel" id="idTel" class="form-control" />
                        </div>

                        <div class="col-md-4">
                            <label for="idTel2" class="form-label">Telefone 2</label>
                            <input type="tel" name="tel2" id="idTel2" class="form-control" />
                        </div>
                        <div class="col-md-4"></div>
                    </div>

                    <h4 class="ubuntu mt-5 mb-3">Categoria</h4>
                    <!-- <div class="row mb-2"> -->
                    <div class="col-md-3 mb-2">
                        <label for="idCategoria" class="form-label">Selecione a categoria</label>
                        <select name="categoria" id="idCategoria" class="form-select">
                            <option value=""></option>
                            <option value="tecnico">Livro Técnico</option>
                            <option value="ficcao">Ficção</option>
                            <option value="romance">Romance</option>
                            <option value="terror">Terror</option>
                            <option value="ação">Ação</option>
                            <option value="literatura">Literatura</option>
                            <option value="suspense">Suspense</option>
                        </select>
                    </div>
                    <!-- </div> -->
                    <div class="col-md-12">
                        <label for="idObservacaoCategoria" class="form-label">Observação</label>
                        <textarea name="observacaoCat" class="form-control" id="idObservacaoCategoria" cols="30"
                            rows="5"></textarea>
                    </div>


                    <h4 class="ubuntu mt-5 mb-3">Estado de Conservação</h4>
                    <!-- <div class="row mb-2"> -->
                    <div class="col-md-3 mb-2">
                        <label for="idConservacao" class="form-label">Estado de Conservação</label>
                        <input type="number" name="conservacao" id="idConservacao" class="form-control" min="1" max="10"/>
                    </div>
                    <!-- </div> -->
                    <div class="col-md-12">
                        <label for="idObservacaoCategoria" class="form-label">Observação</label>
                        <textarea name="observacaoCat" class="form-control" id="idObservacaoCategoria" cols="30"
                            rows="5"></textarea>
                    </div>
                    <div class="col-12 mt-4">
                        <button type="submit" class="btn btn-color ms-auto">
                            Cadastrar Livro
                        </button>
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