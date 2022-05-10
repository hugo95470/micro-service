# micro-service

Ce projet se compose de 5 applications :
 - eureka Registry (enregistre les differentes application sur le reseau)
 - web service (execute les requetes)
 - front web service (centraise les requetes, contient un circuit breaker pour palier aux pannes des différents web service)
 - Load balancer (distribut la charge sur les différentes api front)
 - api gateway

#Mise en place
Pour lancer le projet, clonez le simplement et lancez les 4 applications. Elles devraient s'identifier au pret de eureka registry et vous pourrez faire une requete
a l'adresse suivante : http://localhost:8181/

Enregistrement des applications via la machine eureka registry :
![image](https://user-images.githubusercontent.com/59528575/167590927-2a5ce45e-fea4-40fb-be8d-8e233ef52ff5.png)

Enfin, nous avons sécurisé le réseau en ne l'exposant qu'avec une seul gateway chargé également de l'authentification :
disponible à l'url : http://localhost:8484/
![image](https://user-images.githubusercontent.com/59528575/167602076-dd79a2cc-81f6-4127-a68c-0705059b3c86.png)
