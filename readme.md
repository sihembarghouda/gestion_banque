🏦 Gestion de Banque
📌 Description
Ce projet est une application Java de gestion de comptes bancaires avec une interface en ligne de commande.
Elle permet de créer, modifier, supprimer et afficher des comptes bancaires (compte client et compte épargne).
L'application utilise PostgreSQL pour stocker les données et JDBC pour interagir avec la base de données.

⚙️ Technologies utilisées
Java (JDK 21 )
PostgreSQL (Base de données)
JDBC (Connexion à la base)
IntelliJ IDEA (IDE)
🚀 Installation et exécution
1️⃣ Cloner le projet
bash
Copier
Modifier
git clone https://github.com/sihembarghouda/gestion_banque.git
cd gestion-banque
2️⃣ Configurer la base de données
Installer PostgreSQL
Exécuter le script schema.sql pour créer les tables :
Depuis pgAdmin, ouvre schema.sql et exécute-le.
Ou bien depuis le terminal :
bash
Copier
Modifier
psql -U postgres -d gestion_banque -f schema.sql
3️⃣ Configurer IntelliJ IDEA
Ouvrir le projet dans IntelliJ IDEA
Configurer la connexion à la base de données
Compiler et exécuter Main.java
🔧 Fonctionnalités
✅ Créer un compte bancaire
✅ Supprimer un compte
✅ Mettre à jour les informations d’un compte
✅ Consulter le solde d’un compte
✅ Gérer les comptes épargne avec un bénéfice

🛠 Contributeurs
👤 Barghouda Sihem - Développeur principal

📜 Licence
Ce projet est sous licence MIT – voir le fichier LICENSE pour plus de détails.

🎯 Améliorations futures
🔹 Ajouter une interface graphique (JavaFX ou Swing)
🔹 Ajouter une authentification des utilisateurs
🔹 Implémenter une API REST avec Spring Boot