---
theme: sky
css:
 - css/textalign.css
---


# Blackjack


Udviklingsprojekt, Specialisterne Academy

Johan Kjær Nielsen

25/09/2026


---
# Opgave

Udvikl et blackjack computerspil

Dokumentér processen

---

# Tilgang (I)

Vi starter med at forstå reglerne til Blackjack. Vi vælger som udgangspunkt at ekskludere "betting" aspektet af spillet og spille runde til runde.

Vi bemærker at der er én bunke kort og at systemet selv udfører meget af spillets loop. Det er altså begrænset, hvor meget spilleren egentlig interagerer med systemet.

Med de informationer, kan vi begynde design.

---

# Tilgang (II)
Vi forestiller en os god **objekt-orienteret** tilgang. Valg af programmeringssprog: **Java**

Fordele ved OO og Java:

- Klare rammer for hvad individuelle komponenter skal (type checking)
- God skalerbarhed med brug af **Interfaces**
- God support for unit tests

<small>Man kan altså designe hele spillets struktur, inden man implementerer noget konkret. Man kan dermed teste samtidig med implementering.


---

# Mise en place

Vi identificerer afgrænsede komponenter i systemet.

1. Kort
2. Kortbunke
3. Hånd (hænder)
4. Kort-handler (dealer)
5. Player-input handler
6. Spil-tilstand

---
# 1 Kort 

Ét Kort: $Int[0:51]$

Givet et kort $k$

$Suit = floor(k/13)$ [0:3] ,

hvor {0: hjerter, 1: ruder, 2: spar, 3: klør}

$Value = \min(10, (k  \mod  13) + 1)$

---

# 2 Kortbunke

Kortbunke: ArrayList

Funktion 'træk et kort':
- fjern øverste kort fra bunken
- returnér kortet

En dynamisk liste er bedst her
<small> -  man kunne også bruge en stack eller queue

---

# 3 Hænder

Alle spillere har en "hånd" som også er en dynamisk liste af kort

Dealeren har også en hånd, hvor det første kort er skjult indtil slutningen af runden (Showdown).

Vi kan derfor lave et **Interface** hvor dealer og spiller har hver sin implementering, men samme struktur.

---

# 4 Kort-handler

I virkelig Blackjack er dealeren både en spiller og den der håndterer kortene.

Vi vil gerne adskille de to ansvarsområder, derfor repræsenterer vi dealeren som endnu en spiller og skaber et nyt objekt, der kan håndtere kortene.


---
# 5 Playerinput

Vi identificerer alle de beslutninger en spiller kan lave på et vilkårligt tidspunkt

---

# 6 Game States

Spillet kan være i flere forskellige tilstande i løbet af eksekveringen. Først er vi i "start spil" tilstand, hvor kort bliver givet ud til alle spillerne (og dealeren) indtil alle har 2 kort.

1. Start nyt spil
2. Afvent spiller beslutning
3. Reagér på beslutning (og gå til 2 eller 4)
4. "Showdown"

Showdown sker, når alle spillere har valgt "stand" eller er "busted".
---

![[state_diagram.png]]
---

# Evaluator

Undervejs og til sidst bliver hænderne evalueret

EvaluateHand

EvaluateGame?

---

## Håndtering af Esser

Et es kan både tælle som 1 og som 11 point.

Hvis man har 10 point og derudover et es, får man blackjack (tæller som 11).
Hvis man har 20 point og derudover et es, får man blackjack (tæller som 1).

