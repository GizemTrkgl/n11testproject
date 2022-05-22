@Test
Feature: n11 Page

  Scenario: n11 case
    Given Uygulama acilir
    When Arama motorunda "ayfone" kelimesi aratilir ve ara butonuna tiklanir
    Then Aranan kelimenin duzeltildigi ve sonuclarin ona gore geldigi gorulur
    When Ilk sayfadaki birinci urun secilir
    Then Urunlerin sepete eklendigi kontrol edilir
    When En ucuz urunun adedi 3 yapilir
    Then Satin Al butonuna tiklanir
    Then Uye olmadan devam et butonuna tiklanir
    When Yanlis mail girilir
    Then Gelen uyari konrol edilir

