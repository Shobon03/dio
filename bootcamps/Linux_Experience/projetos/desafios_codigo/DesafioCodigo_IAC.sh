#!/bin/bash
# Desafio #1 de Código do Bootcamp Linux Experience da DIO - Infra Como Código -> Infra As Code (IAC)

# EXECUTAR COMO ROOT!!! #

# Tux =^)
#                 .88888888:.
#                88888888.88888.
#              .8888888888888888.
#              888888888888888888
#              88' _`88'_  `88888
#              88 88 88 88  88888
#              88_88_::_88_:88888
#              88:::,::,:::::8888
#              88`:::::::::'`8888
#             .88  `::::'    8:88.
#            8888            `8:888.
#          .8888'             `888888.
#         .8888:..  .::.  ...:'8888888:.
#        .8888.'     :'     `'::`88:88888
#       .8888        '         `.888:8888.
#      888:8         .           888:88888
#    .888:88        .:           888:88888:
#    8888888.       ::           88:888888
#    `.::.888.      ::          .88888888
#   .::::::.888.    ::         :::`8888'.:.
#  ::::::::::.888   '         .::::::::::::
#  ::::::::::::.8    '      .:8::::::::::::.
# .::::::::::::::.        .:888:::::::::::::
# :::::::::::::::88:.__..:88888:::::::::::'
#  `'.:::::::::::88888888888.88:::::::::'
#        `':::_:' -- '' -'-' `':_::::'`
# 
# src: https://asciiart.website/index.php?art=logos+and+insignias/linux


# Criação de diretórios #
echo "Criando diretórios..."

mkdir /public
mkdir /adm # Admin
mkdir /ven # TODO...
mkdir /sec # TODO...

echo "Diretórios criados!"

# Criação de grupos #
echo "Criando grupos..."

groupadd GRP_ADM # Administrador
groupadd GRP_VEN # TODO...
groupadd GRP_SEC # TODO...

echo "Grupos criados!"


# Criação de usuários #
echo "Criando usuários..."

useradd jose -m -s /bin/bash -p $(openssl passwd -crypt 123) -G GRP_ADM
useradd mario -m -s /bin/bash -p $(openssl passwd -crypt 123) -G GRP_ADM
useradd perola -m -s /bin/bash -p $(openssl passwd -crypt 123) -G GRP_ADM

useradd carlos -m -s /bin/bash -p $(openssl passwd -crypt 456) -G GRP_VEN
useradd rita -m -s /bin/bash -p $(openssl passwd -crypt 456) -G GRP_VEN
useradd rosa -m -s /bin/bash -p $(openssl passwd -crypt 456) -G GRP_VEN

useradd vanessa -m -s /bin/bash -p $(openssl passwd -crypt 789) -G GRP_SEC
useradd jairo -m -s /bin/bash -p $(openssl passwd -crypt 789) -G GRP_SEC
useradd alex -m -s /bin/bash -p $(openssl passwd -crypt 789) -G GRP_SEC

echo "Usuários criados!"

# Especificando permissões #
echo "Especificando permissões para diretórios..."

## Mudando dono das pastas e grupos criados, todos p/ root
chown root:GRP_ADM /adm
chown root:GRP_VEN /ven
chown root:GRP_SEC /sec

## Mudando permissões das pastas
    # r - Read
    # w - Write
    # x - eXecute
        # r - 4; w - 2; x - 1;
            # 7 -> rwx
            # 6 -> wx
            # 5 -> rx
            # 4 -> r
            # 3 -> wx
            # 2 -> w
            # 1 -> x
            # 0 -> nenhum :(

chmod 770 /adm # rwx rwx ---
chmod 770 /ven # rwx rwx ---
chmod 770 /sec # rwx rwx ---
chmod 777 /public # rwx rwx rwx

echo -e "Permissões concedidas! \nFim!!!"