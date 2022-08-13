<html>
    <head>
        <title>PHP Microsservico</title>
    </head>
    <body>
        <?php
            ini_set("display_errors", 1);
            header("Content-Type: text/html; charset=utf-8");

            echo "PHP version: " . phpversion() . "<br>";

            // Criar conexão
            $host = "";
            $user = "";
            $pass = "";
            $db_name = "";

            $link = new mysqli($host, $user, $pass, $db_name);

            // Verifica conexão
            if (mysqli_connect_errno()) {
                printf("Connection failed: %s\n", mysqli_connect_error());
                exit();
            }

            // Valores aleatórios p/ inserção aleatória
            $valor_rand1 =  rand(1, 999);
            $valor_rand2 = strtoupper(substr(bin2hex(random_bytes(4)), 1));
            $host_name = gethostname();

            $query = "INSERT INTO usuario (nome, sobrenome, data_nascimento, pais) VALUES '$valor_rand2', '$valor_rand2', '01/01/2001', 'Brasil'";

            if ($link->query($query) === TRUE) {
                echo "New record created successfully";
            } else {
                echo "Error: " . $link->error;
            }
        ?>
    </body>
</html>