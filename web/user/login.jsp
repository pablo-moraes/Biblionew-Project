<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BiblioNew - Logar-se</title>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap-theme.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/style.css"/>
    </head>
    <body class="bkg-body">
        <div class="container-fluid">
            <div class="row justify-content-center">
                <section class="col">
                    <img src="../assets/img/Logo.png" class="mx-auto d-block my-5"/>
                    <form action="../login_user" method="POST">
                        <div class="d-flex flex-column">
                            <input type="email" class="px-3 mb-2 input-lg" name="mail" id="idEmail" placeholder="Digite o seu email" required=""/>
                            <input type="password" class="px-3 mb-2 input-lg" name="pass" id="idPass" placeholder="Digite sua senha" required=""/>
                            <button type="submit" class="btn-lg btn-color mb-2">Entrar</button>
                        </div>
                        <div class="d-flex justify-content-between">
                            <div class="form-check">
                                <input type="checkbox" class="form-check-input" name="remember" id="idRemember" value="remember"> 
                                <label for="idRemember">Lembrar-se de mim</label>
                            </div>
                            <a href="recover.jsp" class="text-decoration-none text-black-2">Esqueceu a senha?</a>
                        </div>
                        <div class="btn-sign-up">
                            <a href="register.jsp" class="text-decoration-none text-black-2"><i data-feather="log-in"></i> Não tenho cadastro</a>
                        </div>
                    </form>
                </section>
                <section class="col img-section">
                    <img src="../assets/img/undraw_reading.png" alt="Reading time" class="undraw-image mt-4">
                </section>
            </div>
        </div>
        <script typeo="text/javascript" src="../assets/js/feather.min.js"></script>
        <script>
            feather.replace();
        </script>
    </body>
</html>