#!/bin/bash
#Desafio #2 de Código do Bootcamp Linux Experience da DIO - Infra Como Código p/ criação de servidor Apache

#                         _          
#                        | |         
#   __ _ _ __   __ _  ___| |__   ___ 
#  / _` | '_ \ / _` |/ __| '_ \ / _ \
# | (_| | |_) | (_| | (__| | | |  __/
#  \__,_| .__/ \__,_|\___|_| |_|\___|
#       | |                          
#       |_|             

# EXECUTAR COMO ROOT!!! #

# Atualizando os pacotes
echo "Atualizando e instalando pacotes..."
apt-get update
apt-get upgrade -y

# Instalando apache e unzip
apt-get install apache2 -y
apt-get install unzip -y

echo "Feito!"

# Baixando os arquivos do site na pasta /tmp/
echo "Baixando arquivos e descompactando..."

cd /tmp/
wget https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip

# Descompactando
unzip main.zip
cd linux-site-dio-main

echo "Feito!"

# Copiando os arquivos para a pasta do apache
cp -R * /var/www/html/

echo -e "Feito! \nTerminado a execução!"