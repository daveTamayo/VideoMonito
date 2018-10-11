<%-- 
    Document   : Registro
    Created on : 19/09/2018, 12:34:14 PM
    Author     : Familia Pinilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/grayscale.min.css" rel="stylesheet">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    </head>
    <body id="page-top">
    <secction id="signup" class="signup-section">
        <div class="container">
            <div class="row">
                <div class="col-md-10 col-lg-8 mx-auto text-center">
                    <h1>Registrar Usuario!</h1>
                    <form action="Control" method="GET">
                        <input type="text" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="txtId" placeholder="Identificacion..." required><br>
                        <input type="text" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="txtNombre" placeholder="Nombre Completo..." required><br>
                        <input type="date" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="fecha" min="2000-06-07" max="2018-09-29" required/><br>
                        <input type="text" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="txtReferente" placeholder="Referente..." required><br>
                        <input type="email" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="txtCorreo"  placeholder="Correo electrónico..." required><br>
                        <input type="password" class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" name="txtPass" placeholder="Ingresa Contraseña..." required><br>
                        <input type="submit" class="btn btn-primary mx-auto" name="registro" value="Registrar">
                    </form>
                    <br><br><input type='submit' onclick="location.href='http://localhost:8080/VideoMonito/'" class='btn btn-primary mx-auto' name='volver' value='Volver'>
                </div>
            </div>
        </div>
        <div class="container">

        </div>
    </secction>
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/grayscale.min.js"></script>

</body>
</html>
