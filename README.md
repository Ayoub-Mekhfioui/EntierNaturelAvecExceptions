# EntierNaturelAvecExceptions

![Java](https://img.shields.io/badge/Java-17-blue)
![GitHub](https://img.shields.io/badge/GitHub-Repository-brightgreen)

**EntierNaturelAvecExceptions** est un programme Java qui permet de gérer des entiers naturels (nombres positifs ou nuls) tout en utilisant des exceptions personnalisées pour garantir que les valeurs restent valides. Le programme inclut une classe `EntierNaturel` qui encapsule un entier naturel et fournit des méthodes pour le manipuler, ainsi qu'une exception personnalisée `NombreNegatifException` pour gérer les cas où une valeur négative est introduite.

---

## Fonctionnalités

1. **Validation des entiers naturels** :
    - Le programme garantit que les valeurs des entiers naturels ne peuvent pas être négatives.
    - Une exception personnalisée `NombreNegatifException` est levée si une valeur négative est détectée.

2. **Opérations disponibles** :
    - **Initialisation** : Crée un entier naturel avec une valeur initiale.
    - **Modification** : Permet de modifier la valeur de l'entier naturel.
    - **Décrémentation** : Décrémente la valeur de l'entier naturel de 1.
    - **Récupération de la valeur** : Retourne la valeur actuelle de l'entier naturel.

3. **Gestion des erreurs** :
    - Le programme capture et gère les exceptions de type `NombreNegatifException`.
    - La valeur erronée qui a déclenché l'exception est mémorisée et peut être consultée.

---

## Utilisation

1. Créez un objet `EntierNaturel` en fournissant une valeur initiale.
2. Utilisez les méthodes `setVal`, `getVal`, et `decrementer` pour manipuler l'entier naturel.
3. Capturez les exceptions `NombreNegatifException` pour gérer les erreurs.

---

