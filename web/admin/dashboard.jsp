<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BiblioNew - Dashboard</title>
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="../assets/css/home.css" />
    <link rel="stylesheet" type="text/css" href="../assets/css/style.css" />
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
    <section class="container-fluid">
        <h1 class="ubuntu mt-4 ps-5">Dashboard</h1>
        <article></article>
        <article></article>
    </section>

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