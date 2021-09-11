<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BiblioNew - Recuperar Acesso</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/style.css"/>
    </head>
    <body class="bkg-body">
        <header class="container d-flex justify-content-between align-items-center">
            <h1><a href="#"><img src="../assets/img/Logo.png" alt="Logo Biblionew" class="my-4 logo-sm"></a></h1>
            <a href="login.jsp" class="text-decoration-none my-4 text-black-2"><i data-feather="arrow-left"></i> Voltar para a página inicial</a>
        </header>
        <main>
            <h2 class="ubuntu text-center mt-3 mb-3">Digite o seu e-mail para que possamos te enviar um link de recuperação</h2>
            <section class="container-12 mx-auto">
           
                <form class="form-white mx-auto px-4">
                    <div class="row">
                        <input type="email" name="email" class="form-control input-lg mb-2"/>
                        <button type="submit" class="btn-lg btn-color">Enviar</button>
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