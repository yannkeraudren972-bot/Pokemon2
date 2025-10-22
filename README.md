# Pokémon 2 - Evolution !

_Projet Java - Extension du sujet “Pokémon - Attrapez-les tous !” (Nicola Verstaevel)_

## 🧠 Objectifs pédagogiques

Ce projet vise à illustrer plusieurs concepts fondamentaux de la programmation orientée objet en Java :

- **Héritage et polymorphisme**
- **Enums et collections**
- **Classes abstraites**
- **Pattern Visitor**
- **Constructeurs de copie partielle ("quasi-copy")**
- **Architecture de packages propre et modulaire**
- **Utilisation de Git et GitHub pour le versionnement**


## 🧩 Concepts clés

### Enum
Utilisation d’enums pour représenter les types de Pokémon, leurs éléments (Feu, Eau, Plante, etc.), ou leurs états d’évolution.

### Collection
Utilisation de collections Java (`List`, `Map`, etc.) pour gérer les groupes de Pokémon, les Pokédex, ou les évolutions disponibles.

### Abstract
Définition de classes abstraites pour les Pokémon, permettant de factoriser les comportements communs et de spécialiser les espèces.

### Pattern Visitor
Implémentation du **Visitor Pattern** pour appliquer des opérations sur les Pokémon sans modifier leurs classes (ex : affichage, calculs, etc.).

### Quasi-copy Constructor
Création de constructeurs permettant de cloner partiellement un Pokémon (ex : copier les stats mais changer le nom ou le type).
