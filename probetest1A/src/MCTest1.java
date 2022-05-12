// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest1 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest1 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf die unterschiedlichen Arten\n" +
                        "linearer und assoziativer Datenstrukturen?",

                        new Choice(false, "Assoziativer Datenstrukturen können bei Bedarf größer werden.             (1A)"),
                        new Choice(false, "Die Methodennamen  push  und  pop  weisen auf FIFO-Verhalten hin.         (1B)"),
                        new Choice(false, "put(k,v)  gibt den alten Wert zurück wenn k schon existiert.              (1C)"),
                        new Choice(false, "Assoziative Datenstrukturen verwenden Schlüssel zur Adressierung.         (1D)"),
                        new Choice(false, "Einträge in Queues sind nach Schlüsseln sortiert.                         (1E)")
                ),

                new Question(
                        "r sei eine Variable mit einem leeren Stack ganzer Zahlen.\n" +
                        "Nach welchen der folgenden Aufruf-Sequenzen liefert  r.peek()  die Zahl  0  als Ergebnis?",

                        new Choice(false, "r.push(7); r.push(r.peek()); r.push(0);                                   (2A)"),
                        new Choice(false, "r.push(0); r.push(7); r.push(8);                                          (2B)"),
                        new Choice(false, "r.push(7); r.push(0); r.push(r.pop());                                    (2C)"),
                        new Choice(false, "r.push(7); r.push(8); r.push(0);                                          (2D)"),
                        new Choice(false, "r.push(7); r.push(r.pop()); r.push(0);                                    (2E)")
                ),

                new Question(
                        "H sei ein Referenztyp (Klasse oder Interface), und\n" +
                        "b sei eine Variable eines Referenztyps mit  b != null.\n" +
                        "Welche der folgenden Aussagen treffen für alle H und b zu?",

                        new Choice(false, "Liefert  (H)b  einen Laufzeitfehler, dann gilt  b instanceof H.           (3A)"),
                        new Choice(false, "Aus  b.getClass() == H.class  folgt:  H ist eine Klasse.                  (3B)"),
                        new Choice(false, "H.class  liefert die interne Repräsentation von H.                        (3C)"),
                        new Choice(false, "Aus  !(b instanceof H)  folgt:  b.getClass() != H.class.                  (3D)"),
                        new Choice(false, "Gilt  b instanceof H,  dann ist H Obertyp des dynamischen Typs von b.     (3E)")
                ),

                new Question(
                        "E und N seien Referenztypen, sodass der Compiler folgenden Programmtext\n" +
                        "fehlerfrei compiliert:  N f = new E();  f.c();\n" +
                        "Welche der folgenden Aussagen treffen für alle passenden E, N, f und c() zu?",

                        new Choice(false, "Es gilt:  f.getClass() == E.class                                         (4A)"),
                        new Choice(false, "Durch  f.c()  wird die Methode in E ausgeführt.                           (4B)"),
                        new Choice(false, "E ist Untertyp von N.                                                     (4C)"),
                        new Choice(false, "E muss eine Klasse sein (kein Interface).                                 (4D)"),
                        new Choice(false, "Kommentare zu c() in E müssen auch auf c() in N zutreffen.                (4E)")
                ),

                new Question(
                        "h sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
                        "und Werte vom Typ String sind (und null sein können).  J und U seien zwei\n" +
                        "voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
                        "folgenden Aufruf-Sequenzen liefert  h.get(J)  den String in  U  als Ergebnis?",

                        new Choice(false, "h.put(J, U); h.put(h.get(U), h.get(J)); h.put(U, J);                      (5A)"),
                        new Choice(false, "h.put(J, U); h.put(U, J); h.put(h.get(J), h.get(U));                      (5B)"),
                        new Choice(false, "h.put(h.get(J), h.get(U)); h.put(J, J); h.put(U, U);                      (5C)"),
                        new Choice(false, "h.put(J, U); h.put(J, J); h.put(U, J);                                    (5D)"),
                        new Choice(false, "h.put(J, J); h.put(U, U); h.put(h.get(U), h.get(J));                      (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. Welche der folgenden Aussagen stimmen in Bezug auf die unterschiedlichen Arten\n" +
            "    linearer und assoziativer Datenstrukturen?\n" +
            "    \n" +
            "    XXXXXXXXX Assoziativer Datenstrukturen können bei Bedarf größer werden.             (1A)\n" +
            "    XXXXXXXXX Die Methodennamen  push  und  pop  weisen auf FIFO-Verhalten hin.         (1B)\n" +
            "    XXXXXXXXX put(k,v)  gibt den alten Wert zurück wenn k schon existiert.              (1C)\n" +
            "    XXXXXXXXX Assoziative Datenstrukturen verwenden Schlüssel zur Adressierung.         (1D)\n" +
            "    XXXXXXXXX Einträge in Queues sind nach Schlüsseln sortiert.                         (1E)\n" +
            "\n" +
            " 2. r sei eine Variable mit einem leeren Stack ganzer Zahlen.\n" +
            "    Nach welchen der folgenden Aufruf-Sequenzen liefert  r.peek()  die Zahl  0  als Ergebnis?\n" +
            "    \n" +
            "    XXXXXXXXX r.push(7); r.push(r.peek()); r.push(0);                                   (2A)\n" +
            "    XXXXXXXXX r.push(0); r.push(7); r.push(8);                                          (2B)\n" +
            "    XXXXXXXXX r.push(7); r.push(0); r.push(r.pop());                                    (2C)\n" +
            "    XXXXXXXXX r.push(7); r.push(8); r.push(0);                                          (2D)\n" +
            "    XXXXXXXXX r.push(7); r.push(r.pop()); r.push(0);                                    (2E)\n" +
            "\n" +
            " 3. H sei ein Referenztyp (Klasse oder Interface), und\n" +
            "    b sei eine Variable eines Referenztyps mit  b != null.\n" +
            "    Welche der folgenden Aussagen treffen für alle H und b zu?\n" +
            "    \n" +
            "    XXXXXXXXX Liefert  (H)b  einen Laufzeitfehler, dann gilt  b instanceof H.           (3A)\n" +
            "    XXXXXXXXX Aus  b.getClass() == H.class  folgt:  H ist eine Klasse.                  (3B)\n" +
            "    XXXXXXXXX H.class  liefert die interne Repräsentation von H.                        (3C)\n" +
            "    XXXXXXXXX Aus  !(b instanceof H)  folgt:  b.getClass() != H.class.                  (3D)\n" +
            "    XXXXXXXXX Gilt  b instanceof H,  dann ist H Obertyp des dynamischen Typs von b.     (3E)\n" +
            "\n" +
            " 4. E und N seien Referenztypen, sodass der Compiler folgenden Programmtext\n" +
            "    fehlerfrei compiliert:  N f = new E();  f.c();\n" +
            "    Welche der folgenden Aussagen treffen für alle passenden E, N, f und c() zu?\n" +
            "    \n" +
            "    XXXXXXXXX Es gilt:  f.getClass() == E.class                                         (4A)\n" +
            "    XXXXXXXXX Durch  f.c()  wird die Methode in E ausgeführt.                           (4B)\n" +
            "    XXXXXXXXX E ist Untertyp von N.                                                     (4C)\n" +
            "    XXXXXXXXX E muss eine Klasse sein (kein Interface).                                 (4D)\n" +
            "    XXXXXXXXX Kommentare zu c() in E müssen auch auf c() in N zutreffen.                (4E)\n" +
            "\n" +
            " 5. h sei eine Variable mit einer leeren assoziativen Datenstruktur, wobei Schlüssel\n" +
            "    und Werte vom Typ String sind (und null sein können).  J und U seien zwei\n" +
            "    voneinander verschiedene String-Konstanten (static final).  Nach welchen der\n" +
            "    folgenden Aufruf-Sequenzen liefert  h.get(J)  den String in  U  als Ergebnis?\n" +
            "    \n" +
            "    XXXXXXXXX h.put(J, U); h.put(h.get(U), h.get(J)); h.put(U, J);                      (5A)\n" +
            "    XXXXXXXXX h.put(J, U); h.put(U, J); h.put(h.get(J), h.get(U));                      (5B)\n" +
            "    XXXXXXXXX h.put(h.get(J), h.get(U)); h.put(J, J); h.put(U, U);                      (5C)\n" +
            "    XXXXXXXXX h.put(J, U); h.put(J, J); h.put(U, J);                                    (5D)\n" +
            "    XXXXXXXXX h.put(J, J); h.put(U, U); h.put(h.get(U), h.get(J));                      (5E)\n" +
            "\n";

    public static final long UID = 33045892308438L;

    private static void checkAndPrint(Question... questions) {
        int i = 1;
        String s = "";
        for (Question question : questions) {
            java.util.Scanner scanner = new java.util.Scanner(question.toString());
            s += String.format("%2d. %s\n", i++, scanner.nextLine());
            while (scanner.hasNextLine()) {
                s += String.format("    %s\n", scanner.nextLine());
            }
            s += "\n";
        }
        String converted = s.replace("Richtig: ", "XXXXXXXXX").replace("Falsch:  ", "XXXXXXXXX");
        if (!converted.replaceAll("[ \t]+", " ").equals(EXPECT.replaceAll("[ \t]+", " "))) {
            i = 0;
            String err = "\n";
            java.util.Scanner e = new java.util.Scanner(EXPECT);
            java.util.Scanner f = new java.util.Scanner(converted);
            while (e.hasNextLine() && f.hasNextLine() && i < 5) {
                String el = e.nextLine(), fl = f.nextLine();
                if (!el.replaceAll("[ \t]+", " ").equals(fl.replaceAll("[ \t]+", " "))) {
                    i++;
                    err += "Statt der Zeile: " + fl + "\nsollte stehen:   " + el + "\n\n";
                }
            }
            if (i >= 5) {
                err = "Das sind die erwarteten Fragen und Antwortmöglichkeiten in 'EXPECT':\n\n" + EXPECT;
            }
            System.out.println("ACHTUNG: Sie haben Programmteile verändert, die nicht geändert werden sollten.\n" +
                    "Beurteilt wird so, als ob diese Programmteile unverändert geblieben wären.\n" +
                    err);
            System.exit(1);
        }
        System.out.print("Die Multiple-Choice-Fragen wurden folgendermaßen beantwortet\n" +
                "(das sind nur Ihre Antworten, keine Aussage über Korrektheit):\n\n" +
                s);
        System.exit(0);
    }

    private static class Question {
        private final String question;
        private final Choice[] choices;

        public Question(String question, Choice... choices) {
            this.question = question;
            this.choices = choices;
        }

        public String toString() {
            String s = question + "\n\n";
            for (Choice choice : choices) {
                s += choice + "\n";
            }
            return s;
        }
    }

    private static class Choice {
        private final String answer;
        private final boolean valid;

        public Choice(boolean valid, String answer) {
            this.answer = answer;
            this.valid = valid;
        }

        public String toString() {
            return (valid ? "Richtig:  " : "Falsch:   ") + answer;
        }
    }
}