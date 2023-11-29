package com.badlogic.jurassic;

import java.util.ArrayList;

public class CriaQuiz {

    public static Quiz criarQuiz() {
        Quiz quiz = new Quiz();

        quiz.addQuestion(criarPergunta("Qual era um dos maiores dinossauros carnivoros?", 1, criarOpcoes("Velociraptor", "Tiranossauro Rex", "Spinosaurus", "Allosaurus"), 2, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro era conhecido por suas garras enormes?", 1, criarOpcoes("Stegosaurus", "Deinonychus", "Triceratops", "Ankylosaurus"), 2, false));
        quiz.addQuestion(criarPergunta("Em que continente os primeiros fosseis de dinossauros foram descobertos?", 1, criarOpcoes("Africa", "America do Sul", "Europa", "Asia"), 2, false));
        quiz.addQuestion(criarPergunta("Qual era o dinossauro mais rapido conhecido?", 1, criarOpcoes("Velociraptor", "Gallimimus", "Tiranossauro Rex", "Spinosaurus"), 2, false));
        quiz.addQuestion(criarPergunta("O que significa a palavra 'dinossauro' em grego?", 1, criarOpcoes("Monstro antigo", "Reptil gigante", "Passaro antigo", "Fera pre-historica"), 3, false));
        quiz.addQuestion(criarPergunta("Qual era o dinossauro mais rapido conhecido?", 1, criarOpcoes("Velociraptor", "Gallimimus", "Tiranossauro Rex", "Spinosaurus"), 2, false));
        quiz.addQuestion(criarPergunta("O que significa a palavra 'dinossauro' em grego?", 1, criarOpcoes("Monstro antigo", "Reptil gigante", "Passaro antigo", "Fera pre-historica"), 3, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha um pescoco longo e se alimentava de plantas?", 1, criarOpcoes("Velociraptor", "Tiranossauro Rex", "Brachiosaurus", "Triceratops"), 3, false));
        quiz.addQuestion(criarPergunta("Quantos dedos tinham os dinossauros carnivoros, como o Tiranossauro Rex?", 1, criarOpcoes("Tres", "Quatro", "Cinco", "Seis"), 2, false));
        quiz.addQuestion(criarPergunta("Qual e o nome do grupo de dinossauros que inclui o Tiranossauro Rex?", 1, criarOpcoes("Saurischia", "Ornithischia", "Theropoda", "Sauropoda"), 3, false));
        quiz.addQuestion(criarPergunta("Qual foi o primeiro dinossauro a ser descrito cientificamente?", 1, criarOpcoes("Triceratops", "Stegosaurus", "Megalosaurus", "Brachiosaurus"), 3, false));
        quiz.addQuestion(criarPergunta("Os dinossauros sao mais relacionados a quais animais modernos?", 1, criarOpcoes("Tubaroes", "Crocodilos", "Aves", "Sapos"), 3, false));

        quiz.addQuestion(criarPergunta("Qual dinossauro foi descoberto na Antartica?", 2, criarOpcoes("Brachiosaurus", "Allosaurus", "Carnotaurus", "Spinosaurus"), 3, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha um cranio com uma cupula oca?", 2, criarOpcoes("Stegosaurus", "Pachycephalosaurus", "Triceratops", "Parasaurolophus"), 2, false));
        quiz.addQuestion(criarPergunta("Em que periodo geologico os dinossauros se diversificaram mais?", 2, criarOpcoes("Jurassico", "Cretaceo", "Triassico", "Permiano"), 2, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha espinhos ao longo de sua coluna?", 2, criarOpcoes("Stegosaurus", "Ankylosaurus", "Triceratops", "Brachiosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Quais dinossauros eram conhecidos por formar grandes manadas?", 2, criarOpcoes("Velociraptor", "Deinonychus", "Hadrosaurs", "Ceratopsians"), 3, false));
        quiz.addQuestion(criarPergunta("Qual foi o maior dinossauro herbivoro?", 2, criarOpcoes("Apatosaurus", "Brachiosaurus", "Triceratops", "Stegosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Qual e o nome do grupo de dinossauros que inclui o Velociraptor?", 2, criarOpcoes("Saurischia", "Ornithischia", "Theropoda", "Sauropoda"), 3, false));
        quiz.addQuestion(criarPergunta("O que caracteriza um dinossauro como sendo do grupo 'teropode'?", 2, criarOpcoes("Carnivoro e bipede", "Herbivoro e quadrupede", "Com penas", "Marinho"), 1, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha uma crista em forma de leque em sua cauda?", 2, criarOpcoes("Parasaurolophus", "Stegosaurus", "Triceratops", "Brachiosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro foi um dos ultimos a existir antes da extincao em massa?", 2, criarOpcoes("Tyrannosaurus Rex", "Triceratops", "Velociraptor", "Ankylosaurus"), 2, false));

        quiz.addQuestion(criarPergunta("Qual dinossauro tinha penas e asas, mas nao conseguia voar?", 3, criarOpcoes("Archaeopteryx", "Microraptor", "Velociraptor", "Deinonychus"), 1, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha um cranio alongado e dentes afiados, semelhante a um crocodilo?", 3, criarOpcoes("Spinosaurus", "Carcharodontosaurus", "Suchomimus", "Baryonyx"), 1, false));
        quiz.addQuestion(criarPergunta("Quais foram os primeiros dinossauros que surgiram durante o periodo Triassico?", 3, criarOpcoes("Sauropods", "Theropods", "Ceratopsians", "Stegosaurs"), 2, false));
        quiz.addQuestion(criarPergunta("Qual foi o maior dinossauro carnivoro conhecido?", 3, criarOpcoes("Spinosaurus", "Tyrannosaurus Rex", "Carcharodontosaurus", "Giganotosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Quais dinossauros eram considerados sauropodes de pescoco longo?", 3, criarOpcoes("Brachiosaurus", "Apatosaurus", "Diplodocus", "Allosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Quem foi o paleontologo que descobriu o primeiro esqueleto completo de um Tiranossauro Rex?", 3, criarOpcoes("Robert Bakker", "Jack Horner", "Sue Hendrickson", "Barnum Brown"), 3, false));
        quiz.addQuestion(criarPergunta("Qual dinossauro tinha uma crista oca em forma de tubo no topo da cabeca?", 3, criarOpcoes("Parasaurolophus", "Corythosaurus", "Edmontosaurus", "Hadrosaurus"), 1, false));
        quiz.addQuestion(criarPergunta("Quais foram os ultimos dinossauros a desaparecer durante a extincao em massa?", 3, criarOpcoes("Tyrannosaurus Rex", "Triceratops", "Velociraptor", "Ankylosaurus"), 2, false));
        quiz.addQuestion(criarPergunta("O que caracteriza um dinossauro como sendo do grupo 'ceratopsiano'?", 3, criarOpcoes("Crista oca na cabeca", "Bico parecido com papagaio", "Chifres e franges", "Dentes afiados"), 3, false));
        quiz.addQuestion(criarPergunta("Qual foi o primeiro dinossauro a ser identificado na Antartica?", 3, criarOpcoes("Cryolophosaurus", "Antarctopelta", "Glacialisaurus", "Camarasaurus"), 1, false));

        return quiz;
    }

    private static Pergunta criarPergunta(String enunciado, int dificuldade, ArrayList<String> opcoes, int resposta, boolean respondida){
        return new Pergunta(enunciado, dificuldade, opcoes, resposta, respondida);
    }

    private static ArrayList<String> criarOpcoes(String opcao1, String opcao2, String opcao3, String opcao4) {
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("1) " + opcao1);
        opcoes.add("2) " + opcao2);
        opcoes.add("3) " + opcao3);
        opcoes.add("4) " + opcao4);
        return opcoes;
    }
}
