Feature:  Como usuario quiero realizar un registro

  @Ejemplo1
  Scenario Outline: Verificar el registro del usuario
    Given La URL esta activa
    And el usuario da click en register
    When el usuario registra el <firstName>, <lastName>, <phone>, <email>
    And  el usuario ingresa mailing <addres>, <city>, <statusProvince>, <postalCode>, <country>
    And  el usuario ingresa user <userName>, <password>, <confirmPassword>
    And el usuario da click en el boton enviar
    Then se muestra el nombre del usuario <userName>
    Examples:
      | firstName | lastName | phone     | email              | addres    | city | statusProvince | postalCode | country | userName    | password    | confirmPassword |
      | Takeshi   | Hamano   | 951566544 | hamano@example.com | calle qqq | Lima | Lima           | 11111      | PERU    | takehamano1 | take123456. | take123456.     |
