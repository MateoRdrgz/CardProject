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

- *02/04/2024*
    -  *(Nathan et Mateo)* :
        - Ecriture des tests unitaires.

- *11/04/2024*
    -  *(Nathan et Mateo)* :
        - Amélioration du ReadMe.
        - Vérification du code.


## Points techniques améliorés
(Beaucoup de peer coding, donc les points techniques sont similaires)
- Programmation défensive : Nous avons appris à chercher toutes les failles possibles, à nous mettre à la place de l'utilisateur afin de nous imaginer ce qu'il pourrait vouloir faire.
- Tests unitaire : Nous avons compris l'intérêt des tests unitaire. Ceux-ci nous permettent de tester régulièrement notre application afin de s'assurer que tout fonctionne.  
- Noms de fonctions/variables : Nous avons compris l'importance de donner des noms explicites lorsque nous codons. Cela nous permet de beaucoup mieux nous repérer dans notre code. Nous avons appliqué ce principe au maximum et effectivement, cela a rendu le travail sur ce projet bien plus agréable.