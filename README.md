# Projeto Hotel SPA

Elaborado por :	                  
     
     Patrícia Murotani      RGM: 11221402627
     Vanessa F. M. Randis     RGM:11212100351

Padrões extraídos de sites e vídeos explicando como elaborar um projeto.

Segue explicações de como foi desenvolvido:

IDE utilizada: Eclipse
* JAVA 8
* Maven
* Framework lombok
* Spring boot


Instruções para testar:
 
Deve ser acessado através do navegador
localhost:8080/h2-console
Ao acessar deve ser inserido os dados 
que consta no aplication.properties

Para efetuar o teste do CRUD
Utilizar o postman e configurar a url:localhost:8080/api/clientes e no body inserir os dados 
obrigatórios como nome e cpf seguindo o exemplo abaixo, o cpf deve ser retirado de um gerador de cpf:

{
	"nome":"Pedro Toledo",
	"cpf":"46067310015"
}
