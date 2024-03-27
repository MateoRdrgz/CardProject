## Fonctionnement

Ce projet permet de créer et gérer des cartes Pokémon et Magic. 
Il est structuré comme ceci : 
- Une class abstraite `Card` qui définit les attributs et méthodes communs à toutes les cartes.
- Deux classes `PokemonCard` et `MagicCard` qui héritent de `Card` et qui définissent les attributs et méthodes spécifiques à chaque type de carte.
- Une classe `CardList` qui permet de stocker les deux types de carte et de les manipuler. Il existe aussi des méthodes permettant de récupérer seulement les cartes Pokémon ou Magic.

## Logs de développement
- **25/03/2024** 
  - *(Nathan)* :
      - Création des classes `PokemonCard`,`PokemonAttack` et de l'énumeration `PokemonTypes`.
  -  *(Mateo)* :
      - Création des classes `Card`, `MagicCard` et de l'énumeration `MagicCardType` et `Mana`.


- *27/03/2024*
  -  *(Nathan)* :
      - Création de la `CardList` (mise en place du design pattern Singleton).
      - **Programmation défensive** sur les classe de Pokémons et `CardList`.
      - Ecriture du ReadMe.
     
  -  *(Mateo)* :
      - Création des classes `Land` et `Creature`
      - Programmation défensive.
      - Ecriture du ReadMe.

