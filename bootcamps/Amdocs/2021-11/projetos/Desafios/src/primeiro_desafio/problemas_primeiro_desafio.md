# Enunciados dos problemas

## AMudança.java

### Problema

![](https://www.urionlinejudge.com.br/gallery/images/problems/UOJ_2686.png)

Hermione está criando um novo Vira Tempo especialmente para programadores. É impressionante as vantagens que ele oferece e o conforto pra codar que ele tem. O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de inclinação do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.

### Entrada

A entrada contém um número inteiro M (0 ≤ M ≤ 360) representando o grau do Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada segundo(EOF).

### Saída

Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

## AMudançaContinua.java

### Problema

![](https://www.urionlinejudge.com.br/gallery/images/problems/UOJ_2686.png)

Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu o programa anterior só informava uma saudação, ele pediu que transformasse o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a posição do Sol/Lua, refaça o sistema só que agora além da saudação de cada período do dia, informe exatamente as horas, os minutos e segundos.

### Entrada

A entrada contem um pontos flutuantes M (0 ≥ M < 360) representando a posição, em graus,do Sol/Lua em relação a terra. Como eles andam em constante movimento seu programa receberá diversos casos a cada segundo(EOF).

### Saída

Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!", e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).

## Colchao.java

### Problema

João está comprando móveis novos para sua casa. Agora é a vez de comprar um colchão novo, de molas, para substituir o colchão velho. As portas de sua casa têm altura H e largura L e existe um colchão que está em promoção com dimensões A × B × C.

O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo através de uma porta com uma de suas faces paralelas ao chão, mas consegue virar e rotacionar o colchão antes de passar pela porta.

Entretanto, de nada adianta ele comprar o colchão se ele não passar através das portas de sua casa. Portanto ele quer saber se consegue passar o colchão pelas portas e para isso precisa de sua ajuda.

### Entrada

A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300), as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros H e L (1 ≤ H, L ≤ 250), respectivamente a altura e a largura das portas em centímetros.

### Saída

Se programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão passa pelas portas e apenas a letra ‘N’ em caso contrário.
