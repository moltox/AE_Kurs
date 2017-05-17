### Übung zu ArrayList
1. Allgemeine Aufgabenstellung
> Erstellen Sie ein Programm, welches dem Benutzer die Möglichkeit gibt, Objekte vom Typ __Person__ in einer ArrayList abzulegen und diese Objekte zu manipulieren:
  lesend
  schreibend
  löschen
  hinzufügen

2. Details:
  - Erstellen Sie eine Klasse __Person__ mit den Attributen:
    - String __name__
    - String __vorname__
    - String __geburtsdatum__
    
  - Erzeugen Sie die benötigten Getter / Setter Methoden und 2 Konstruktoren:
    - Parameterlos
    - alle drei Werte der Attribute als Parameter
  - Testen Sie die Klasse **Person** in einer weiteren Klasse *__PersonTest__* (Objekterzeugung und Ausgabe der Daten)
  - Erzeugen Sie in der Klasse *__PersonTest__* eine ArrayList, welche beliebig viele Objekte vom Typ __Person__ aufnehmen kann. Dies soll über eine Methode *hinzufügen()* erfolgen.
  - Erzeugen Sie weitere Methoden um die Objekte in der ArrayList zu suchen / löschen / ändern:
    - __suche()__ (Suchkriterium ist der Nachname)
    - __lösche()__ 
    - __aendern()__
  - Ändern Sie ihr Programm so ab, dass die Methoden in einer eigenen Klasse __PersonMethode__ definiert und verwaltet werden.
  - Passen Sie die Klasse __PersonTest__ entsprechend an
