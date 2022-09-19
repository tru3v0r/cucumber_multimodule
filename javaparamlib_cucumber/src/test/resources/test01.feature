# language: en
Feature: newCucumberStockManagementP

  Scenario Outline: newCucumberStockManagementP
    Given Je fais l'addition des valeurs CUF
    Then Le resultat est egale a la valeur du CUF RES
    And je verifie le jeu de donnee <INT> <FLOAT> <TEST> <BOOLEAN>

    @TEST1
    Examples:
      | BOOLEAN | FLOAT | INT | TEST |
      | "true" | 1.1 | 1 | "test" |