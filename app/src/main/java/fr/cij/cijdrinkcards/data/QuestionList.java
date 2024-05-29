package fr.cij.cijdrinkcards.data;

import java.util.Arrays;
import java.util.List;

public class QuestionList {

    public List<Question> getQuestions(){
        return Arrays.asList(
                new Question(
                        "Qui est le créateur de Facebook ?",
                        Arrays.asList(
                                "Steve Jobs",
                                "Mark Zuckerberg",
                                "Jeff Bezos",
                                "Elon Musk"
                        )      ,1
                ),
                new Question(
                        "En quelle année s'est terminé la Seconde Guerre mondiale ?",
                        Arrays.asList(
                                "1947",
                                "1944",
                                "1945",
                                "1939"
                        ),2
                ),
                new Question(
                        "De combien de pays est composé l'Union Européenne ?",
                        Arrays.asList(
                                "27",
                                "28",
                                "31",
                                "21"
                        ), 0
                ),
                new Question(
                        "Pendant combien d'années est élu un président en France ?",
                        Arrays.asList(
                                "5 ans",
                                "7 ans",
                                "4 ans",
                                "3 ans"
                        ), 0
                ),
                new Question(
                        "Combien de livres Harry Potter, écris par J.K. Rowling, sont sortis ?",
                        Arrays.asList(
                                "9",
                                "8",
                                "10",
                                "7"
                        ),1
                ),
                new Question(
                        "Qui est le créateur du manga One Piece ?",
                        Arrays.asList(
                                "TOEI Animation",
                                "Eiichirō Oda",
                                "Masashi Kishimoto",
                                "Tite Kubo"
                        ), 1
                ),
                new Question(
                        "Quel est l'élément chimique dont le symbole est 'O' ?",
                        Arrays.asList(
                                "Or",
                                "Osmiul",
                                "Oxygène",
                                "Iode"
                        ), 2
                ),
                new Question(
                        "Quelle est la plus grande planète du système solaire ?",
                        Arrays.asList(
                                "Mars",
                                "Terre",
                                "Saturne",
                                "Jupiter"
                        ), 3
                ),
                new Question(
                        "Dans quelle ville se trouve la Tour Eiffel ?",
                        Arrays.asList(
                                "Londres",
                                "Paris",
                                "Rome",
                                "Berlin"
                        ), 1
                ),
                new Question(
                        "Quel est le plus long fleuve du monde ?",
                        Arrays.asList(
                                "Nil",
                                "Amazone",
                                "Mississippi",
                                "Yangtsé"
                        ), 0


                ),
                new Question(
                        "Quelle est le titre francais de One Piece ?",
                        Arrays.asList(
                                "Un Morceau",
                                "Une pièce",
                                "La chasse au trésor",
                                "A la recherche du trésor"
                        ), 1
                ),
                new Question(
                        "Combien de chromosome l'homme possède t'il ?",
                        Arrays.asList(
                                "24",
                                "32",
                                "46",
                                "72"
                        ), 2
                ),
                new Question(
                        "Quelle rivière d'Europe de l'Est prend sa source en Ukraine et fait office de fontiére moldo-roumaine ?",
                        Arrays.asList(
                                "La Crote",
                                "La Prout",
                                "La Pisse",
                                "La Crasse"
                        ), 1
                ),
                new Question(
                        "Quel est l'élément chimique symbolisé par \"Fe\"",
                        Arrays.asList(
                                "Fluor",
                                "Sodium",
                                "Fer",
                                "Argent"
                        ), 2
                ),
                new Question(//15
                        "Quel est le nom de l'île principale du Japon qui contient notamment Tokyo et Hiroshima ",
                        Arrays.asList(
                                "Honshū",
                                "Hokkaidō",
                                "Okinawa",
                                "Shikoku"
                        ), 0
                ),
                new Question(
                        "Qui est l'auteur mystérieux des 'Chroniques de Bridgerton' sur la haute société de Londres ?",
                        Arrays.asList(
                                "Lady Danbury",
                                "Eloise Bridgerton",
                                "Daphné Bridgerton",
                                "Penelope Featherington"
                        ), 3
                ),
                new Question(
                        "Dans le brouillard, sous quel état se trouve l'eau ?",
                        Arrays.asList(
                                "Solide",
                                "Gazeux",
                                "Liquide",
                                "Glace"
                        ), 2
                ),
                new Question(
                        "Combien fait DLXXVIII en nombre arabe ?",
                        Arrays.asList(
                                "578",
                                "1078",
                                "1528",
                                "10528"
                        ), 0
                ),
                new Question(
                        "A quel âge la chanteuse Ado a fait ses débuts ?",
                        Arrays.asList(
                                "20 ans",
                                "15 ans",
                                "23 ans",
                                "17 ans"
                        ), 3
                ),
                new Question(
                        "Qui est l'auteur de la chanson J-pop: Monster ?",
                        Arrays.asList(
                                "Yama",
                                "Reol",
                                "Ado",
                                "Yoasobi"
                        ), 1
                )






        );
    }



    private static QuestionList instance;
    public static QuestionList getInstance(){
        if (instance == null){
            instance = new QuestionList();
        }
        return instance;
    }

}
