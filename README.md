# Übung 1: Triangulate
 
Es wird ein einfacher Service zur **Umwandlung der deutschen in die
englische Uhrzeit** realisiert.
 
Folgende Anforderungen sind zu berücksichtigen: 
 
1. In England ist es eine Stunde früher als in Deutschland.
2. In Deutschland wird das 24-Stunden (0-23), in England das 12-Stunden
   (0-11) Format verwendet. 
3. Es muss der Tagesüberlauf (zwischen 0 und 1 Uhr) berücksichtigt
   werden.
 
Technische Vorgaben: Der Systemarchitekt hat entschieden für den Service
keine Standard-Zeitbibliotheken (Yoda oder ähnliches) einzusetzen. Der
ür die Zeitumwandlung liefern.

## Aufgabe 1
Sorge dafür, dass der Testfall 

`TimeConversionServiceTest#test_5oClockInGermany_ShouldBe4oClockInBritain` 

erfolgreich durchläuft. 

Schreibe zunächst so wenig Code wie möglich um die Assertion zu
erfüllen.

## Aufgabe 2

Definiere ein Beispiel, dass die 2. Anforderung erfüllt. Implementiere
anschließend den erforderlichen Business Code. 
 
Anmerkung: `PrimitiveTime` darf für Englisch nur Werte zwischen 0 und 11
annehmen.

## Aufgabe 3

Definiere ein Beispiel, dass die 3. Anforderung erfüllt. Implementiere 
anschließend den erforderlichen Business Code.

Anmerkung: für den Anwender ist der aktuelle Tag irrelevant.