package de.db.mosaik.timeconversion

import org.junit.Test

import org.junit.Assert.*

class TimeConversionServiceTest {

    /**
     * Aufgabe 1: Sorge dafür, dass folgender Testfall erfolgreich durchläuft.
     * Schreibe zunächst so wenig Code wie möglich um die Assertion zu erfüllen.
     */
    @Test
    fun test_5oClockInGermany_ShouldBe4oClockInBritain() {
        val service = TimeConversionService()
        val germanTime = PrimitiveTime(5)
        val actual = service.convertToEnglishTime(germanTime)
        assertEquals(PrimitiveTime(4), actual)
    }

    /**
     * Aufgabe 2: Definiere ein Beispiel, dass die 2. Anforderung erfüllt.
     * Implementiere anschließend den erforderlichen Business Code.
     * Anmerkung: PrimitiveTime darf für Englisch nur Werte zwischen 0 und 11 annehmen.
     */

    /**
     * Aufgabe 3: Definiere ein Beispiel, dass die 3. Anforderung erfüllt.
     * Implementiere anschließend den erforderlichen Business Code.
     * Anmerkung: für den Anwender ist der aktuelle Tag irrelevant.
     */
}
