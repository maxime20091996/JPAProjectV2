# JPAProjectV2

Installer TomcatServer 9.0

Utilisation de Java v.8.x

Creer une base MySql nommé demoformation

Recupération du WAR

Au niveau du disque C, ouvrir un invité de commande et saisir : 

mkdir C:\DemoFormation

cd C:\DemoFormation

mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/maxime20091996/JPAProjectV2

Aller dans target\checkout\DemoFormation

Saisir mvn install

Récupérer dans le dossier target le WAR généré

Deplacer le fichier DemoFormation.war dans le dossier webapps de Tomcat

Executer startup.bat situé dans le dossier bin de tomcat

Dans l'url du navigateur, entrer le lien suivant : http://localhost:8080/DemoFormation
