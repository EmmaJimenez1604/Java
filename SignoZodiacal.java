//Para hacer un zodiaco más personalidad agregue más información debida de los zodaicos

import java.util.Scanner;

/**
 * Escribe un programa en Java llamado SignoZodiacal.java que solicite el día y mes de nacimiento de una persona e imprima en pantalla el signo del zodiaco 
 * al que pertenece así como su símbolo y elemento.
 *
 * @author JiménezSánchez Emma Alicia.
 * 
 * 
 * EXPLICACIÓN DEL CÓDIGO
 * En este código agregue más de lo que pedían acerca del zódico, donde te da más información acerca de tu signo, virtudes, defectos y las relaciones amorosas.
 * Pero este código consiste en un swicth, donde los casos son los meses, los cuales son 12, por ende tendremos 12 casos, y estos casos estan divididos
 * en días, los cuales unos vana ser un signo y otro van a ser otros signos, depende del día que ingrese el usuario. Si el usuario quiere ingresar datos inválidos
 * le va aparecer "Los astros no pueden ver tan lejos".
 * 
 * Una disculpa si es mucho texto, pero quería dar más información aparte del nombre del signo zodiacal y su elemento.
 */

public class SignoZodiacal {
        public static void main(String[] args) {
                Scanner lector = new Scanner(System.in);
                System.out.println("Bienvenido al zodiaco");
                System.out.println("1-Enero\n2-Febrero\n3-Marzo\n4-Abril\n5-Mayo\n6-Junio");
                System.out.println("7-Julio\n8-Agosto\n9-Septiembre\n10-Octubre\n11-Noviembre\n12-Diciembre");
                System.out.println("Introduce el número del mes en el que naciste:");
                int mes = lector.nextInt();
                System.out.println("Introduce el número del día en el que naciste:");
                int dia = lector.nextInt();
                switch (mes) {
                        case 1:
                                if (1 <= dia && dia <= 21) {
                                        System.out.println("\nERES UN CAPRICORNIO\n");
                                        System.out.println("Naciste en ENERO");
                                        System.out.println(
                                                        "Eres un: Capricornio; chivo con cola de pescado, te representa el elemento de la tierra.\nEs un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible."
                                                                        +
                                                                        "\nSe caracteriza por ser prudente y práctico en todos los asuntos que le conciernen."
                                                                        +
                                                                        "\nDefectos: el pesimismo, la fijeza y la melancolía.");
                                        System.out.println(
                                                        "En general, son personas trabajadoras, responsables y dispuestas a persistir lo que haga falta para conseguir su objetivo");
                                        System.out.println(
                                                        "Además son muy fiables y cuentan con unas elevadas dosis de paciencia y resistencia para avanzar hacia sus objetivos"
                                                                        +
                                                                        "\nCuando se trata de amor, a veces le cuestan las relaciones, sobre todo con el sexo opuesto; necesita mucha dedicación.");
                                        System.out
                                                        .println("Aunque una vez que se enamoran, suelen ser personas muy fieles y algo celosas.");
                                } else if (22 <= dia && dia <= 31) {
                                        System.out.println("\nERES UN ACUARIO\n");
                                        System.out.println("Naciste en ENERO");
                                        System.out.println(
                                                        "Eres un: acuario;el glifo representa las olas del agua, te representa el elemento del aire.\nEs el signo con mayor capacidad para la invención de toda la rueda zodiacal."
                                                                        +
                                                                        "\nEres alguien simpático, original y brillante,es un signo muy humanitario, al mismo tiempo que independiente e intelectual"
                                                                        +
                                                                        "\nDefectos:nestabilidad e imprecisión y en su tendencia a llevar la contraria casi por sistema.");
                                        System.out.println(
                                                        "Generalmente Acuario necesita moverse con libertad, sin condicionantes ni ataduras; la posesión no entra dentro de su modo de ver la vida, además, es un signo caracterizado por su desapego.");
                                        System.out.println(
                                                        "Amantes de todo lo original, tienen montones de ideas nuevas agolpadas en sus mentes, lo que pasa es que cuando van a poner en marcha una de ellas, sale otra, y cuando van a poner esa en marcha, sale otra, y otra son pura creatividad.");
                                        System.out.println(
                                                        "\nEn el amor, la intimidad no es su punto fuerte; los pertenecientes a este signo suelen sentirse demasiado vulnerables y poco cómodos cuando no se sienten seguros.");

                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 2:
                                if (1 <= dia && dia <= 19) {
                                        System.out.println("\nERES UN ACUARIO\n");
                                        System.out.println("Naciste en FEBRERO");
                                        System.out.println(
                                                        "Eres un: acuario;el glifo representa las olas del agua, te representa el elemento del aire.\nEs el signo con mayor capacidad para la invención de toda la rueda zodiacal."
                                                                        +
                                                                        "\nEres alguien simpático, original y brillante,es un signo muy humanitario, al mismo tiempo que independiente e intelectual"
                                                                        +
                                                                        "\nDefectos:nestabilidad e imprecisión y en su tendencia a llevar la contraria casi por sistema.");
                                        System.out.println(
                                                        "Generalmente Acuario necesita moverse con libertad, sin condicionantes ni ataduras; la posesión no entra dentro de su modo de ver la vida, además, es un signo caracterizado por su desapego.");
                                        System.out.println(
                                                        "Amantes de todo lo original, tienen montones de ideas nuevas agolpadas en sus mentes, lo que pasa es que cuando van a poner en marcha una de ellas, sale otra, y cuando van a poner esa en marcha, sale otra, y otra son pura creatividad.");
                                        System.out.println(
                                                        "\nEn el amor, la intimidad no es su punto fuerte; los pertenecientes a este signo suelen sentirse demasiado vulnerables y poco cómodos cuando no se sienten seguros.");
                                } else if (20 <= dia && dia <= 29) {
                                        System.out.println("E\nRES UN PISCIS\n");
                                        System.out.println("Naciste en FEBRERO");
                                        System.out.println(
                                                        "Eres un: piscis;el glifo representa es el de los pescados, te representa el elemento del agua.\nEs un signo mutable y de agua, también es el último signo del zodiaco, precisamente por eso, es el más rico y complejo de todos."
                                                                        +
                                                                        "\nSensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.\n No le gusta sentirse preso y ni respeta las convenciones, así, por las buenas, aunque tampoco tiende a luchar contra lo establecido, sencillamente, discurre por otro lado."
                                                                        +
                                                                        "\nLos Piscis tienden a vivir de una manera emocional más que racional");
                                        System.out.println(
                                                        "Les cuesta mucho transmitir lo que perciben, no saben expresarlo con palabras sino con acciones");
                                        System.out.println(
                                                        "En el amor, son personas fieles, adaptables y que buscan incansablemente una unión con la mente y el espíritu de su pareja.");

                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 3:
                                if (1 <= dia && dia <= 20) {
                                        System.out.println("\nERES UN PISCIS\n");
                                        System.out.println("Naciste en MARZO");
                                        System.out.println(
                                                        "Eres un: piscis;el glifo representa es el de los pescados, te representa el elemento del agua.\nEs un signo mutable y de agua, también es el último signo del zodiaco, precisamente por eso, es el más rico y complejo de todos."
                                                                        +
                                                                        "\nSensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.\n No le gusta sentirse preso y ni respeta las convenciones, así, por las buenas, aunque tampoco tiende a luchar contra lo establecido, sencillamente, discurre por otro lado."
                                                                        +
                                                                        "\nLos Piscis tienden a vivir de una manera emocional más que racional");
                                        System.out.println(
                                                        "Les cuesta mucho transmitir lo que perciben, no saben expresarlo con palabras sino con acciones");
                                        System.out.println(
                                                        "En el amor, son personas fieles, adaptables y que buscan incansablemente una unión con la mente y el espíritu de su pareja.");

                                } else if (21 <= dia && dia <= 31) {
                                        System.out.println("\nERES UN ARIES\n");
                                        System.out.println("Naciste en MARZO");
                                        System.out.println(
                                                        "Eres un: aries;el glifo representa por el carnero, te representa el elemento del fuego.\nEs el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación."
                                                                        +
                                                                        "\nSe caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas."
                                                                        +
                                                                        "\nLos Aries son de acción rápida y confían en su poder, por eso no pierden el tiempo pensando en problemas, de hecho, su manera de resolverlos es la acción. ");
                                        System.out.println(
                                                        "Defectos: la impulsividad y falta de paciencia, además de arriesgarse demasiado. Tampoco no soportan equivocarse ni el fracaso.");
                                        System.out.println(
                                                        "En el amor, suele ser noble y natural; valora y cuida las amistades que tiene, aunque a veces, meta la pata hiriendo la sensibilidad de quienes tiene cerca");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 4:
                                if (1 <= dia && dia <= 20) {

                                        System.out.println("\nERES UN ARIES\n");
                                        System.out.println("Naciste en ABRIL");
                                        System.out.println(
                                                        "Eres un: aries;el glifo representa por el carnero, te representa el elemento del fuego.\nEs el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación."
                                                                        +
                                                                        "\nSe caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas."
                                                                        +
                                                                        "\nLos Aries son de acción rápida y confían en su poder, por eso no pierden el tiempo pensando en problemas, de hecho, su manera de resolverlos es la acción. ");
                                        System.out.println(
                                                        "Defectos: la impulsividad y falta de paciencia, además de arriesgarse demasiado. Tampoco no soportan equivocarse ni el fracaso.");
                                        System.out.println(
                                                        "En el amor, suele ser noble y natural; valora y cuida las amistades que tiene, aunque a veces, meta la pata hiriendo la sensibilidad de quienes tiene cerca");
                                }

                                else if (21 <= dia && dia <= 30) {
                                        System.out.println("ERES UN TAURO\n");
                                        System.out.println("Naciste en ABRIL");
                                        System.out.println(
                                                        "Eres un: tauro;el glifo representa por el toro, te representa el elemento de la tierra.\nLa proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos."
                                                                        +
                                                                        "\nTambién adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas."
                                                                        +
                                                                        "\nUn Tauro es un ser decidido, pragmático y tiene una enorme fuerza de voluntad.");
                                        System.out.println(
                                                        "Tiende a las ideas conservadoras, y como le gusta tanto la estabilidad,\nSus ideas son fijas no hay manera de convencer a un Tauro de algo que vaya en contra de sus principios o de lo que piensa y siente\nSu terquedad es otra de sus características más evidente.");
                                        System.out.println(
                                                        "Son personas sensuales que idolatran la belleza, la fidelidad y el cuidado; no obstante, el punto negativo es que tienden a la posesión.");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 5:
                                if (1 <= dia && dia <= 21) {
                                        System.out.println("ERES UN TAURO\n");
                                        System.out.println("Naciste en MAYO");
                                        System.out.println(
                                                        "Eres un: tauro;el glifo representa por el toro, te representa el elemento de la tierra.\nLa proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos."
                                                                        +
                                                                        "\nTambién adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas."
                                                                        +
                                                                        "\nUn Tauro es un ser decidido, pragmático y tiene una enorme fuerza de voluntad.");
                                        System.out.println(
                                                        "Tiende a las ideas conservadoras, y como le gusta tanto la estabilidad,\nSus ideas son fijas no hay manera de convencer a un Tauro de algo que vaya en contra de sus principios o de lo que piensa y siente\nSu terquedad es otra de sus características más evidente.");
                                        System.out.println(
                                                        "Son personas sensuales que idolatran la belleza, la fidelidad y el cuidado; no obstante, el punto negativo es que tienden a la posesión.");
                                } else if (22 <= dia && dia <= 31) {
                                        System.out.println("ERES UN GEMENIS\n");
                                        System.out.println("Naciste en MAYO");
                                        System.out.println(
                                                        "Eres un: gemenis;el glifo representa por los gemelos, te representa el elemento del aire.\nsu carácter es doble y bastante contradictorio por complejo."
                                                                        +
                                                                        "\nPor una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita.Su distintivo común es la comunicación y el ingenio. "
                                                                        +
                                                                        "\nson personas inquietas que empiezan nuevos proyectos y retos con mucho entusiasmo, aunque con demasiada frecuencia les falta la constancia necesaria para realizarlos.");
                                        System.out.println(
                                                        "Tienden a pensar en la vida como un juego y buscan la diversión y aventura en todo lo que hacen; tienen el egoísmo y la imaginación propia de la infancia.\nTambién tienen fuerza y vitalidad\n Además son seres inteligentes, con facultad de expresarse de modo eficaz para deleitar, conmover o persuadir (según convenga) a quienes prestan oídos a sus palabras.");
                                        System.out.println(
                                                        "En el plano sentimental se mueven como pez en el agua y vuelven a demostrar su doble naturaleza");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 6:
                                if (1 <= dia && dia <= 23) {
                                        System.out.println("ERES UN GEMENIS\n");
                                        System.out.println("Naciste en JUNIO");
                                        System.out.println(
                                                        "Eres un: gemenis;el glifo representa por los gemelos, te representa el elemento del aire.\nSu carácter es doble y bastante contradictorio por complejo."
                                                                        +
                                                                        "\nPor una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita.Su distintivo común es la comunicación y el ingenio. "
                                                                        +
                                                                        "\nson personas inquietas que empiezan nuevos proyectos y retos con mucho entusiasmo, aunque con demasiada frecuencia les falta la constancia necesaria para realizarlos.");
                                        System.out.println(
                                                        "Tienden a pensar en la vida como un juego y buscan la diversión y aventura en todo lo que hacen; tienen el egoísmo y la imaginación propia de la infancia.\nTambién tienen fuerza y vitalidad\n Además son seres inteligentes, con facultad de expresarse de modo eficaz para deleitar, conmover o persuadir (según convenga) a quienes prestan oídos a sus palabras.");
                                        System.out.println(
                                                        "En el plano sentimental se mueven como pez en el agua y vuelven a demostrar su doble naturaleza");
                                } else if (24 <= dia && dia <= 30) {
                                        System.out.println("ERES UN CANCER\n");
                                        System.out.println("Naciste en JUNIO");
                                        System.out.println(
                                                        "Eres un: cancer;el glifo representa al cangrejo, te representa el elemento del agua.\n"
                                                                        +
                                                                        "\nDe los signos zodiacales, su carácter es el menos claro; puede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás."
                                                                        +
                                                                        "\nA veces es demasiado soñador, por eso equivoca el mundo real con la utopía que ha construido en su cabeza: el refugio de las fantasías que adora.");
                                        System.out.println(
                                                        "Tienen una memoria extraordinaria y además poseen un talento innato para las artes y las letras notable.\nAdemás son ambiciosos y pueden cambiar sin dificultad de profesión, de amistades, etc.");
                                        System.out.println(
                                                        "Cuando se trata de amor, en sus relaciones Cáncer es también una mezcla de contradicción; si mantiene una relación estable, ama de verdad, sinceramente,");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 7:
                                if (1 <= dia && dia <= 23) {
                                        System.out.println("ERES UN CANCER\n");
                                        System.out.println("Naciste en JULIO");
                                        System.out.println(
                                                        "Eres un: cancer;el glifo representa al cangrejo, te representa el elemento del agua.\n"
                                                                        +
                                                                        "\nDe los signos zodiacales, su carácter es el menos claro; puede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás."
                                                                        +
                                                                        "\nA veces es demasiado soñador, por eso equivoca el mundo real con la utopía que ha construido en su cabeza: el refugio de las fantasías que adora.");
                                        System.out.println(
                                                        "Tienen una memoria extraordinaria y además poseen un talento innato para las artes y las letras notable.\nAdemás son ambiciosos y pueden cambiar sin dificultad de profesión, de amistades, etc.");
                                        System.out.println(
                                                        "Cuando se trata de amor, en sus relaciones Cáncer es también una mezcla de contradicción; si mantiene una relación estable, ama de verdad, sinceramente,");
                                }
                                else if (24<= dia && dia <= 31) {
                                        System.out.println("ERES UN LEO\n");
                                        System.out.println("Naciste en JULIO");
                                        System.out.println(
                                                        "Eres un: leo ;el glifo representa el león, te representa el elemento del fuego.\nEl signo más dominante del zodíaco."
                                                                        +
                                                                        "\nCreativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo. "
                                                                        +
                                                                        "\nDefectos:vanidad, egocentrismo, arrogancia, impostura y un genio de mil demonios, entre otros defectos.                                                                        ");
                                        System.out.println(
                                                        "Los Leones son entusiastas, creativos y muchas veces comprensivos con las circunstancias de los demás; adoran los lujos y la aventura; correr riesgos les motiva. ");
                                        System.out.println(
                                                        "Leo es romántico, algo caprichoso, poco fiel y prisionero de la belleza. Además, no le falta sinceridad, por lo menos mientras dura el amor, no más. ");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 8:
                        if (1<= dia && dia <= 22) {
                                System.out.println("ERES UN LEO\n");
                                System.out.println("Naciste en AGOSTO");
                                System.out.println(
                                                "Eres un: leo ;el glifo representa el león, te representa el elemento del fuego.\nEl signo más dominante del zodíaco."
                                                                +
                                                                "\nCreativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo. "
                                                                +
                                                                "\nDefectos:vanidad, egocentrismo, arrogancia, impostura y un genio de mil demonios, entre otros defectos.                                                                        ");
                                System.out.println(
                                                "Los Leones son entusiastas, creativos y muchas veces comprensivos con las circunstancias de los demás; adoran los lujos y la aventura; correr riesgos les motiva. ");
                                System.out.println(
                                                "Leo es romántico, algo caprichoso, poco fiel y prisionero de la belleza. Además, no le falta sinceridad, por lo menos mientras dura el amor, no más. ");
                        }
                        else if (23<= dia && dia <= 31) {
                                System.out.println("ERES UN VIRGO\n");
                                System.out.println("Naciste en AGOSTO");
                                System.out.println(
                                                "Eres un: virgo ;el glifo representa a una virgen, te representa el elemento de la tierra.\nEs un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo."
                                                                +
                                                                "\nEes lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa."
                                                                +
                                                                "\nSu sentido de la responsabilidad está muy desarrollado, por eso odia la improvisación y la frivolidad, además, para desarrollarse plenamente necesita sentirse seguro.");
                                System.out.println(
                                                "Los Virgo son amigos de sus amigos; si necesitas su ayuda, pídesela y hará todo lo que esté en sus manos por ayudarte.");
                                System.out.println(
                                                "En el amor, Virgo es una persona cariñosa, entregada y fiel.");
                        }
                        else{System.out.println("Los astros no pueden ver tan lejos");}
                        break;
                        case 9:
                        if (1<= dia && dia <= 22) {
                                System.out.println("ERES UN VIRGO\n");
                                System.out.println("Naciste en SEPTIEMBRE");
                                System.out.println(
                                                "Eres un: virgo ;el glifo representa a una virgen, te representa el elemento de la tierra.\nEs un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo."
                                                                +
                                                                "\nEes lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa."
                                                                +
                                                                "\nSu sentido de la responsabilidad está muy desarrollado, por eso odia la improvisación y la frivolidad, además, para desarrollarse plenamente necesita sentirse seguro.");
                                System.out.println(
                                                "Los Virgo son amigos de sus amigos; si necesitas su ayuda, pídesela y hará todo lo que esté en sus manos por ayudarte.");
                                System.out.println(
                                                "En el amor, Virgo es una persona cariñosa, entregada y fiel.");
                        }
                        else if (23<= dia && dia <= 30) {
                                System.out.println("ERES UN LIBRA\n");
                                System.out.println("Naciste en SEPTIEMBRE");
                                System.out.println(
                                                "Eres un: virgo ;el glifo representa de la balanza, te representa el elemento de la aire.\nSe encuentra además entre los signos más refinados del zodíaco"
                                                                +
                                                                "\nTiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos.\nSus puntos negativos a veces son la frivolidad y un carácter voluble."
                                                                +
                                                                "\nLibra son personas que presentan un sentido de la ecuanimidad y la tolerancia muy desarrollado; comprenden las posturas de los demás y al mismo tiempo procuran dirimir las diferencias.");
                                System.out.println(
                                                "En general, no les gusta la rutina, sobre todo en su trabajo; además tienen una fina sensibilidad artística que pueden llegar a canalizar profesionalmente.");
                                System.out.println(
                                                "Cuando se trata de amor, el romanticismo es una constante en su unión, también la búsqueda de la belleza (tanto física como interna o espiritual) y su tendencia al hedonismo");
                        }
                        else{System.out.println("Los astros no pueden ver tan lejos");}
                        break;
                        case 10:
                        if (1<= dia && dia <= 23) {
                                System.out.println("ERES UN LIBRA\n");
                                System.out.println("Naciste en OCTUBRE");
                                System.out.println(
                                                "Eres un: virgo ;el glifo representa de la balanza, te representa el elemento de la aire.\nSe encuentra además entre los signos más refinados del zodíaco"
                                                                +
                                                                "\nTiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos.\nSus puntos negativos a veces son la frivolidad y un carácter voluble."
                                                                +
                                                                "\nLibra son personas que presentan un sentido de la ecuanimidad y la tolerancia muy desarrollado; comprenden las posturas de los demás y al mismo tiempo procuran dirimir las diferencias.");
                                System.out.println(
                                                "En general, no les gusta la rutina, sobre todo en su trabajo; además tienen una fina sensibilidad artística que pueden llegar a canalizar profesionalmente.");
                                System.out.println(
                                                "Cuando se trata de amor, el romanticismo es una constante en su unión, también la búsqueda de la belleza (tanto física como interna o espiritual) y su tendencia al hedonismo");
                        }
                        else if (24 <= dia && dia <= 31) {
                                System.out.println("\nERES UN ESCORPIO\n");
                                System.out.println("Naciste en OCTUBRE");
                                System.out.println(
                                                "Eres un: Escorpio;su glifo es el de un escorpion, te representa el elemento de la agua.\nSu potencia y energía emocional son únicas en todo el zodíaco."+"\nTiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza\nEs muy sensible y emocional consigo mismo y con el entorno."+    "\n Escorpio tiende a ir a la raíz, a lo esencial y a lo que pertenece al mundo inconsciente.");
                                System.out.println(
                                                "Además, Escorpio desea ejercer el control, acumulando poder; suele tener una profunda inteligencia fruto de su poder de concentración. ");
                                System.out.println(
                                                "No soporta la deslealtad y tampoco perdona una ofensa; es más, seguramente busque venganza... y es muy mal enemigo, así que cuidadito con hacerle daño.");
                                System.out
                                                .println("Las Escorpio son personas muy sensuales y apasionadas; para ellas el acto del amor es algo espiritual: sienten emociones a las que otros signos ni se pueden acercar.");
                        }
                        else{System.out.println("Los astros no pueden ver tan lejos");}
                        break;
                        case 11:
                        if (1 <= dia && dia <= 22) {
                                System.out.println("\nERES UN ESCORPIO\n");
                                System.out.println("Naciste en NOVIEMBRE");
                                System.out.println(
                                                "Eres un: Escorpio;su glifo es el de un escorpion, te representa el elemento de la agua.\nSu potencia y energía emocional son únicas en todo el zodíaco."+"\nTiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza\nEs muy sensible y emocional consigo mismo y con el entorno."    +"\n Escorpio tiende a ir a la raíz, a lo esencial y a lo que pertenece al mundo inconsciente.");
                                System.out.println(
                                                "Además, Escorpio desea ejercer el control, acumulando poder; suele tener una profunda inteligencia fruto de su poder de concentración. ");
                                System.out.println(
                                                "No soporta la deslealtad y tampoco perdona una ofensa; es más, seguramente busque venganza... y es muy mal enemigo, así que cuidadito con hacerle daño.");
                                System.out
                                                .println("Las Escorpio son personas muy sensuales y apasionadas; para ellas el acto del amor es algo espiritual: sienten emociones a las que otros signos ni se pueden acercar.");
                        }else if (23 <= dia && dia <= 30) {
                                System.out.println("\nERES UN SAGITARIO\n");
                                System.out.println("Naciste en NOVIEMBRE");
                                System.out.println(
                                                "Eres un: Sagitario;su glifo es el arquero, te representa el elemento de la fuego.\nEs uno de los signos más resplandecientes y positivos del zodíaco."
                                                                +
                                                                "\nEs versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad; además, frecuentemente la suerte le acompaña."
                                                                +
                                                                "\nson personas a quienes les encanta empezar nuevos proyectos y aprender constantemente cosas nuevas.");
                                System.out.println(
                                                "Son intuitivas, buenas organizadoras, generosas (pero sin malgastar) y muy cuidadosas, lo que las convierte en buenas gestoras de situaciones y proyectos.");
                                System.out.println(
                                                "El signo de Sagitario desarrolla unos ideales y principios que son las pautas que constituyen su forma de caminar por el mundo");
                                System.out
                                                .println("En el amor, Sagitario valora la libertad y la independencia por encima de todas las cosas");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}
                                break;
                        case 12:
                                // Falta hacer sagitario
                                if (1 <= dia && dia <= 21) {
                                        System.out.println("\nERES UN SAGITARIO\n");
                                        System.out.println("Naciste en DICIEMBRE");
                                        System.out.println(
                                                        "Eres un: Sagitario;su glifo es el arquero, te representa el elemento de la fuego.\nEs uno de los signos más resplandecientes y positivos del zodíaco."
                                                                        +
                                                                        "\nEs versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad; además, frecuentemente la suerte le acompaña."
                                                                        +
                                                                        "\nson personas a quienes les encanta empezar nuevos proyectos y aprender constantemente cosas nuevas.");
                                        System.out.println(
                                                        "Son intuitivas, buenas organizadoras, generosas (pero sin malgastar) y muy cuidadosas, lo que las convierte en buenas gestoras de situaciones y proyectos.");
                                        System.out.println(
                                                        "El signo de Sagitario desarrolla unos ideales y principios que son las pautas que constituyen su forma de caminar por el mundo");
                                        System.out
                                                        .println("En el amor, Sagitario valora la libertad y la independencia por encima de todas las cosas");
                                } else if (22 <= dia && dia <= 31) {
                                        System.out.println("\nERES UN CAPRICORNIO\n");
                                        System.out.println("Naciste en DICIEMBRE");
                                        System.out.println(
                                                        "Eres un: Capricornio; chivo con cola de pescado, te representa el elemento de la tierra.\nEs un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible."
                                                                        +
                                                                        "\nSe caracteriza por ser prudente y práctico en todos los asuntos que le conciernen."
                                                                        +
                                                                        "\nDefectos: el pesimismo, la fijeza y la melancolía.");
                                        System.out.println(
                                                        "En general, son personas trabajadoras, responsables y dispuestas a persistir lo que haga falta para conseguir su objetivo");
                                        System.out.println(
                                                        "Además son muy fiables y cuentan con unas elevadas dosis de paciencia y resistencia para avanzar hacia sus objetivos"
                                                                        +
                                                                        "\nCuando se trata de amor, a veces le cuestan las relaciones, sobre todo con el sexo opuesto; necesita mucha dedicación.");
                                        System.out.println(
                                                        "Aunque una vez que se enamoran, suelen ser personas muy fieles y algo celosa");
                                }
                                else{System.out.println("Los astros no pueden ver tan lejos");}

                                break;
                        default:
                                System.out.println("Los astros no pueden ver tan lejos");
                                break;

                }
                lector.close();
        }
}
