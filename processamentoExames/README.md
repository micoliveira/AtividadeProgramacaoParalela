# Processamento de Exames

Exemplo em Java de polimorfismo e Segregacao de Interfaces (ISP).

## Polimorfismo

`Aprovavel` define o contrato `aprovar()`. `ExameDeSangue` e `RaioX` implementam
esse contrato, e `ProcessadorDeExames.processar(List<Aprovavel>)` percorre os
exames sem depender de suas classes concretas.

## Segregacao de Interfaces

As responsabilidades estao divididas entre `Atendente`, `Vendedor` e
`Comissionavel`. Assim, `Recepcionista` implementa somente `Atendente`, enquanto
`VendedorComissionado` implementa os contratos de venda e comissao.

## Executar

Com o JDK instalado, compile e execute a partir da raiz do projeto:

```sh
javac -d bin src/*.java
java -cp bin App
```
