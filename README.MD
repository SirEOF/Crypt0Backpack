**Projet personnel de cryptographie**

Permet de chiffrer, déchiffrer, cryptanalyser différents textes selon plusieurs algorithmes connus tels que : 
- RailFence ou dent de scie. Possibilité de spécifier le nombre de "palissades". Possibilité de bruteforcer si le nombre de palissades est inconnue.
- Possibilité d'analyser un texte fréquentiellement et de retourner un histogramme des fréquences de chaque lettre
- Pour les chiffrements à décalages, possibilité de trouver le décalage à l'aide de l'analyse fréquentielle et des fréquences théoriques de l'apparition des lettres d'une langue donnée et d'obtenir le décalage le plus probable calculé.
- Décalage de césar simple et dans toutes la table ASCII
- Possibilité de chiffrement monoalphabétique selon un alphabet customisé/propre.
- Chiffrement/déchiffrement monoalphabétique dégressif et progressif
- Casser Vigenère selon : 
	- la technique du KPTA (Known Plain Text Attack),
	- Selon Babbage en analysant des patterns/répétitions au sein du cyphertext -> reconstruction de la clé,
	- Attaque par dictionnaire disponible,
	- Cryptanalyse de la clé : retrouver la taille potentielle de la clé ou utilisation de l'IC (indice de coincidence),
	- Sur le calcul des facteurs communs

Basé sur les livres : 
- Hacking Secret Ciphers with Python: A beginner's guide to cryptography and computer programming with Python: https://www.amazon.com/Hacking-Secret-Ciphers-Python-cryptography/dp/1482614375
- Histoire des codes secrets: https://www.amazon.fr/Histoire-codes-secrets-Simon-Singh/dp/2253150975/ref=sr_1_1?ie=UTF8&qid=1516663146&sr=8-1&keywords=simon+singh# Crypt0Backpack
