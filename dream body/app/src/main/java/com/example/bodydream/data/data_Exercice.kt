package com.example.bodydream.data

import com.example.bodydream.R
import com.example.bodydream.model.Exercise

fun exercisesD(): List<Exercise> {

    val exercises = listOf(

        Exercise(
            R.drawable.pushup,
            "Push Up",
            "00:30",
            "Strength",
            "Le Push Up est l’un des exercices de base les plus populaires en musculation et en entraînement au poids du corps. " +
                    "Il sollicite principalement les muscles de la poitrine (pectoraux), mais aussi les épaules, les triceps et les muscles du tronc, notamment les abdominaux.\n\n" +
                    "Cet exercice est très apprécié car il ne nécessite aucun matériel et peut être réalisé n’importe où, que ce soit à la maison ou en salle de sport.\n\n" +
                    "Il améliore la force musculaire, l’endurance et la stabilité du corps."
        ),

        Exercise(
            R.drawable.squat,
            "Squat",
            "00:45",
            "Legs",
            "Le Squat est un exercice fondamental pour le renforcement du bas du corps.\n\n" +
                    "Il cible principalement les quadriceps, les fessiers et les ischio-jambiers, tout en sollicitant les muscles du tronc pour la stabilité.\n\n" +
                    "C’est un exercice essentiel pour améliorer la force, l’équilibre et la posture."
        ),

        Exercise(
            R.drawable.plank,
            "Plank",
            "01:00",
            "Core",
            "Le Plank est un exercice isométrique très efficace pour renforcer les muscles du tronc.\n\n" +
                    "Il sollicite principalement les abdominaux, le dos et les épaules.\n\n" +
                    "Il améliore la stabilité, la posture et l’endurance musculaire."
        ),

        Exercise(
            R.drawable.jumping_jack,
            "Jumping Jack",
            "00:30",
            "Cardio",
            "Le Jumping Jack est un exercice cardio dynamique utilisé souvent comme échauffement.\n\n" +
                    "Il permet d’augmenter rapidement le rythme cardiaque et d’améliorer la coordination.\n\n" +
                    "C’est un excellent exercice pour brûler des calories."
        ),

        Exercise(
            R.drawable.burpees,
            "Burpees",
            "00:40",
            "Cardio",
            "Le Burpee est un exercice très intense qui combine renforcement musculaire et cardio.\n\n" +
                    "Il sollicite l’ensemble du corps, notamment les jambes, les bras et les abdominaux.\n\n" +
                    "Il améliore la condition physique générale et l’endurance."
        ),

        Exercise(
            R.drawable.lunges,
            "Lunges",
            "00:45",
            "Legs",
            "Les Lunges sont excellentes pour renforcer les jambes et améliorer l’équilibre.\n\n" +
                    "Elles ciblent les quadriceps, les fessiers et les ischio-jambiers.\n\n" +
                    "Elles améliorent aussi la coordination et la stabilité."
        ),

        Exercise(
            R.drawable.mountain_climber,
            "Mountain Climber",
            "00:30",
            "Cardio",
            "Le Mountain Climber est un exercice cardio dynamique très efficace.\n\n" +
                    "Il renforce les abdominaux tout en augmentant le rythme cardiaque.\n\n" +
                    "Il aide à brûler des calories rapidement."
        ),

        Exercise(
            R.drawable.situp,
            "Sit Up",
            "00:40",
            "Core",
            "Le Sit Up est un exercice classique pour renforcer les muscles abdominaux.\n\n" +
                    "Il améliore la force du tronc et la posture.\n\n" +
                    "Il doit être exécuté correctement pour éviter les blessures."
        ),

        Exercise(
            R.drawable.pullup,
            "Pull Up",
            "00:35",
            "Strength",
            "Le Pull Up est un exercice avancé qui cible principalement les muscles du dos et des bras.\n\n" +
                    "Il développe la force du haut du corps.\n\n" +
                    "Il améliore également la posture."
        ),

        Exercise(
            R.drawable.wall_sit,
            "Wall Sit",
            "01:00",
            "Legs",
            "Le Wall Sit est un exercice isométrique pour les jambes.\n\n" +
                    "Il renforce les cuisses et améliore l’endurance musculaire.\n\n" +
                    "Il est idéal pour développer la résistance."
        )
    )

    return exercises
}
