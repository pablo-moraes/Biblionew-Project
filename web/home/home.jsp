<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BiblioNew - Home</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/home.css"/>
    </head>
    <body class="bkg-body">
        <header class="">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container-xxl">
                    <h1 class="navbar-brand"><a href="#"><img src="../assets/img/Logo.png" class="logo-small" alt="Logo BiblioNew"/></a></h1>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Alternar Menu">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarText">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="../home/home.jsp">Biblioteca</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Reservas</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Admin
                                </a>
                                <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                                    <li><a class="dropdown-item" href="../admin/dashboard.jsp">Dashboard</a></li>
                                    <li><a class="dropdown-item" href="../admin/book-register.jsp">Registrar livro</a></li>
                                    <li><a class="dropdown-item" href="../admin/inactivate.jsp">Inativar Usuário</a></li>
                                </ul>
                            </li>
                        </ul>
                        
                        

                        <div class="nav-item dropwdown">
                            <a class="nav-link" href="../logout">
                                Logout<i data-feather="log-out" class="blue"></i></a>
                            </a>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <main>
            <section class="container-fluid">
                <form class="row-shadow mt-5">
                    <div class="row d-flex row-shadow justify-content-center">
                        <div class="col-4 col-md-4 shadow-lg position-relative ">
                            <div class="position-absolute top-0 bottom-0">
                                <i data-feather="search"></i>
                            </div>
                            <input type="search" class="form-control" id="searchInput" placeholder="Digite o nome do livro ou autor"/>
                        </div>
                        <div class="col-2 col-md-2 shadow-lg">
                            <select name="categoria" id="sortBy" class="form-select">
                                <option value="">Categoria</option>
                                <option value="tecnico">Livro Técnico</option>
                                <option value="ficcao">Ficção</option>
                                <option value="romance">Romance</option>
                                <option value="terror">Terror</option>
                                <option value="ação">Ação</option>
                                <option value="literatura">Literatura</option>
                                <option value="suspense">Suspense</option>
                            </select>
                        </div>
                    </div>
                </form>
            </section>
            <section class="container mt-5">
                <table class="table" id="table">
                    <thead>
                        <tr>
                            <th>Título</th>
                            <th>Categoria</th>
                            <th>Autor</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </c:foreach>
                    </tbody>
                </table>
            </section>
        </main>
        <script type="text/javascript" src="../assets/js/feather.min.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-3.5.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript">
            feather.replace();
        </script>
        <script>
            let table = $('#table').DataTable({
            "searching": false,
                    "processing": true,
                    "data": function ({}, d, {
                    return $.extend({}, d, {
                    "search_keywords": $('#searchInput').val().toLowerCase(),
                            "filter_option": $('#sortBy').val().toLowerCase(),
                    });
                    });
                    });
            $(document).ready(function() {
            table.draw();
            $('#searchInput, #sortBy').bind("keyup change", function() {
            table.draw();
            })
            })
        </script>
    </body>
</html>